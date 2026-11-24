package vista;
import javax.swing.*;
import java.awt.*;

public class JFAlcancia extends JFrame {

    private JPanel pPrincipal; 
    private JPanel pEncabezado;
    private JLabel lblTitulo, lblImagenCerdo, lblSaldo, lblSaldoDisponible;
    private ImageIcon iconoEscaladoCerdo;
    private  JPanel pCentro;
    private JLabel lblIngresarMonedas;
    private JPanel pBotones;
    private JButton btn50, btn100, btn200, btn500, btn1000;
    private JPanel pResumen;
    private JLabel lblMonedas50, lblMonedas100, lblMonedas200, lblMonedas500, lblMonedas1000, lblTotalMonedas;
    private JLabel lblCantMonedas50, lblCantMonedas100, lblCantMonedas200, lblCantMonedas500, lblCantMonedas1000, lblCantTotalMonedas;
    private JPanel pInferior;
    private JPanel pBoton;
    private JButton btnVaciar;

    public JFAlcancia(){
        setTitle("Mi Alcancia - POO I");
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        crearInterfaz();
    }

    public void crearInterfaz(){
        pPrincipal = new JPanel();
        pPrincipal.setLayout(new BorderLayout(15,15));
        pPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        pEncabezado = new JPanel();
        pEncabezado.setLayout(new BoxLayout(pEncabezado,BoxLayout.Y_AXIS));

        lblTitulo = new JLabel("MI ALCANCIA");
        lblTitulo.setFont(new Font("Times New Roman",Font.BOLD,30));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        ImageIcon icono = new ImageIcon("imagenes/cerdo.png");
        Image imagenEscalada = icono.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        iconoEscaladoCerdo = new ImageIcon(imagenEscalada); 
        lblImagenCerdo = new JLabel(iconoEscaladoCerdo);
        lblImagenCerdo.setAlignmentX(Component.CENTER_ALIGNMENT);

        lblSaldo = new JLabel("$0");
        lblSaldo.setFont(new Font("Times New Roman",Font.BOLD,40));
        lblSaldo.setAlignmentX(Component.CENTER_ALIGNMENT);

        lblSaldoDisponible = new JLabel("Saldo disponible");
        lblSaldoDisponible.setAlignmentX(Component.CENTER_ALIGNMENT);

        pEncabezado.add(lblImagenCerdo);
        pEncabezado.add(lblTitulo);
        pEncabezado.add(lblSaldo);
        pEncabezado.add(lblSaldoDisponible);

        pPrincipal.add(pEncabezado, BorderLayout.NORTH);

        pCentro = new JPanel();
        pCentro.setLayout(new BoxLayout(pCentro,BoxLayout.Y_AXIS));

        lblIngresarMonedas = new JLabel("INGRESAR MONEDAS");
        lblIngresarMonedas.setFont(new Font("Times New Roman",Font.BOLD,20));
        lblIngresarMonedas.setAlignmentX(Component.CENTER_ALIGNMENT);

        pCentro.add(lblIngresarMonedas, BorderLayout.NORTH);

        pBotones = new JPanel(new FlowLayout(FlowLayout.CENTER,8,12));
        btn50 = new JButton("$50");
        btn100= new JButton("$100");
        btn200 = new JButton("$200");
        btn500 = new JButton("$500");
        btn1000 = new JButton("$1000");

        btn50.setBackground(Color.WHITE);
        btn100.setBackground(Color.WHITE);
        btn200.setBackground(Color.WHITE);
        btn500.setBackground(Color.WHITE);
        btn1000.setBackground(Color.WHITE);

        pBotones.add(btn50);
        pBotones.add(btn100);
        pBotones.add(btn200);
        pBotones.add(btn500);
        pBotones.add(btn1000);

        pCentro.add(pBotones, BorderLayout.SOUTH);

        pResumen = new JPanel();
        pResumen.setLayout(new GridLayout(6,2,5,5));
        pResumen.setBorder(BorderFactory.createTitledBorder("Resumen de la alcancia"));

        lblMonedas50 = new JLabel("Monedas de $50:");
        lblMonedas50.setFont(new Font("Times New Roman",Font.BOLD,13));
        lblMonedas100 = new JLabel("Monedas de $100:");
        lblMonedas100.setFont(new Font("Times New Roman",Font.BOLD,13));
        lblMonedas200 = new JLabel("Monedas de $200:");
        lblMonedas200.setFont(new Font("Times New Roman",Font.BOLD,13));
        lblMonedas500 = new JLabel("Monedas de $500:");
        lblMonedas500.setFont(new Font("Times New Roman",Font.BOLD,13));
        lblMonedas1000 = new JLabel("Monedas de $1000:");
        lblMonedas1000.setFont(new Font("Times New Roman",Font.BOLD,13));
        lblTotalMonedas = new JLabel("TOTAL DE MONEDAS:");
        lblTotalMonedas.setFont(new Font("Times New Roman",Font.BOLD,13));

        lblCantMonedas50 = new JLabel("0");
        lblCantMonedas100 = new JLabel("0");
        lblCantMonedas200 = new JLabel("0");
        lblCantMonedas500 = new JLabel("0");
        lblCantMonedas1000 = new JLabel("0");
        lblCantTotalMonedas = new JLabel("0");

        pResumen.add(lblMonedas50);
        pResumen.add(lblCantMonedas50); 
        pResumen.add(lblMonedas100);
        pResumen.add(lblCantMonedas100);
        pResumen.add(lblMonedas200);
        pResumen.add(lblCantMonedas200);
        pResumen.add(lblMonedas500);
        pResumen.add(lblCantMonedas500);
        pResumen.add(lblMonedas1000);
        pResumen.add(lblCantMonedas1000);
        pResumen.add(lblTotalMonedas);
        pResumen.add(lblCantTotalMonedas);

        pCentro.add(pResumen, BorderLayout.SOUTH);

        pPrincipal.add(pCentro, BorderLayout.CENTER);

        pInferior = new JPanel(new BorderLayout(10,10));

        pBoton = new JPanel(new FlowLayout());
        pBoton.setAlignmentX(CENTER_ALIGNMENT);
        btnVaciar = new JButton("VACIAR ALCANCIA");
        btnVaciar.setBackground(Color.WHITE);
        pBoton.add(btnVaciar);

        pInferior.add(pBoton, BorderLayout.CENTER);

        pPrincipal.add(pInferior, BorderLayout.SOUTH);

        this.add(pPrincipal);
    }

