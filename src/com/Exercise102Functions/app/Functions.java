package com.Exercise102Functions.app;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		//Variable declaration
		long factorial = 0;
		int number = 0;
		
		Scanner input = new Scanner(System.in);
		
		//Validation
		do {
			System.out.println("Input a number: ");
			number = input.nextInt();
			
			if(number<0) {
				System.out.println("The number is invalid, try again.");
			}
		}while(number<0);
		
		factorial = GiveFactorial(number);
		
		System.out.println("The factorial of your number is: "+ factorial);

	}
	
	public static long GiveFactorial(int n) {
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial = factorial*i;
		}
		
		return factorial;
	}

}
