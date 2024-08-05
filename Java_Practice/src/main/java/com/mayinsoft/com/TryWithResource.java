package com.mayinsoft.com;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(PrintStream stream=new PrintStream("Hello.txt")){
			System.out.println();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot open the file");
		}
		finally {
		 System.err.println("All done");
		}


	}

}