    public JPanel getPPrincipal() {
        return pPrincipal;
    }

    public JPanel getPEncabezado() {
        return pEncabezado;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public JLabel getLblImagenCerdo() {
        return lblImagenCerdo;
    }

    public JLabel getLblSaldo() {
        return lblSaldo;
    }

    public JLabel getLblSaldoDisponible() {
        return lblSaldoDisponible;
    }

    public ImageIcon getIconoEscaladoCerdo() {
        return iconoEscaladoCerdo;
    }

    public JPanel getPCentro() {
        return pCentro;
    }

    public JLabel getLblIngresarMonedas() {
        return lblIngresarMonedas;
    }

    public JPanel getPBotones() {
        return pBotones;
    }

    public JButton getBtn50() {
        return btn50;
    }

    public JButton getBtn100() {
        return btn100;
    }

    public JButton getBtn200() {
        return btn200;
    }

    public JButton getBtn500() {
        return btn500;
    }

    public JButton getBtn1000() {
        return btn1000;
    }

    public JPanel getPResumen() {
        return pResumen;
    }

    public JLabel getLblMonedas50() {
        return lblMonedas50;
    }

    public JLabel getLblMonedas100() {
        return lblMonedas100;
    }

    public JLabel getLblMonedas200() {
        return lblMonedas200;
    }

    public JLabel getLblMonedas500() {
        return lblMonedas500;
    }

    public JLabel getLblMonedas1000() {
        return lblMonedas1000;
    }

    public JLabel getLblTotalMonedas() {
        return lblTotalMonedas;
    }

    public JLabel getLblCantMonedas50() {
        return lblCantMonedas50;
    }

    public JLabel getLblCantMonedas100() {
        return lblCantMonedas100;
    }

    public JLabel getLblCantMonedas200() {
        return lblCantMonedas200;
    }

    public JLabel getLblCantMonedas500() {
        return lblCantMonedas500;
    }

    public JLabel getLblCantMonedas1000() {
        return lblCantMonedas1000;
    }

    public JLabel getLblCantTotalMonedas() {
        return lblCantTotalMonedas;
    }

    public JPanel getPInferior() {
        return pInferior;
    }

    public JPanel getPBoton() {
        return pBoton;
    }

    public JButton getBtnVaciar() {
        return btnVaciar;
    }
}