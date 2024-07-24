package com.mayinsoft.com;
import java.util.Scanner;
public class EvenOdd {
     public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter nuber to check even or odd: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even number.");
		}
		else {
			System.out.println(num+" is odd number.");
		}
	}
}
