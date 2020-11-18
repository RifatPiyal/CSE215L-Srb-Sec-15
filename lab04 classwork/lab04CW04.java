
package lab04;
import java.util.Scanner;
import java.lang.Math;


public class lab04CW04 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the first string");
        String st1 = inp.nextLine();
        System.out.println("enter the 2nd string");
        String st2 = inp.nextLine();
        int n1 = st1.length();
        int n2 = st2.length();
        
        if(n1<n2) {
           System.out.println("the 2nd string should be smaller"); 
            
        }
        if(st1.substring(0, n2).equals(st2)) {
             System.out.println("String" + st1 + "starts with string"+ st2); 
        }
        if(st1.substring(n1-n2, n1).equals(st2)){
            System.out.println("String" + st1 + " ends with string "+ st2); 
        }
        else{
             System.out.println("String" + st1 + "has no match"+ st2); 
}
}
}