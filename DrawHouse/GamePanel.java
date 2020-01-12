import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
/**Class GamePanel draws the game elements.*/
public class GamePanel extends JPanel implements ActionListener {  
   
   GameRules gr = new GameRules();
   JButton button = new JButton("Roll the Dice"); //creates a button with text "Roll the Dice"
   
   private final int w = 800; //width of the panel
   private final int h = 600; //height of the panel
   private int a = 100; //square's edge
   private int y = 50; //the position of dice's top edge
   private int count = 0; 
   
   /**paintComponent paints the panel and adds the button.*/
   public void paintComponent(Graphics g) {
   
      g.setFont(new Font("Consolas", Font.PLAIN, 12)); 
      g.setColor(Color.pink);
      g.fillRect(0,0,w,h); //the pink background
      
      //draws a white square with a black border
      g.setColor(Color.white);
      g.fillRect((w - a)/2,y,a,a);
      g.setColor(Color.black);
      g.drawRect((w - a)/2,y,a,a);
      
      //prevents the game to start without clicking the button
      if(count > 1) {
         gr.checkProgress(g);
         g.setFont(new Font("Arial", Font.PLAIN, 16)); 
         g.drawString(gr.text,(w-gr.text.length()*6)/2,h-a/2);
      }
      
      else { 
         g.setFont(new Font("Arial", Font.PLAIN, 16)); 
         g.drawString(gr.text,(w-gr.text.length()*6)/2,h-a/2);
      }

      add(button); //adds the button
      button.addActionListener(this); //adds functionality to the button
      count++;
   }

   /**actionPerformed allows the user to repaint the panel by clicking the button.*/
   public void actionPerformed(ActionEvent e) {
   
      repaint();
   
   }
   
}