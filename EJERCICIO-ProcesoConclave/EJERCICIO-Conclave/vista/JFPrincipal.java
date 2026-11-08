package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class JFPrincipal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JFPrincipal extends JFrame
{
    //Panel superior
    private JPanel pSuperior;
    private JLabel lblLista, lblRonda;
    private JButton btnVotar;
    private JTextField txtNumeroRonda;
    private JComboBox cbLista;
        
    //Panel central
    private JPanel pCentral;
    private JScrollPane jsResultados;
    private JTextArea areaResultados;
    
    //Panel inferior
    private JPanel pInferior;
    private JButton btnMostrar, btnSiguiente;
        
    public JFPrincipal(){
        setTitle("Votaciones Conclave");
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponentes();
        agregarEventos();
        setVisible(true);
    }
    
    public void initComponentes(){   
        //Panel superior
        pSuperior = new JPanel();
        pSuperior.setLayout(new BoxLayout(pSuperior, BoxLayout.Y_AXIS));
        pSuperior.setBackground(Color.PINK);
        pSuperior.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        
        JPanel pFila1 = new JPanel();
        pFila1.setLayout(new BoxLayout(pFila1, BoxLayout.X_AXIS));
        pFila1.setBackground(Color.PINK);
        pFila1.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        lblLista = new JLabel("Lista de cardenales");
        cbLista = new JComboBox<>();
        pFila1.add(lblLista);
        pFila1.add(Box.createRigidArea(new Dimension(20, 0)));
        pFila1.add(cbLista);
        
        JPanel pFila2 = new JPanel();
        pFila2.setLayout(new BoxLayout(pFila2, BoxLayout.X_AXIS));
        pFila2.setBackground(Color.PINK);
        pFila2.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        btnVotar = new JButton("Votar");
        lblRonda = new JLabel("Ronda No");
        txtNumeroRonda = new JTextField("0",1);
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
        
        //Panel central
        pCentral = new JPanel(new BorderLayout());
        pCentral.setBackground(Color.PINK);
        pCentral.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        areaResultados = new JTextArea();
        areaResultados.setEditable(false);
        jsResultados = new JScrollPane(areaResultados);
        jsResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));
        pCentral.add(jsResultados, BorderLayout.CENTER);
        
        //Panel inferior
        pInferior = new JPanel();
        pInferior.setLayout(new FlowLayout());
        pInferior.setBackground(Color.PINK);
        pInferior.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        btnMostrar = new JButton("Mostrar Resultados");
        btnSiguiente = new JButton("Siguiente Ronda");
        pInferior.add(btnMostrar);
        pInferior.add(Box.createRigidArea(new Dimension(10,0)));
        pInferior.add(btnSiguiente);
        
        this.add(pSuperior, BorderLayout.NORTH);
        this.add(pCentral, BorderLayout.CENTER);
        this.add(pInferior, BorderLayout.SOUTH);
    }
    
    private void agregarEventos(){
        
    }

  
}