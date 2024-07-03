package com.demo;

import java.util.Scanner;
//Write code in java

public class evennumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = reader.nextInt();
		if(number %2==0) {
			System.out.println(number + " is even");
		}
		else {
			System.out.println(number + " is odd");
		}
	}

}
//output
//Enter a number
//6
//6 is even
