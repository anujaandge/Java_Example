package com.mayinsoft.com;
import java.util.Scanner;
public class StringCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        char[] a=s.toCharArray();//converting string to character array
        System.out.println("Enter the charter which you want to convert:");
        String c=sc.next();
        char d=c.charAt(0);
        for(int i=0;i<s.length();i++) {
        	if(a[i]==d) {
        		if(d>='a' && d<='z') {
        			d-=32;
        		}
        		else if(d>='A' && d<='Z') {
        			d+=32;
        		}
        		a[i]=d;
        		break;
        	}
        }
        s = String.valueOf(a);//convert the character array to string
        System.out.println(s);
	}

}
