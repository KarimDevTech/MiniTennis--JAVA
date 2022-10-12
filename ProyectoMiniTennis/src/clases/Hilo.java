//clase responsable de actualizar constatemente el moviemiento de la pelota y las raquetas
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Hilo extends Thread{

    TableroJuego lamina;
    public Hilo(TableroJuego lamina){
        this.lamina = lamina;
    }
    
    @Override
    public void run(){
        while(true){
            lamina.repaint();
            try {
                Thread.sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
