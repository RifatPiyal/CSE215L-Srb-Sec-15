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
public class lab02five {
    public static void main(String[] args) {
        while(true){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    int num1 = input.nextInt();
    System.out.println("Please enter another integer: ");
    int num2 = input.nextInt();
    switch (num1){
        case 1:
            System.out.println(" you've entred " + num1+ " on outer switch ");
    switch (num2){
        case 1:
            System.out.println(" you've entred " + num2+ " on inner switch ");
            break;
        default:
            System.out.println(" you've entred " + num2+ " on outer switch ");
            
            
    }
    break;
    default:
            System.out.println(" you've entred " + num1+ " on outer switch ");
}
        }
    }
}
    