package com.mayinsoft.com;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringSpliting {

	void useSplit() {
		String Input="What do you  want  from me?";
        String[] words=Input.split("\\s+");//split by space
        for (String string : words) {
			System.out.println(string);
		}
        System.out.println("\n");
        String demo="Anuja,Nitin,Sonal,Shrikant";
        for (String string : demo.split(",")) {
			System.out.println(string);
		}
        
        System.out.println("\n");
        //< > - = ! ( ) [ ] { } \ ^ $ | ? * + . for splitting Rexs use // or Pattern.quote()
        String S="a|b|c";
        String[] w=S.split("\\|");
        for (String string : w) {
			System.out.println(string);
		}
        System.out.println("\n");
        String[] x=S.split(Pattern.quote("|"));
        for (String string : x) {
			System.out.println(string);
		}
        
        System.out.println("\n");
        String[]y=S.split("\\|",2);//this can give limit to stop beging splitted if n is positive 
        for (String string : y) {
			System.out.println(string);
		}
        
        
	}
	void useStringTokenizer() {
		String s="I am Anuja Andge";
		StringTokenizer st=new StringTokenizer(s);
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken()); 
			
		}
		System.out.println("\n");
		StringTokenizer x=new StringTokenizer(s,"Au");
		while (x.hasMoreElements()) {
		System.out.println(x.nextToken());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           StringSpliting sp=new StringSpliting();
           sp.useSplit();
           System.out.println("\n");
           sp.useStringTokenizer();
	}

}
