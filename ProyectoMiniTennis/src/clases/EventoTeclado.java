
package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class EventoTeclado extends KeyAdapter {
    static boolean w;
    static boolean s;
    static boolean a;
    static boolean d;
    static boolean up;
    static boolean down;
    static boolean left;
    static boolean rigth;
   
    @Override
    public void keyPressed (KeyEvent e){
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W){
            w=true;
        }
        if (id == KeyEvent.VK_S){
            s = true;
        }
        if (id == KeyEvent.VK_UP){
            up=true;
        }
        if (id ==KeyEvent.VK_DOWN){
            down=true;
        }
        if (id == KeyEvent.VK_A){
            a=true;
        }
        if (id == KeyEvent.VK_D){
            d=true;
        }
        if (id == KeyEvent.VK_LEFT){
            left=true;
        }
        if (id == KeyEvent.VK_RIGHT){
            rigth=true;
        }
    }
    
    @Override
    public void keyReleased (KeyEvent e){
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W){
            w=false;
        }
        if (id == KeyEvent.VK_S){
            s=false;
        }
        if (id == KeyEvent.VK_UP){
            up=false;
        }
        if (id ==KeyEvent.VK_DOWN){
            down=false;
        }
        if (id == KeyEvent.VK_A){
            a=false;
        }
        if (id == KeyEvent.VK_D){
            d=false;
        }
        if (id == KeyEvent.VK_LEFT){
            left=false;
        }
        if (id == KeyEvent.VK_RIGHT){
            rigth=false;
        }
    }
    
}
