/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import java.util.Scanner;
class lab02HW02{
   public static void main(String args[])
   {		
	int temp;
	boolean flag=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      flag=false;
	      break;
	   }
	}
	//If flag is true then the number is prime else not
	if(flag)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}