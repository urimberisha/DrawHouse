/**HouseState stores the state of the build.*/
public class HouseState {

   //each boolean variable represents a house part state (built or not built)
   private boolean Hs1 = false;
   private boolean Hs2 = false;
   private boolean Hs3 = false;
   private boolean Hs4 = false;
   private boolean Hs5 = false;
   private boolean Hs6 = false;
   
   //switchHs(int x) sets the variables values to true depending on x
   public void switchHs(int x) {
   
      switch(x) { 
      
         case 1: {Hs1 = true;} break;
         case 2: {Hs2 = true;} break;
         case 3: {Hs3 = true;} break;
         case 4: {Hs4 = true;} break;
         case 5: {Hs5 = true;} break;
         case 6: {Hs6 = true;} break;
         default: {System.out.println("Error, enter a value 1-6");}
      
      }
   
   }
   
   //readHs(int x) returns the values of the variables
   public boolean readHs(int x) {
   
      boolean r = false;
      
      switch(x) {
      
         case 1: {r = Hs1;} break;
         case 2: {r = Hs2;} break;
         case 3: {r = Hs3;} break;
         case 4: {r = Hs4;} break;
         case 5: {r = Hs5;} break;
         case 6: {r = Hs6;} break;
      }
      
   return r;
   }
   
   //sets all the variable values to false (the starting values)
   public void restartGame(){
   
      Hs1 = false;
      Hs2 = false;
      Hs3 = false;
      Hs4 = false;
      Hs5 = false;
      Hs6 = false;
    
   }

}