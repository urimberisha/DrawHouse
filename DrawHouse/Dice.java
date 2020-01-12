/**Dice gets a random dice value.*/
public class Dice {
   
   /**throwDice() returns a random number from 1 to 6.*/
   public int throwDice() {
   
   int x = (int)(Math.random()*6+1); //Math.random() gives a double value greater or equal to 0 and smaller than 1.0
      
   return x;
   
   }
}