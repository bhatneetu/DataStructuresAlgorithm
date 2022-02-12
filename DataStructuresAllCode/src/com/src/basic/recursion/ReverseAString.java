package com.src.basic.recursion;

public class ReverseAString {

	public static void main(String[] args) {
		String s= "leetcodeprogramming";
		System.out.println("String is..."+s);
		System.out.println("AFter reversing/...");
		printReverse(s.toCharArray());

	}
	private static void printReverse(char [] str) {
		  helper(0, str);
		}

		private static void helper(int index, char [] str) {
		  if (str == null || index >= str.length) {
		    return;
		  }
		  helper(index + 1, str);
		  System.out.print(str[index]);
		}

}
