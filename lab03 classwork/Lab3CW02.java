package lab03;
import java.util.Scanner;

public class Lab3CW02 {
    public static void main(String[] args) {
        int i=0, num, sum=0;
        System.out.println("enter an integer");
        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();
 
          do{
            sum = sum+i;
            if(i==num){
                System.out.print(i+"  ");
                break;
            }
            System.out.print(i+" + ");
            i++;
            
        }
        while(i<=num);
        System.out.println(" = "+sum);
}
}