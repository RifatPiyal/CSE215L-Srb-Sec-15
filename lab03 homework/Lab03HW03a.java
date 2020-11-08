package lab03;
import java.util.Random;

public class Lab03HW03a {
     public static void main(String[] args) {

            for (int i = 0; i < 2; i++) {
            System.out.println(getRandomNumberInRange(1, 1000));
            
            
}


        }
        
    

        public static int getRandomNumberInRange(int min, int max) {
    
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
            
      
 
  
 
}
}