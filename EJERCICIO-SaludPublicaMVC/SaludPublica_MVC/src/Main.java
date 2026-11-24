/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import modelo.*;
import vista.*;
import controlador.*;

/**
 *
 * @author edwin
 */

public class Main {
    public static void main(String[] args) {
        Gestor modelo = new Gestor();
        JFPrincipal vista = new JFPrincipal();
        Control controlador = new Control(modelo, vista);
        vista.setVisible(true);
    }
}
