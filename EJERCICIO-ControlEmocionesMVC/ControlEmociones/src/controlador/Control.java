package controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import vista.*;
import modelo.*;

public class Control implements ActionListener {

    private JFGestion vistaGestor;
    private Gestor modeloGestor;
    private JPEmocion pEmocion;
    private JPEnlistar pEnlistar;
    private JPEvento pEvento;
    private JPRecuerdo pRecuerdo;
    private JPResumen pResumen;

    public Control(JFGestion vistaGestor, Gestor modeloGestor) {
        this.vistaGestor = vistaGestor;
        this.modeloGestor = modeloGestor;

        pEmocion = new JPEmocion();
        pRecuerdo = new JPRecuerdo();
        pEvento = new JPEvento();
        pEnlistar = new JPEnlistar();
        pResumen = new JPResumen();

        vistaGestor.getBtnEmocion().addActionListener(this);
        vistaGestor.getBtnRecuerdo().addActionListener(this);
        vistaGestor.getBtnEvento().addActionListener(this);
        vistaGestor.getBtnListarRecuerdos().addActionListener(this);
        vistaGestor.getBtnEmocionMas().addActionListener(this);
        vistaGestor.getBtnMasFuerte().addActionListener(this);
        vistaGestor.getBtnLista5().addActionListener(this);
        pEmocion.getBtnAgregar().addActionListener(this);
        pRecuerdo.getBtnAgregar().addActionListener(this);
        pEvento.getBtnAgregar().addActionListener(this);
        pEnlistar.getBtnEnlistar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (source == vistaGestor.getBtnEmocion()) {
            vistaGestor.reemplazarPanelCentral(pEmocion);
        } else if (source == vistaGestor.getBtnRecuerdo()) {
            vistaGestor.reemplazarPanelCentral(pRecuerdo);
        } else if (source == vistaGestor.getBtnEvento()) {
            vistaGestor.reemplazarPanelCentral(pEvento);
        } else if (source == vistaGestor.getBtnListarRecuerdos()) {
            vistaGestor.reemplazarPanelCentral(pEnlistar);
        } else if (source == vistaGestor.getBtnEmocionMas()) {
            vistaGestor.reemplazarPanelCentral(pResumen);
            getEstadoEmocional();
        } else if (source == vistaGestor.getBtnMasFuerte()) {
            vistaGestor.reemplazarPanelCentral(pResumen);
            getEmocionMasIntensa();
        } else if (source == vistaGestor.getBtnLista5()) {
            vistaGestor.reemplazarPanelCentral(pResumen);
            listarUltimos5Recuerdos();
        } else if (source == pEmocion.getBtnAgregar()) {
            agregarEmocion();
        } else if (source == pRecuerdo.getBtnAgregar()) {
            agregarRecuerdo();
        } else if (source == pEvento.getBtnAgregar()) {
            agregarEvento();
        } else if (source == pEnlistar.getBtnEnlistar()) {
            listarRecuerdos();
        }
    }

    private void agregarEmocion() {
        String nombre = pEmocion.getTxtNombre().getText().trim();
        String accion = pEmocion.getTxtAccion().getText().trim();
        String estado = pEmocion.getTxtEstado().getText().trim();
        if (nombre.isEmpty() || accion.isEmpty() || estado.isEmpty()) {
            pEmocion.getCampoTexto().setText("Debe completar todos los campos");
            return;
        }

        int intensidad;
        try {
            intensidad = Integer.parseInt(pEmocion.getTxtIntensidad().getText().trim());
        } catch (NumberFormatException ex) {
            pEmocion.getCampoTexto().setText("La intensidad debe ser un numero entero");
            return;
        }
        String tipo = (String) pEmocion.getCbTipo().getSelectedItem();

        Emocion emocion = new Emocion(nombre, intensidad, tipo, accion, estado);
        if (modeloGestor.agregarEmocion(emocion)) {
            pRecuerdo.getCbEmociones().addItem(emocion);
            pEvento.getCbEmocion().addItem(emocion);
            pEnlistar.getCbEmocion().addItem(emocion);
            pEmocion.getCampoTexto().setText("Emocion creada correctamente");
            pEmocion.limpiarCamposEmocion();
        } else {
            pEmocion.getCampoTexto().setText("Esta emocion ya existe");
        }
    }

