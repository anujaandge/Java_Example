package com.mayinsoft.com;

public class ExceptionMethods {

	void printStackTrace() {
		int a=3;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace(); //print name,massage and description of stack where exception occurs
		}
	}
	void toStringMethod() {
		int a=3;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString()); //print message with name
		}
	}
	void toGetMessage() {
		int a=3;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
		     System.out.println(e.getMessage()); //only print exception message
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ExceptionMethods em=new ExceptionMethods();
        em.printStackTrace();
        em.toStringMethod();
        em.toGetMessage();
	}

}
