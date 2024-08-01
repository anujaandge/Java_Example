package com.mayinsoft.com;

public class ThrowAndThrows {

	public static  void m1()throws ArithmeticException, NullPointerException {
		System.out.println("Before in m1");
		try {
		int i = 1/0;
		System.out.println(i);
		throw new  ArithmeticException("arthmetic");
		}catch(ArithmeticException e){
			System.out.println("catch in m1 ");
		}
		  
		  System.out.println("After in m1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before"); 
		try {
		m1();
		}
		catch(ArithmeticException e){
			System.out.println("catch in main");
		}
		System.out.println("after");
	}

}
