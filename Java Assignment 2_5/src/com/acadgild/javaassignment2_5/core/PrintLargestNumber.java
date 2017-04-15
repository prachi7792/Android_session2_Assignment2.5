
package com.acadgild.javaassignment2_5.core;
import java.util.Scanner;

public class PrintLargestNumber {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{	
	Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number 1 :");
		int num1 = scan.nextInt();
		
		System.out.print("Enter number 2 :");
		int num2 = scan.nextInt();
		
		System.out.print("Enter number 3 :");
		int num3 = scan.nextInt();
		
		
		if(num1 > num2 && num1 > num3){
			System.out.println("Highest Number is " + num1 );
		}
		
		else if(num2 > num3){
			System.out.println("Highest Number is " + num2 );
		}
		
		else{
			System.out.println("Highest Number is " + num3 );
		}

	}

}
