
package lab04;
import java.util.Scanner;
import java.lang.Math;


public class lab04CW05 {
     public static void main(String[] args) {
         
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the first string");
        String st1 = inp.nextLine();
        int i, currVow=0, preVow=0;
        for (i=0; i<st1.length();i++){
            char ch = st1.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                preVow= currVow;
                currVow= i ;
            }
        }
            
        System.out.println(" Second last vowel is at " + preVow + " the vowel is "+ st1.charAt(preVow)); 
     }
}
        