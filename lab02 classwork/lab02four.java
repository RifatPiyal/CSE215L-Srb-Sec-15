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
public class lab02four {
  public static void main(String[] args) {
// System.in refers to the input stream in the console
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    int num = input.nextInt();
    input.nextLine(); 
    switch (num){
        case 1:
            System.out.println("you've entered 1 ");
        break;
        case 2:
            System.out.println("you've entered 2 ");
        break;
        case -1:
            System.out.println("you've entered -1 ");
        break;
        default:
             System.out.println("you've entered something else ");
            
    }
        
}
}
