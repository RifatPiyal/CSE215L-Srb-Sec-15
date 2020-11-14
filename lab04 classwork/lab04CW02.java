
package lab04;

import java.util.Scanner;
public class lab04CW02 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        String st = inp.nextLine();
        switch (st){
            case "one":
                System.out.println("you have entred 1");
                break;
            
            case "two":
                System.out.println("you have entred 2");
                break;    
            
            case "three":
                System.out.println("you have entred 3");
                break;
            
            default:
                System.out.println("anything else");
        }
    }
}
