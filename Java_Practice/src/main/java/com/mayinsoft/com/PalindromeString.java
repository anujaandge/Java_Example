package com.mayinsoft.com;
import java.util.Scanner;
public class PalindromeString {

	public boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check palindrome or not: ");
		String str=sc.nextLine();
        PalindromeString ps=new PalindromeString();
        System.out.println(ps.isPalindrome(str));
	}

}