    private void agregarRecuerdo() {
        if (pRecuerdo.getCbEmociones().getItemCount() == 0) {
            pRecuerdo.getCampoTexto().setText("No hay emociones registradas, no puede agregar un recuerdo");
            return;
        }
        if (pRecuerdo.getCbEventos().getItemCount() == 0) {
            pRecuerdo.getCampoTexto().setText("No hay eventos registrados, no puede agregar un recuerdo");
            return;
        }

        String descripcion = pRecuerdo.getTxtDescripcion().getText().trim();
        String fecha = pRecuerdo.getTxtFecha().getText().trim();
        if (descripcion.isEmpty() || fecha.isEmpty()) {
            pRecuerdo.getCampoTexto().setText("Debe completar todos los campos");
            return;
        }
        Emocion emocion = (Emocion) pRecuerdo.getCbEmociones().getSelectedItem();
        Evento evento = (Evento) pRecuerdo.getCbEventos().getSelectedItem();

        Recuerdo recuerdo = new Recuerdo(emocion, descripcion, fecha, evento);
        if (modeloGestor.agregarRecuerdo(recuerdo)) {
            pRecuerdo.getCampoTexto().setText("Recuerdo agregado correctamente");
            pRecuerdo.limpiarCamposRecuerdo();
        } else {
            pRecuerdo.getCampoTexto().setText("Este recuerdo ya existe");
        }
    }

    private void agregarEvento() {
        if (pEvento.getCbEmocion().getItemCount() == 0) {
            pEvento.getCampoTexto().setText("No hay emociones registradas, no puede agregar un evento");
            return;
        }

        String nombre = pEvento.getTxtNombre().getText().trim();
        if (nombre.isEmpty()) {
            pEvento.getCampoTexto().setText("Debe completar todos los campos");
            return;
        }
        String tipo = (String) pEvento.getCbTipo().getSelectedItem();
        Emocion emocion = (Emocion) pEvento.getCbEmocion().getSelectedItem();
        String tipoCambio = (String) pEvento.getCbTipoCambio().getSelectedItem();

        int nivelCambio;
        try {
            nivelCambio = Integer.parseInt(pEvento.getTxtNivelCambio().getText().trim());
        } catch (NumberFormatException ex) {
            pEvento.getCampoTexto().setText("El nivel de cambio debe ser un numero entero");
            return;
        }

        Evento evento = new Evento(nombre, tipo, emocion, nivelCambio, tipoCambio);
        if (modeloGestor.agregarEvento(evento)) {
            pEvento.getCampoTexto().setText("Evento agregado correctamente");
            pRecuerdo.getCbEventos().addItem(evento);
            pEvento.limpiarCamposEvento();
        } else {
            pEvento.getCampoTexto().setText("Este evento ya existe");
        }
    }

    private void listarRecuerdos() {
        if (pEnlistar.getCbEmocion().getItemCount() == 0) {
            pEnlistar.getCampoTexto().setText("No hay emociones registradas");
            return;
        }
        pEnlistar.getCampoTexto().setText(modeloGestor.listarRecuerdos((Emocion) pEnlistar.getCbEmocion().getSelectedItem()));
    }

    private void getEstadoEmocional() {
        pResumen.getCampoResumen().setText("");
        double felicidad = modeloGestor.calcularPromedio();
        if (felicidad < 2.5) {
            pResumen.getCampoResumen().setText("Ryley esta Triste, nivel de Felicidad: " + felicidad);
        } else if (felicidad >= 2.5 && felicidad < 5.0) {
            pResumen.getCampoResumen().setText("Ryley esta Ansiosa, nivel de Felicidad: " + felicidad);
        } else if (felicidad >= 5.0 && felicidad < 7.5) {
            pResumen.getCampoResumen().setText("Ryley esta Neutral, nivel de Felicidad: " + felicidad);
        } else if (felicidad >= 7.5) {
            pResumen.getCampoResumen().setText("Ryley esta Feliz , nivel de Felicidad: " + felicidad);
        }
    }

    private void getEmocionMasIntensa() {
        if(modeloGestor.hallarEmocionMasIntensa()==null){
            pResumen.getCampoResumen().setText("No hay emociones registrados");
            return;
        }
        Emocion emocion = modeloGestor.hallarEmocionMasIntensa();
        pResumen.getCampoResumen().setText("La emocion mas intensa en este momento es: " + emocion + "\n"
                + "Con una intensidad de : " + emocion.getIntensidad());
    }

    private void listarUltimos5Recuerdos() {
        if (modeloGestor.enlistarUltimos5Recuerdos().isEmpty()) {
            pResumen.getCampoResumen().setText("No hay recuerdos registrados");
            return;
        }

        pResumen.getCampoResumen().setText(modeloGestor.enlistarUltimos5Recuerdos());
    }
}
