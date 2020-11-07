package lab03;
import java.util.Scanner;

public class Lab03CW03 {
    public static void main(String[] args) {
        int i=0, num, sum=0;
        System.out.println("enter an integer");
        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();
       
        for(i=0;i<=num;i++){
            sum = sum+i;
            if(i==num){
                System.out.print(i+" ");
                break;
            }
            System.out.print(i+" + ");
            
        }
        System.out.println(" = "+sum);

}
}