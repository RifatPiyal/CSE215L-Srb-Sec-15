/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Scanner;


public class lab02two {
    public static void main(String[] args) {
// System.in refers to the input stream in the console
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    int num1 = input.nextInt();
    System.out.println(" You've entered "  +  num1 );
    int num2 = input.nextInt();
    System.out.println(" You've entered "  +  num2 );
    if (num1>num2){
        System.out.println(num1 + " is greater than " + num2 );
    }
    else if(num2>num1){
        System.out.println(num2+" is greater than "+ num1 );
    }
    else {
        System.out.println(num1+" and "+ num2+" are equal " );
    }    
    }
}