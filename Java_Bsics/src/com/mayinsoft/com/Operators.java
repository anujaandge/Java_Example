package com.mayinsoft.com;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=200;
		//int b=100;
		System.out.println("Enter the value:");
		Scanner sc=new Scanner(System.in);
		String no=sc.nextLine();
		System.out.println("Enter the value:");
		String no1=sc.nextLine();
		int a=Integer.valueOf(no);
		int b=Integer.valueOf(no1);
		//relational operators
		if(a>b) {
			System.out.println("a is greater than b");			
		}
		else {
			System.out.println("a is not greater than b");
		}
		if(a<b) {
			System.out.println("a is less than b");
		}
		else {
			System.out.println("a is not less than b");
		}
		if(a==b) {
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is not equal to b");
		}
		if(a>=b) {
			System.out.println("a is greater then or equal to b");
		}
		else {
			System.out.println("a is not greater then or equal to b");
		}
		if(a<=b) {
			System.out.println("a is less then or euqal to b");
		}
		else {
			System.out.println("a is not less then or euqal to b");
		}
		if(a!=b) {
			System.out.println("a is not equal to b");
		}else {
			System.out.println("a is equal to b ");
		}
	

	}

}
