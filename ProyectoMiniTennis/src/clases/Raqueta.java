
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public class Raqueta {
   private int x;
   private int y ;
   static final int ancho=10, alto= 70;
    
   public Raqueta() {
 
    }
    public Raqueta(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
   public Rectangle2D getRaqueta(){
       return new Rectangle2D.Double(x, y, ancho, alto);
   }
   public void moverR1(Rectangle limites){
       
       int bot = Pelota.y;
       int botx = Pelota.x; 
       if(bot > 500 ){
        y++;
        y++;
             if(y>limites.getMinY()+300){
                y--;
                y--;
             }
             if(y<limites.getMaxY()-112){
                y++;
                y++;
             }
        }
     if(bot<500){
      y--;
             if(y>limites.getMinY()+300){
                y--;
                y--;
             }
             if(y<limites.getMaxY()-112){
                y++;
                y++;
             }
      }
        
        
        
        
    
       
    
    
    
    
    
    
      
        if(botx>600 ){
         x++;
             if(x>limites.getMaxX()-613){
                x--;
             }
             if(x<limites.getMinX()+200){
                x++;
             }
        }
        if(botx<600){
         x--;
         if(x>limites.getMaxX()-613){
                x--;
             }
             if(x<limites.getMinX()+200){
                x++;
             }
         }

       
           
       if(EventoTeclado.w == true && y>limites.getMinY()+300){ 
           y--;
           y--;
       }
       if(EventoTeclado.s == true&& y<limites.getMaxY()-112){
           y++;
           y++;
       }
       if(EventoTeclado.a == true && x>limites.getMinX()+140){
           x--;
           x--;
       }
       if(EventoTeclado.d == true&& x<limites.getMaxX()-613){
           x++;
           x++;
       }
   }
   public void moverR2(Rectangle limites){
        if(EventoTeclado.up == true && y>limites.getMinY()+300){
           y--;
           y--;
        }
        if(EventoTeclado.down == true&& y <limites.getMaxY()-112){
           y++;
           y++;
        }
        if(EventoTeclado.left == true && x>limites.getMinX()+588){
           x--;
           x--;
       }
       if(EventoTeclado.rigth == true&& x<limites.getMaxX()-170){
           x++;
           x++;
       }
    }
}
