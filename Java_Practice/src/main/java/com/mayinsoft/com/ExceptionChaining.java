package com.mayinsoft.com;



public class ExceptionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 int a=4;
        	 int b=0;
        	 System.out.println(a/b);
         }
         catch(ArithmeticException e) {
        	 throw new RuntimeException("divisior is zero",e);
         }
	}

}
