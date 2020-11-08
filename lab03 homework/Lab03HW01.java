
package lab03;
import java.util.Scanner;

public class Lab03HW01 {
   public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        String name;
        int n;
        System.out.println("Enter a name ");
        name=input.next();
        System.out.println("Enter how many times to print ");
        n=input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(name);
        }
    }

}  

