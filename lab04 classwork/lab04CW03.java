
package lab04;
import java.util.Scanner;
import java.lang.Math;

public class lab04CW03 {
     public static void main(String[] args) {
         
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the side for hexagon");
        double s =inp.nextDouble();
        double hexagonArea = ((6*Math.pow(s,2))/(4*Math.PI/6));
        
        System.out.println(String.format("%.2f", hexagonArea));
     }
}
