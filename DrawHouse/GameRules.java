import java.awt.*;
/**GameRules determines which part of the house to draw depending on the rolled dice number*/
public class GameRules {
      
   //text variables to be shown for each case
   public String text = "Click the button to start playing!";
   private String text1 = "You must roll 1 to draw the walls of the house.";
   private String text2 = "You must roll 2 to draw the roof.";
   private String text3 = "You must roll 3 to draw the roof window.";
   private String text4 = "You must roll 4 to draw the chimney smoke.";
   private String text5 = "You must roll 5 to draw the grass.";
   private String text6 = "You must roll 6 to draw the landscape.";
      
   Dice dice = new Dice();
   DrawDice dd = new DrawDice();
   HouseState hs = new HouseState();
   DrawHouse house = new DrawHouse();  

   /**checkProgress() draws the next house part and updates the dice and the sentence.
     *@param g - the 'graphics pen' that draws the items */
   public int checkProgress(Graphics g) {

   int x = dice.throwDice(); //the random number rolled from the dice is used to initialize variable x
   
   /*Depending on the x value, switch decides which part of the house to draw, 
    *makes sure it gets drawn in order (according to the game rules),
    *and always shows the part of the house drawn before
    *it also updates the text for the next move*/
    
   switch(x) {
   
      case 1: { 
         dd.drawDice(1,g); text = text2; hs.switchHs(1); house.drawHouse(1,g);
         if (hs.readHs(2) == true){ text = text3; house.drawHouse(2,g);}
         if (hs.readHs(3) == true){ text = text4; house.drawHouse(3,g);}
         if (hs.readHs(4) == true){ text = text5; house.drawHouse(4,g);}
         if (hs.readHs(5) == true){ text = text6; house.drawHouse(5,g);}
      } break;
   
      case 2: { 
         dd.drawDice(2,g);  text = text1;  
         if (hs.readHs(1) == true){ text = text3; house.drawHouse(1,g); hs.switchHs(2); house.drawHouse(2,g);}
         if (hs.readHs(3) == true){ text = text4; house.drawHouse(3,g);}
         if (hs.readHs(4) == true){ text = text5; house.drawHouse(4,g);}
         if (hs.readHs(5) == true){ text = text6; house.drawHouse(5,g);} 
      } break;
      
      case 3: {
         dd.drawDice(3,g); text = text1;
         if (hs.readHs(1) == true){ text = text2; house.drawHouse(1,g);}
         if (hs.readHs(2) == true){ text = text4; house.drawHouse(2,g); hs.switchHs(3); house.drawHouse(3,g);}
         if (hs.readHs(4) == true){ text = text5; house.drawHouse(4,g);}
         if (hs.readHs(5) == true){ text = text6; house.drawHouse(5,g);}       
       } break;
      
      case 4: {
         dd.drawDice(4,g); text = text1;
         if (hs.readHs(1) == true){ text = text2; house.drawHouse(1,g);}
         if (hs.readHs(2) == true){ text = text3; house.drawHouse(2,g);}
         if (hs.readHs(3) == true){ text = text5; house.drawHouse(3,g); hs.switchHs(4);; house.drawHouse(4,g);}
         if (hs.readHs(5) == true){ text = text6; house.drawHouse(5,g);}
       } break;
      
      case 5: { 
         dd.drawDice(5,g); text = text1;
         if (hs.readHs(1) == true){ text = text2; house.drawHouse(1,g);}
         if (hs.readHs(2) == true){ text = text3; house.drawHouse(2,g);}
         if (hs.readHs(3) == true){ text = text4; house.drawHouse(3,g);}      
         if (hs.readHs(4) == true){ text = text6; house.drawHouse(4,g); hs.switchHs(5); house.drawHouse(5,g);}
         if (hs.readHs(5) == true){ text = text6; house.drawHouse(5,g);}
      } break;
      
      case 6: { 
      dd.drawDice(6,g);  text = text1;
      if (hs.readHs(1) == true){ text = text2; house.drawHouse(1,g);}
      if (hs.readHs(2) == true){ text = text3; house.drawHouse(2,g);}
      if (hs.readHs(3) == true){ text = text4; house.drawHouse(3,g);}  
      if (hs.readHs(4) == true){ text = text5; house.drawHouse(4,g);}
      if (hs.readHs(5) == true){ house.drawHouse(5,g); hs.switchHs(6); house.drawHouse(6,g); text = "Click the button to restart the game!";}   
      } break;
   }  
   
   //restarts the game when all parts of the house are drawn
   if (hs.readHs(6) == true){  hs.restartGame();}

   return x;
   }

}