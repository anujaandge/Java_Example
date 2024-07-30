package com.mayinsoft.com;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoining {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] s= {"I","am","Anuja"};
        System.out.println(String.join("+", s));// I+am+Anuja
        //for joing used stringjoiner class 
        StringJoiner sj=new StringJoiner(" ");
        sj.add("Anuja");
        sj.add("Nitin");
        sj.add("Gore");
        System.out.println(sj); //Anuja Nitin Gore
        //for joing stream of strings use joining collector
        Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
        String joined = stringStream.collect(Collectors.joining(", "));
        System.out.println(joined); // Prints "foo, bar, foobar
        
        //string concatination
        String s1="Anuja";
        String s2="Andge";
        System.out.println(s1+s2);
        //concatination using string builder
        StringBuilder sb=new StringBuilder('a');
        String x=sb.append('b').append('c').append(2).toString();
        System.out.println(x);
        //using cancat() method
        System.out.println(s1.concat(s2));
	}

}
