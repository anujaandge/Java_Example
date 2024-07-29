package com.mayinsoft.com;

import java.util.StringTokenizer;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=6;
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		//System.out.println("Addition: "+sum);
		//System.out.println("Subtraction: "+sub);
		//System.out.println("Multiplication: "+mul);
		//System.out.println("Division: "+div);
		//System.out.println("Modulus: "+mod);
		//string concationation
		//String s="Anuja";
//		String s1="Andge";
//		System.out.println("Concatination: "+s+" "+s1);
		short i=129;
		short j=129;
		//System.out.println(i==j);
		
		String s1 = "ABC" + 1;
		String s2 = 130 + "ABC";
		String s3 = new String("ABC");
		String s4 = new String("ABC").intern();
		/*
		 * System.out.println(s1); System.out.println(s2);
		 */
		StringTokenizer s = new StringTokenizer("apple,ball,cat,dog",",");
		while (s.hasMoreElements()) {
			System.out.println(s.nextToken());
			
		}
//		System.out.println(s);
		
		/*
		 * System.out.println(s1==s4);
		 * 
		 * 
		 * System.out.println(s1.equals(s3)); System.out.println(s1==s3);
		 * System.out.println(s1==s2);
		 */
		
		

	}

}

