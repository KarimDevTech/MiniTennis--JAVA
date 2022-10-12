package clases;


import static clases.Ventana.etiqueta1;
import static clases.Ventana.etiqueta2;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pelota {

    public static int x;
    public static int y;
    private int dx = 1;
    private int dy = 1;
    private final int ancho = 25;
    private final int alto = 25;
    public String contador1 = " ";
    public String contador2 = " ";
    public int valor1 = 1;
    public int valor2= 1;

    public int getY() {
        return y;
    }
    public Pelota() {
        
    }
    public Pelota(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ellipse2D getPelota() {
        return new Ellipse2D.Double(x, y, ancho, alto);
    }

    public void mover(Rectangle limites, boolean colisionR1, boolean colisionR2) throws InterruptedException {
        x += dx;
        y+=dy;
        Ventana.etiqueta1.setBounds(340, 250, 150, 30);
        Ventana.etiqueta2.setBounds(800, 250, 150, 30);
        
        
        if(x>limites.getMaxX()-240){
            x = 600;
            y =600;
            Ventana.etiqueta1.setText(contador1+ valor1);
            if(valor1 == 7){
                JOptionPane.showMessageDialog(null, "FIN DEL JUEGO\nGANÓ EL JUGADOR 1");
                valor2 =0;
                valor1 =0;
            }
            valor1++;
            

        }
        if(y>limites.getMaxY()-100){ 
            dy=-dy;
        }
        if(x<200){
            x = 600;
            y =600;
            Ventana.etiqueta2.setText(contador2+ valor2);
            if(valor2 == 7){
                JOptionPane.showMessageDialog(null,"FIN DEL JUEGO\nGANÓ EL JUGADOR 2");
                valor2 =0;
                valor1 =0;
            }
            valor2++;
            

        }
         if(y<340){
            dy=-dy;
        }
         
         
        if(colisionR1){
            
            dx=-dx;
            x= x +20;
            
            
        }
        if(colisionR2){
            dx=-dx;
            x= x -20;
            
            
            
        }
    }
}
