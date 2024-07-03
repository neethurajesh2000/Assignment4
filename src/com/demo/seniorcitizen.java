package com.demo;

import java.util.Scanner;
//Write code in java 

public class seniorcitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter year of birth");
		int number = reader.nextInt();
  
		System.out.println("Enter current year");
		int number1 = reader.nextInt();
   age=number1-number;
   if(age>=60) {
	   System.out.println("Senior citizen");
	}
   else {
	   System.out.println("Not Senior citizen");
   }
   }
	}

//output
//Enter year of birth
//1990
//Enter current year
//2024
//Not Senior citizen