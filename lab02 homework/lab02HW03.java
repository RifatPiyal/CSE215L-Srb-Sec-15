/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Scanner;

public class lab02HW03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your BMI:");
        double BMI = s.nextFloat();
        
        if (BMI < 18.5) {
            System.out.println("You're Underweight");
           
        } else if ((BMI) >= 18.5 && (BMI) <= 24.9) {
            System.out.println("You're Healthy");
           
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("You're Overweight");
           
        } else if (BMI >= 30 && BMI <= 39.9) {
            System.out.println("You're Obese");
        }
            else {
            System.out.println("Please provide a number within the BMI range");  
           
        }
    }
}

