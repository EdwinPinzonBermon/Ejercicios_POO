import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFAlcancia extends JFrame implements ActionListener{
    
    private Alcancia alcancia;
    private JPanel pPrincipal; 
    
    //Encabezado
    private JPanel pEncabezado;
    private JLabel lblTitulo, lblImagenCerdo, lblSaldo, lblSaldoDisponible;
    private ImageIcon iconoEscaladoCerdo;
    
    //Centro
    private  JPanel pCentro;
    private JLabel lblIngresarMonedas;
    
    private JPanel pBotones;
    private JButton btn50, btn100, btn200, btn500, btn1000;
    private JPanel pResumen;
    private JLabel lblMonedas50, lblMonedas100, lblMonedas200, lblMonedas500, lblMonedas1000, lblTotalMonedas;
    private JLabel lblCantMonedas50, lblCantMonedas100, lblCantMonedas200, lblCantMonedas500, lblCantMonedas1000, lblCantTotalMonedas;
    
    //Inferior
    private JPanel pInferior;
    
    private JPanel pBoton;
    private JButton btnVaciar;
    
    public JFAlcancia(){
        alcancia = new Alcancia();
        setTitle("Mi Alcancia - POO I");
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        
        crearInterfaz();
    }
    
    public void crearInterfaz(){
        pPrincipal = new JPanel();
        pPrincipal.setLayout(new BorderLayout(15,15));
        pPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        
        //Encabezado
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
        
        //Centro
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
        
        btn50.addActionListener(this);
        btn100.addActionListener(this);
        btn200.addActionListener(this);
        btn500.addActionListener(this);
        btn1000.addActionListener(this);
        
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
        
        lblCantMonedas50 = new JLabel(String.valueOf(alcancia.getMonedas50()));
        lblCantMonedas100 = new JLabel(String.valueOf(alcancia.getMonedas100()));
        lblCantMonedas200 = new JLabel(String.valueOf(alcancia.getMonedas200()));
        lblCantMonedas500 = new JLabel(String.valueOf(alcancia.getMonedas500()));
        lblCantMonedas1000 = new JLabel(String.valueOf(alcancia.getMonedas1000()));
        lblCantTotalMonedas = new JLabel(String.valueOf(alcancia.getTotalMonedas()));
        
        
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
        
        //Inferior
        pInferior = new JPanel(new BorderLayout(10,10));
        
        pBoton = new JPanel(new FlowLayout());
        pBoton.setAlignmentX(CENTER_ALIGNMENT);
        btnVaciar = new JButton("VACIAR ALCANCIA");
        btnVaciar.setBackground(Color.WHITE);
        btnVaciar.addActionListener(this);
        pBoton.add(btnVaciar);
        
        pInferior.add(pBoton, BorderLayout.CENTER);
        
        pPrincipal.add(pInferior, BorderLayout.SOUTH);
        
        this.add(pPrincipal);
    }
    
    public void actionPerformed(ActionEvent evento){
        String comando = evento.getActionCommand();
        
        if(comando.equals("$50")){
            alcancia.agregarMonedas(50);
            actualizarAlcancia();
        }
        else if(comando.equals("$100")){
            alcancia.agregarMonedas(100);
            actualizarAlcancia();
        }
        else if(comando.equals("$200")){
            alcancia.agregarMonedas(200);
            actualizarAlcancia();
        }
        else if(comando.equals("$500")){
            alcancia.agregarMonedas(500);
            actualizarAlcancia();
        }
        else if(comando.equals("$1000")){
            alcancia.agregarMonedas(1000);
            actualizarAlcancia();
        }
        else if(comando.equals("VACIAR ALCANCIA")){
            alcancia.vaciar();
            actualizarAlcancia();
            actualizarCerdo();
        }
        
    }
    
    public void actualizarCerdo(){
        ImageIcon icono = new ImageIcon("imagenes/rota.png");
        Image imagenEscalada = icono.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon iconoEscaladoRota = new ImageIcon(imagenEscalada); 
        lblImagenCerdo.setIcon(iconoEscaladoRota);
    }
    
    public void actualizarAlcancia() {
        lblImagenCerdo.setIcon(iconoEscaladoCerdo);
        lblSaldo.setText("$" + alcancia.getSaldo());
        lblCantMonedas50.setText(String.valueOf(alcancia.getMonedas50()));
        lblCantMonedas100.setText(String.valueOf(alcancia.getMonedas100()));
        lblCantMonedas200.setText(String.valueOf(alcancia.getMonedas200()));
        lblCantMonedas500.setText(String.valueOf(alcancia.getMonedas500()));
        lblCantMonedas1000.setText(String.valueOf(alcancia.getMonedas1000()));
        lblCantTotalMonedas.setText(String.valueOf(alcancia.getTotalMonedas()));
    }
}
