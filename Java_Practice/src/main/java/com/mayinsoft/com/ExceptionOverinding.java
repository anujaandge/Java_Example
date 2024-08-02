package com.mayinsoft.com;
//Rules for Exception handling in ovrriding
//1.when super class does not declares exception and subclass declares
//i)when super classs does not declares exception and subclass declares checked exception=> compile time error occours
//ii)when super classs does not declares exception and subclass declares unchecked exceptions=>code runs smmothly if exception occours then it will show that
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
