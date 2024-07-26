package com.mayinsoft.com;
import java.util.Scanner;
public class FindPrime {
	
	public static Scanner sc=new Scanner(System.in);
	static boolean isPrime(int n) {
		 if(n<=1 ) {
			 return false;
		 }
		 for(int i=2;i<=Math.sqrt(n);i++) {
			 if(n%i==0) {
				 return false;
			 }
		 }
		 
		 return true;
	 }
    public static void main(String[] args) {
		System.out.println("Enter first number:");
		int no1=sc.nextInt();
		System.out.println("Enter second number:");
		int no2=sc.nextInt();
		System.out.println("Printing prime numbers between"+no1+" and "+no2);
		for(int i=no1;i<=no2;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
