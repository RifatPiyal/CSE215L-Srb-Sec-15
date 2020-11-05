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
public class Lab01HW1 {
     
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String name;
        String dept;
        int age;
        System.out.println(" please  enter your name");
        name=input.next();
        System.out.println("please enter your age");
        age=input.nextInt();
        System.out.println("please enter your department");
        dept=input.next();
        System.out.println("Your name is " + name + " and your age is "+age + " and your deparmnrt is " +dept);
         
         
    }
}