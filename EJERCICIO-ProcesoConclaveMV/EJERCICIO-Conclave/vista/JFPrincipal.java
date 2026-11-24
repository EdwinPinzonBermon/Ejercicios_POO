package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.*;

public class JFPrincipal extends JFrame {
    // Panel superior
    private JPanel pSuperior;
    private JLabel lblLista, lblRonda;
    private JButton btnVotar;
    private JTextField txtNumeroRonda;
    private JComboBox<Cardenal> cbLista;

    // Panel central
    private JPanel pCentral;
    private JScrollPane jsResultados;
    private JTextArea areaResultados;

    // Panel inferior
    private JPanel pInferior;
    private JButton btnMostrar, btnSiguiente;

    // Modelo y control de votación
    private Conclave conclave;
    private ArrayList<Cardenal> electores;
    private int indiceElectorActual;

    public JFPrincipal() {
        conclave = new Conclave();
        electores = conclave.getElectores();
        indiceElectorActual = 0;

        setTitle("Votaciones Conclave");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponentes();
        agregarEventos();
        cargarCombo();
        actualizarEstadoInicial();
        setVisible(true);
    }

    public void initComponentes() {
        // Panel superior
        pSuperior = new JPanel();
        pSuperior.setLayout(new BoxLayout(pSuperior, BoxLayout.Y_AXIS));
        pSuperior.setBackground(Color.PINK);
        pSuperior.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel pFila1 = new JPanel();
        pFila1.setLayout(new BoxLayout(pFila1, BoxLayout.X_AXIS));
        pFila1.setBackground(Color.PINK);
        pFila1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        lblLista = new JLabel("Lista de cardenales");
        cbLista = new JComboBox<>();
        pFila1.add(lblLista);
        pFila1.add(Box.createRigidArea(new Dimension(20, 0)));
        pFila1.add(cbLista);

        JPanel pFila2 = new JPanel();
        pFila2.setLayout(new BoxLayout(pFila2, BoxLayout.X_AXIS));
        pFila2.setBackground(Color.PINK);
        pFila2.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        btnVotar = new JButton("Votar");
        lblRonda = new JLabel("Ronda No");
        txtNumeroRonda = new JTextField("0", 1);
        txtNumeroRonda.setMaximumSize(txtNumeroRonda.getPreferredSize());
        txtNumeroRonda.setEditable(false);
        pFila2.add(Box.createRigidArea(new Dimension(150, 0)));
        pFila2.add(btnVotar);
        pFila2.add(Box.createHorizontalGlue());
        pFila2.add(lblRonda);
        pFila2.add(txtNumeroRonda);

        pSuperior.add(pFila1);
        pSuperior.add(Box.createRigidArea(new Dimension(0, 10)));
        pSuperior.add(pFila2);

        // Panel central
        pCentral = new JPanel(new BorderLayout());
        pCentral.setBackground(Color.PINK);
        pCentral.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        areaResultados = new JTextArea();
        areaResultados.setEditable(false);
        jsResultados = new JScrollPane(areaResultados);
        jsResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));
        pCentral.add(jsResultados, BorderLayout.CENTER);

        // Panel inferior
        pInferior = new JPanel();
        pInferior.setLayout(new FlowLayout());
        pInferior.setBackground(Color.PINK);
        pInferior.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        btnMostrar = new JButton("Mostrar Resultados");
        btnSiguiente = new JButton("Siguiente Ronda");
        pInferior.add(btnMostrar);
        pInferior.add(Box.createRigidArea(new Dimension(10, 0)));
        pInferior.add(btnSiguiente);

        this.add(pSuperior, BorderLayout.NORTH);
        this.add(pCentral, BorderLayout.CENTER);
        this.add(pInferior, BorderLayout.SOUTH);
    }

    private void cargarCombo() {
        cbLista.removeAllItems();
        for (Cardenal c : conclave.getCardenalesDisponiblesParaVotar()) {
            cbLista.addItem(c);
        }
    }

    private void actualizarEstadoInicial() {
        txtNumeroRonda.setText(String.valueOf(conclave.getRondaActual().getNumero()));
        btnSiguiente.setEnabled(false);
        btnVotar.setEnabled(true);
        areaResultados.setText("Ronda " + conclave.getRondaActual().getNumero() + " iniciada.\n");
    }

    private void agregarEventos() {
        btnVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                votar();
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarResultados();
            }
        });

        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siguienteRonda();
            }
        });
    }

    private void votar() {
        if (conclave.isPapaElegido() || conclave.rondaCompleta()) {
            return;
        }
        Cardenal candidato = (Cardenal) cbLista.getSelectedItem();
        if (candidato == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un cardenal para votar.");
            return;
        }
        // Buscar el siguiente elector que no haya votado en esta ronda
        Cardenal elector = null;
        while (indiceElectorActual < electores.size()) {
            Cardenal posible = electores.get(indiceElectorActual);
            if (!conclave.getRondaActual().yaVoto(posible)) {
                elector = posible;
                break;
            }
            indiceElectorActual++;
        }
        if (elector == null) {
            // Ya no hay electores disponibles, la ronda debería estar completa
            actualizarBotonVotar();
            return;
        }
        boolean exito = conclave.registrarVoto(elector, candidato);
        if (exito) {
            areaResultados.append(elector.getNombre() + " votó por " + candidato.getNombre() + "\n");
            indiceElectorActual++;
            if (conclave.rondaCompleta()) {
                btnVotar.setEnabled(false);
                boolean hayPapa = conclave.verificarMayoria();
                if (hayPapa) {
                    areaResultados.append("\n¡HAY NUEVO PAPA!\n");
                    Cardenal papa = conclave.getPapaElegido();
                    areaResultados.append("Nombre: " + papa.getNombre() + "\n");
                    areaResultados.append("País: " + papa.getPais() + "\n");
                    areaResultados.append("Edad: " + papa.getEdad() + " años\n");
                    btnSiguiente.setEnabled(false);
                } else {
                    areaResultados.append("\nNo hay papa aún. Se requiere otra ronda.\n");
                    btnSiguiente.setEnabled(true);
                }
                mostrarConteoRonda();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar el voto.");
        }
        actualizarBotonVotar();
    }

    private void mostrarResultados() {
        areaResultados.setText(conclave.getResultadosRonda());
        if (conclave.rondaCompleta() && !conclave.isPapaElegido()) {
            btnSiguiente.setEnabled(true);
        }
        if (conclave.isPapaElegido()) {
            btnSiguiente.setEnabled(false);
            btnVotar.setEnabled(false);
        }
    }

    private void siguienteRonda() {
        if (conclave.isPapaElegido()) {
            return;
        }
        conclave.siguienteRonda();
        indiceElectorActual = 0;
        areaResultados.setText("");
        txtNumeroRonda.setText(String.valueOf(conclave.getRondaActual().getNumero()));
        btnVotar.setEnabled(true);
        btnSiguiente.setEnabled(false);
        areaResultados.append("Nueva ronda iniciada: Ronda " + conclave.getRondaActual().getNumero() + "\n");
    }

    private void actualizarBotonVotar() {
        if (conclave.isPapaElegido() || conclave.rondaCompleta()) {
            btnVotar.setEnabled(false);
        } else {
            btnVotar.setEnabled(true);
        }
    }

    private void mostrarConteoRonda() {
        areaResultados.append("\n--- Conteo de votos de la ronda ---\n");
        ArrayList<String> conteo = conclave.getRondaActual().getConteoVotos();
        for (String linea : conteo) {
            areaResultados.append(linea + "\n");
        }
        areaResultados.append("---------------------------------\n");
    }
}
