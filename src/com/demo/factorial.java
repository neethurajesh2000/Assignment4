package com.demo;

import java.util.Scanner;
//Write code in java 

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int i,fact=1;  
		 
		 Scanner reader = new Scanner(System.in);
			System.out.println("Enter a number");
			int number = reader.nextInt();
		  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		

	}
//output

//Enter a number
//6
//Factorial of 6 is: 720