/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class lab01 {
public static void main(String[] args) {
// System.in refers to the input stream in the console
Scanner input = new Scanner(System.in);
System.out.println("Please enter an integer: ");
int userGivenInteger = input.nextInt();
input.nextLine(); // consume the newline character
System.out.println(userGivenInteger);
System.out.println("Please enter any string: ");
String userGivenString = input.nextLine();
System.out.println(userGivenString);
input.close();
}
}