/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class lab02three {
    public static void main(String[] args) {
// System.in refers to the input stream in the console
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    float num = input.nextFloat();
    if (num>=0){
        System.out.println("Your input is non negative ");
        if(num>=1)
            System.out.println("your input is a natural number ");
    }
    else{
        System.out.println("Your input is negative ");
    }
}
}