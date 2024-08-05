package com.mayinsoft.com;
//Rules for Exception handling in overriding
//1.when super class does not declares exception and subclass declares
//i)when super class does not declares exception and subclass declares checked exception=> compile time error occurs
//ii)when super class does not declares exception and subclass declares unchecked exceptions=>code runs smoothly if exception occurs then it will show that
//2.When super class throws exception 
//i)SubClass declares exceptions other than the child exception of the SuperClass declared Exception.=>compile time error
//ii)Subclass declares exceptions which is the child of the superclass declared exception=>code runs smoothly if exception occurs then it will show that
//iii)If SuperClass declares an exception and SubClass declares without exception.=>code runs smoothly if exception occurs then it will show that
class Animal{
	void eat() {
		System.out.println("Animal is eating..");
	}
}
class Dog extends Animal{
	@Override
	void eat() throws NullPointerException{
		System.out.println("Dog is eating..");
		String s=null ;
		System.out.println(s.charAt(0));
	}
}
class SuperClass {
	void m1() throws RuntimeException{
		System.out.println("method one..");
	}
}
class Subclass extends SuperClass{
	@Override
	void m1() throws ArithmeticException{
		
	}
}
public class ExceptionOverinding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a=new Animal();
        Animal d=new Dog();
        try {
        	a.eat();
        	d.eat();
        }
        catch(NullPointerException e) {
        	e.printStackTrace();
        }
	}

}
