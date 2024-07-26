package com.mayinsoft.com;
import java.util.Scanner;
public class PrimeNumber {
	 public static Scanner sc=new Scanner(System.in);
	 static void checkPrime(int n) {
		 int i,m=0,flag=0;
		 m=n/2;
		 if(n==1 || n==0) {
			 System.out.println("Not prime");
		 }else {
			 for(i=2;i<m;i++) {
				 if(n%i==0) {
					 flag=1;
					 break;
				 }
			 }
		 }
		 System.out.println((flag==0)?"Prime":"Not prime");
	 }
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
	 static void primeOrNot(int n) {
		//prime number using do while loop
		int index=1; 
		do { 
			  index++; 
	    }while(n%index!=0);
		System.out.println((n==index)?"prime number":"Non prime number");
	 }
     public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		primeOrNot(num);
	    System.out.println(isPrime(num)?"prime":"Not prime");
		checkPrime(num);
	}
}
