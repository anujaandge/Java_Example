package com.mayinsoft.com;
import java.util.Scanner;

public class ArithmaticOperator {
	int a=0;
	int b=0;
	void addition() {
		int sum=a+b;
		System.out.println("addition is : "+sum);
	}
	void subtraction() {
		int sub=a-b;
		System.out.println("subtraction is : "+sub);
	}
	void multiplication() {
		int mul=a*b;
		System.out.println("multiplication is: "+mul);
	}
	void division() {
		int div=a/b;
		System.out.println("division is: "+div);
	}
	void modulation() {
		int mod=a%b;
		System.out.println("Remainder is: "+mod);
	}
    public static void main(String[] args) {
		System.out.println("enter two values:");
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		String y=sc.nextLine();
		ArithmaticOperator arithmaticOperator=new ArithmaticOperator();
		arithmaticOperator.a=Integer.valueOf(x);
		arithmaticOperator.b=Integer.valueOf(y);
		arithmaticOperator.addition();
		arithmaticOperator.subtraction();
		arithmaticOperator.multiplication();
		if(arithmaticOperator.b!=0 || arithmaticOperator.a>0) {
		    arithmaticOperator.division();
		    arithmaticOperator.modulation();
		}
		else {
			System.out.println("Excute without division and mdulation...");
		}
	}
}
