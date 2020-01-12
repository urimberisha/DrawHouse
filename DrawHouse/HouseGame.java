import javax.swing.*;
import java.awt.*;
/**HouseGame draws a house part based on the number rolled by dice.*/
public class HouseGame {
   
   private final int w = 800; //width
   private final int h = 600; //height 
   
   /**Construtor HouseGame() creates the frame and shows the GamePanel contents.*/
   public HouseGame() {
   
   JFrame frame = new JFrame("Draw House Game");
   GamePanel panel = new GamePanel();
   
   frame.setSize(w+16,h+39); //size of the whole window
   frame.getContentPane().add(panel); //inserts the panel into the frame
   frame.setLocationRelativeTo(null); //opens the window in the center of the screen 
   frame.setResizable(false); //makes the window non-resizable
   frame.setVisible(true);
   
   //fixes a bug we could not fix in some other way
   frame.setExtendedState(1); 
   frame.setExtendedState(0);
   
   }
   
   
   public static void main(String[] args) {
   
      new HouseGame();
      
   }
}