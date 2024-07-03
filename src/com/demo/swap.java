package com.demo;

//Write code in java 

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a= 10;
    int b=20;
    System.out.println("Before swapping");
    System.out.println("a=" +a);
    System.out.println("b=" +b);
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("After  swapping");
    System.out.println("a=" +a);
    System.out.println("b=" +b);
	}

}
//output

//Before swapping
//a=10
//b=20
//After  swapping
//a=20
//b=10