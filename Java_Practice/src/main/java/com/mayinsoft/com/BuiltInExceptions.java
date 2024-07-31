package com.mayinsoft.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class BuiltInExceptions {

	void arithmeticException() {
		int a=3;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by zero");
		}
	}
	void nullPointer() {
		try {
			String s=null;
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	void stringIndexOutOfBound() {
		try {
			String s="I am Anuja";
			System.out.println(s.charAt(15));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	void fileNotFound() {
		try {
			File file=new File("D://file.txt");
			FileReader fr = new FileReader(file); 
		}
		catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}
	}
	void numberFormat() {
		try {
			int num=Integer.parseInt("Anu");
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println(e.toString());
		}
	}
	void arrayIndexOutOfBound() {
		try {
			int a[]=new int[5];
			a[7]=3;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
	}
	void ioException() {
		Scanner sc=new Scanner("Hello");
		System.out.println(sc.nextLine());
		System.out.println("IOException output: "+sc.ioException());
		sc.close();
	}
	void noSuchMethod() {
		Set<String> exampleleSet = new HashSet<String>();   
		Set example=new HashSet();
        //Hashtable<?, ?> exampleTable = new Hashtable(); 
        exampleleSet.iterator().next();
	}
	void illegalArgumentException() {
		int age=14;
		if(age>=18) {
			System.out.println("eligible for voting");
		}
		else {
			throw new IllegalArgumentException("not eligible for voting");
		}
	}
	void illegalStateException() {
		int n=4;
		int m=-1;
		if(n>=0 && m>=0) {
			System.out.println(n+m);
		}
		else {
			throw new IllegalStateException("one of the number is negative");
		}
	}
	void classNotFound() {
		try {
			Class.forName("class1");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BuiltInExceptions be=new BuiltInExceptions();
        be.arithmeticException();
        be.nullPointer();
        be.stringIndexOutOfBound();
        be.fileNotFound();
        be.numberFormat();
        be.arrayIndexOutOfBound();
        be.ioException();
        //be.noSuchMethod();
       // be.illegalArgumentException();
        //be.illegalStateException();
        be.classNotFound();
	}

}
