package lab03;
import java.util.Random;




public class Lab03HW3b {
     public static void main (String[] args) 
	{
		int a = getRandomValue(1,10);
		int b = getRandomValue(1,10);
		
		if(b<a){
			int temp = a;
			a = b;
			b = temp;
			System.out.println(a+" is now lower");
			System.out.println(b+" is now upper");
		}
		
		
		
		
		while(b>=a){
			if(b%8==0 || b%5==0){
				System.out.print(b+" ");
			}
			b--;
		}
		
	}
	public static int getRandomValue(int min, int max) 
    { 
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}