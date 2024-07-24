package com.mayinsoft.com;
import java.util.Scanner;
//Shift operator
//1.Signed Right shift operator (>>)
//2.Signed Left Shift operator (<<)
//3. Unsigned Right Shift Operator(>>>)
public class ShiftOperator {
	int a=0;
	void leftShift() {
		int A=a<<2;
		System.out.println("left shift of a by 2 byte: "+A);
	}
	void rightShift() {
		int A=a>>2;
		System.out.println("Right shift of a by 2 byte: "+A);
	}
	void unsignedRightShift() {
		int A=a>>>2;
		System.out.println("Unsigned Right Shift of a by 2 byte: "+A);
	}
	
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of a: ");
	    int x=sc.nextInt();
	    ShiftOperator shiftOperator=new ShiftOperator();
	    shiftOperator.a=x;
	    shiftOperator.rightShift();
	    shiftOperator.leftShift();
	    shiftOperator.unsignedRightShift();
	    }
}
