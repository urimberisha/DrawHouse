import java.awt.*;
/**DrawDice draws the circles to represent each dice case.*/
public class DrawDice {

   private int d = 15; //diameter of the circles
   private int w = 800; //width of the panel
   private int a = 100; //square's edge
   private int x = (w-a)/2; //x-coordinate of top-left corner of the dice
   
   /**drawDice(int z, Graphics g) draws the circles of the dice based on the value of parameter z*/
   
   public void drawDice(int z, Graphics g) {
   
      switch(z) {
      
         case 1: {
            g.fillOval((w-d)/2,a-d/2,d,d);
         } break;
         
         case 2: {
            g.fillOval(x+20,a+d,d,d);
            g.fillOval(x+a-(d+20),a/2+20,d,d);
         } break;
         
         case 3: {
            g.fillOval(x+20,a+d,d,d);
            g.fillOval(x+(a-d)/2,a-d/2,d,d);
            g.fillOval(x+a-(d+20),a/2+20,d,d);         
         } break;
         
         case 4: {
            g.fillOval(x+20,a+d,d,d);
            g.fillOval(x+20,a/2+20,d,d);
            g.fillOval(x+a-(d+20),a+d,d,d); 
            g.fillOval(x+a-(d+20),a/2+20,d,d);          
         } break;
         
         case 5: {
            g.fillOval(x+20,a+15,d,d);
            g.fillOval(x+20,a/2+20,d,d);
            g.fillOval(x+a-(d+20),a+d,d,d);
            g.fillOval(x+(a-d)/2,a-d/2,d,d); 
            g.fillOval(x+a-(d+20),a/2+20,d,d);
         } break;
         
         case 6: {
            g.fillOval(x+20,a+d,d,d);
            g.fillOval(x+20,a-d/2,d,d);
            g.fillOval(x+20,a/2+20,d,d);
            g.fillOval(x+a-(d+20),a+d,d,d);
            g.fillOval(x+a-(d+20),a-d/2,d,d);
            g.fillOval(x+a-(d+20),a/2+20,d,d);
         } break;
         
         default: {
         System.out.println("Enter a value from 1-6.");
         }
         
      }
   }
}