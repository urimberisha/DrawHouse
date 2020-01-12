import java.awt.*;
/**DrawHouse has all the methods to draw the house.*/
public class DrawHouse
{
   //the top left corner coordinates where the house gets drawn
   private int x=200; 
   private int y=200;
   
   private int j=15; //space between drawStrings
   
   /**drawHouse(int z, Graphics g) draws the house part based on the value of parameter z*/
   public void drawHouse(int z, Graphics g) {
   
      switch(z) {
      
         case 1: {
         
            g.drawString("                    _                      ",x,y+j*9);
            g.drawString("                   ___                     ",x,y+j*10);
            g.drawString("                  _____                    ",x,y+j*11);
            g.drawString("                 _______                   ",x,y+j*12);
            g.drawString("               XXXXXXXXXX                  ",x,y+j*13);
            g.drawString("              _I_II  I__I_                 ",x,y+j*14);
            g.drawString("               I_I|  I__I_____[]_|_[]_____I",x,y+j*15);
            g.drawString("               I_II  I__I_____[]_|_[]_____I",x,y+j*16);
            g.drawString("               I II__I  I     XXXXXXX     I",x,y+j*17);
         
         } break;
         
         case 2: {
         
            g.drawString("                    ________[_]________         ",x,y+j*7);
            g.drawString("                   /\\                  \\      ",x,y+j*8);
            g.drawString("                  // \\                  \\     ",x,y+j*9);
            g.drawString("                 //   \\                  \\    ",x,y+j*10);
            g.drawString("                //     \\                  \\   ",x,y+j*11);
            g.drawString("               //       \\                  \\  ",x,y+j*12);
            g.drawString("              /          \\                  \\ ",x,y+j*13);
            g.drawString("             /            \\__________________\\",x,y+j*14); 
                    
         } break;
         
         case 3: {
         
            g.drawString("                             ______      ",x,y+j*8);
            g.drawString("                             \\    /\\   ",x,y+j*9);
            g.drawString("                              \\__/  \\  ",x,y+j*10);
            g.drawString("                               \\ |[]|   ",x,y+j*11);
            g.drawString("                                \\|__|   ",x,y+j*12);         
         
         } break;
         
         case 4: {

            g.drawString("                           (   ) ",x,y);
            g.drawString("                          (    ) ",x,y+j*1);
            g.drawString("                           (    )",x,y+j*2);
            g.drawString("                          (    ) ",x,y+j*3);
            g.drawString("                            )  ) ",x,y+j*4);
            g.drawString("                           (  (  ",x,y+j*5);
            g.drawString("                            (_)  ",x,y+j*6);
         
         } break;
         
         case 5: {

            g.drawString("            ~~~~~\"   \"~~~~~~~~~~~~~~~~~~~~~~~~",x,y+j*18);
         
         } break;
         
         case 6: {

            g.drawString("                                                 /\\            ",x,y+j*5);
            g.drawString("                                                /  \\  /\\      ",x,y+j*6);
            g.drawString("                                             /\\/    \\/  \\    ",x,y+j*7);
            g.drawString("           /\\                               /   /\\/\\  /\\/\\ ",x,y+j*8);
            g.drawString("          /  \\                             /\\/\\/    \\/    \\",x,y+j*9);
            g.drawString("   /\\    / /\\/\\                           /                  ",x,y+j*10);
            g.drawString("  /  \\  /\\/    \\                                             ",x,y+j*11);
            g.drawString(" /\\/\\/\\/                                                     ",x,y+j*12);
            g.drawString("/      \\                                                       ",x,y+j*13);
            g.drawString("        \\                                                      ",x,y+j*14);
         
         } break;
         
         default: {
         System.out.println("Enter a value from 1-6");
         } break;
      
      }
   
   }
}