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
public class Lab02 {

    public static void main(String[] args) {
// System.in refers to the input stream in the console
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    int num = input.nextInt();
    input.nextLine();
    if(num==0){
        System.out.println("you've entered 0 ");
    }
    else{
    System.out.println("you've entered a non 0");
}
    
}
}
