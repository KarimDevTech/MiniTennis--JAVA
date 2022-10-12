
package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    public JPanel panel;
    TableroJuego fondo;
    private TableroJuego lamina;
    private Hilo hilo;
    private TableroJuego label1;
    public static JLabel etiqueta1;
    public static JLabel etiqueta2;
    

    
    public Ventana(){
        
        
        setTitle("Mini Tennis");
        setSize( 1200,900);
        setLocationRelativeTo(null);
        setResizable(false);
        lamina = new TableroJuego();
        add(lamina);
        addKeyListener(new EventoTeclado());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hilo = new Hilo(lamina);
        hilo.start();
        crearPanel();
        etiquetas();
        Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/iconoTenis.png"));
        setIconImage(logo);
    }
     public void crearPanel(){
        panel = new JPanel(); //creacion de panel
        //panel.setLayout(null);//desactivar el diseño p defecto
        panel.setBackground(Color.GRAY);//color del panel
        this.getContentPane().add(panel);//agregamos el panel creado a la ventana
    }
      public void etiquetas(){
        etiqueta1 = new JLabel();//creacion etiqueta
        etiqueta1.setForeground(Color.BLACK);//color de la letra
        etiqueta1.setFont(new Font("arial",Font.BOLD,40));
        etiqueta1.setText("0");
        
        etiqueta2 = new JLabel();//creacion etiqueta
        etiqueta2.setText("0");
        etiqueta2.setForeground(Color.BLACK);//color de la letra
        etiqueta2.setFont(new Font("arial",Font.BOLD,40));
        
        panel.add(etiqueta2);
        panel.add(etiqueta1);//agegamos la etiqueta al panel
    }
      
    
}
