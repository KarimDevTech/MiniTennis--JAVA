
package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TableroJuego extends JPanel{
    Pelota pelota = new Pelota(600, 600);
    Raqueta r1= new Raqueta(220, 525);
    Raqueta r2= new Raqueta(940, 525);
    Etiquetas label1= new Etiquetas();
    public static Image imagen;
    

   
    
    
     @Override
     public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagenes/cancha2.jpg")).getImage();
        g.drawImage(imagen,140,300,889,518,this);
        setOpaque(false);
        super.paint(g);
    }
   
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.GREEN);
        dibujar(g2);
        try {
            actualizar();
        } catch (InterruptedException ex) {
            Logger.getLogger(TableroJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public void dibujar(Graphics2D g){
        g.fill(pelota.getPelota());
        g.fill(r1.getRaqueta());
        g.fill(r2.getRaqueta());
        
        
    }
    public void actualizar() throws InterruptedException{
        
        pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()));
        r1.moverR1(getBounds());
        r2.moverR2(getBounds());
        
       
    }
    private boolean colision(Rectangle2D r){
        return pelota.getPelota().intersects(r);
    }
}
