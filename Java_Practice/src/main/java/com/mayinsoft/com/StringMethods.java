package com.mayinsoft.com;

import java.util.Objects;

//string methods
//1.equals()
//2.equalIgnoreCase()
public class StringMethods {
    
	private static final Object foo = null;
	void compareBySwitch() {
		//method is comparing the string by switch case
		String x="A";
		switch(x) {
		case("a"):
			System.out.println("a");
		    break;
		case("A"):
			System.out.println("A");//correct output
		    break;
		case("B"):
			System.out.println("B");
		    break;
		}
		
	}
	void compareByConstant() {
		//method is comparing string by constant value.. Objects is used to avoid nullPointException
		System.out.println("baz".equals(foo)); //false
		//System.out.println(foo.equals("baz"));//this will throw nullPointException if foo is null
		System.out.println(Objects.equals(foo, "baz")); //false
	}
	void copmapreByIntern() {
		//method used .intern()which can make location of string similar if string character are equals
		String s="Bob";
		String s1=new String("Bob");
		if(s.equals(s1)) {
			System.out.println("strings are equal");
		}
		if(s!=s1) {
			System.out.println("strings are not at the same object");
		}
		String s2=s1.intern();
		if(s==s2) {
			System.out.println("The interned string and the literal are the same object");
		}
	}
	void changeCase(String s1) {
		System.out.println(s1.toUpperCase());//convert to uppercase letter
		System.out.println(s1.toLowerCase());//convert to lowercase letter
	}
	void findStringInAnother() {
		String x="My name is Anuja";
		String y="name";
		String z="Name";
		System.out.println(x.contains(y));//true
		System.out.println(x.contains(z));//false
		System.out.println(x.indexOf('i'));//8
		System.out.println(x.indexOf("anuja"));//-1 not in the string
		System.out.println(x.indexOf("Anuja"));//11
	    System.out.println(x.indexOf('z'));//-1 not in thre string
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Anuja15";
		String s2="Anuja"+15;
		System.out.println(s1.equals(s2));// compare the character with case also upper lower
		String s3="Anuja";
		String s4="ANUJA";
		System.out.println(s3.equals(s4));// compare the character with case also upper lower
		System.out.println(s3.equalsIgnoreCase(s4));//Ignore case and compare the character
		System.out.println(s3.endsWith("sa"));//check whether entered string is at the end of string with proper case
		StringMethods stringMethods=new StringMethods();
		stringMethods.compareBySwitch();
		stringMethods.compareByConstant();
		stringMethods.copmapreByIntern();
		stringMethods.changeCase(s1);
		stringMethods.findStringInAnother();

	}

}
