package lab03;
import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
        int i=0, num, sum=0;
        System.out.println("enter an integer");
        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();
        int arr[] = new int[num+1];
        
        for(i=0;i<=num;i++){
            arr[i] = i;
            sum = sum+i;
            if(i==num){
                System.out.print(i+" ");
                break;
            }
            System.out.print(i+" +");
        }
        System.out.println(" = "+sum);
        
        for(int j: arr){
            if(arr[j]==num){
                System.out.print(arr[j]+" ");
                break;
            }
            System.out.print(arr[j]+" + ");
        }
        System.out.println(" = "+sum);
        

                
    }
}