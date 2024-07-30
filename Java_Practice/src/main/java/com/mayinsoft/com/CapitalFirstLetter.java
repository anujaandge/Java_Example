package com.mayinsoft.com;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="i am anuja andge";
        String [] words=str.split("\\s");
        StringBuilder sb=new StringBuilder();
        for (String string : words) {
			sb.append(Character.toUpperCase(string.charAt(0))).append(string.substring(1)).append(" " );
		}
        System.out.println(sb.toString());
	}

}
