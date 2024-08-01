package com.mayinsoft.com;

class MyException extends Exception{
	public MyException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}
public class CustomException  {

	private static int [] accno= {101,102,103,104,105};
	private static String []names= {"Anuja","Nitin","Sonal","Atharv","Shrikant"};
	private static double bal[] =  {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	System.out.println("Atgccono"+"\t"+"names"+"\t"+"bal");
        	for(int i=0;i<6;i++) {
        		System.out.println(accno[i]+"\t"+names[i]+"\t"+bal[i]);
        		if(bal[i]<1000) {
        		   throw new MyException("Balnce is less than 1000");
        			        		}
        	}
        }
        catch(MyException e) {
        	e.printStackTrace();
        	
        }
	}

}
