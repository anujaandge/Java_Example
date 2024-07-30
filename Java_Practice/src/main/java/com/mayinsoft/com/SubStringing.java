package com.mayinsoft.com;

public class SubStringing {

	void reverseString() {
		//reversing string using stringbuilder
		String s="I am Anuja Andge";
		StringBuilder sb=new StringBuilder(s);
		String r=sb.reverse().toString();
		System.out.println(r);
		
		//by using char array
		char[] s1=s.toCharArray();
		for(int i=0,j=s1.length-1;i<j;i++,j--) {
			char temp=s1[i];
			s1[i]=s1[j];
			s1[j]=temp;
		}
		System.out.println(new String(s1));
		
	}
	void getNthCharacter() {
		String s="I am Anuja Andge";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-2));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="I am Anuja Andge";
         System.out.println(s.substring(4));// will hold the string starting at character 4 until the end
         System.out.println(s.substring(2, 7));//will hold the string starting at character 2 until end before 7
         System.out.println(s.subSequence(2, 7));//will hold the string starting at character 2 until end before 7
         System.out.println(s.substring(2,s.length()-3));
         
         System.out.println("\n");
         SubStringing ss=new SubStringing();
         ss.reverseString();
         //removing white spaces using trim()
         String x="   Hello World!   ";
         System.out.println(x+"\n"+x.trim());
         //replacing the character by exact matching
         System.out.println(s.replace('a', 'n'));
         System.out.println(s.replace("An", "Nitin"));
         //getting length of string
         System.out.println(s.length());
         ss.getNthCharacter();
         String str="study";
         str.concat("tonight");
         System.out.println(str);
         StringBuffer sb=new StringBuffer("Study");
         sb.append("tonight");
         System.out.println(sb);
         StringBuilder SB=new StringBuilder("Study");
         SB.append("tonight");
         System.out.println(SB);
         
         
         
         
	}

}
