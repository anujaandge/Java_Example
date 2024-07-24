package com.mayinsoft.com;
import java.util.Scanner;
//Biteise Operators
//1.AND (&)
//2.OR (|)
//3.XOR (^)
//4.complemaint (~)
public class BitwiseOperator {

	int a=0;
	int b=0;
	void bitwiseAnd() {
		int result=a & b;
		System.out.println("Bitwise and result: "+result);
	}
	void bitwiseOr() {
		int result=a | b;
		System.out.println("Bitwise OR result: "+result);
	}
	void bitwiseXor() {
		int result=a ^ b;
		System.out.println("Bitwise XOR result: "+result);
	}
	void bitwiseComplemaint() {
		int A=~a;
		int B=~b;
		System.out.println("Complemaint of a: "+A);
		System.out.println("Complemaint of b: "+B);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		BitwiseOperator bitwiseOperator=new BitwiseOperator();
		bitwiseOperator.a=x;
		bitwiseOperator.b=y;
		bitwiseOperator.bitwiseAnd();
		bitwiseOperator.bitwiseOr();
		bitwiseOperator.bitwiseXor();
		bitwiseOperator.bitwiseComplemaint();
		

	}

}
