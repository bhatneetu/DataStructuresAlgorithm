package com.src.basic.datastructures.vmWareProblems;

import java.util.HashMap;

/*
 * 
 * 
 * Given an input string, write a function that returns the Run Length Encoded string for the input string.
 * For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”
 * 
 * */
public class StringLengthEncoding {

	public static void main(String[] args) {
		String stringValueInput="wwwwaaadexxxxxxggtenaeduxalwk";
		System.out.println("The String length encoding is.."+calculateStringLEncoding(stringValueInput));

	}

	private static String calculateStringLEncoding(String stringValueInput) {
		String output="";
		char[] charArray=stringValueInput.toCharArray();
		String unique="";
		
		HashMap<Character,Integer> charCount=new HashMap<Character,Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(!unique.contains(""+charArray[i])) {
				unique=unique.concat(""+charArray[i]);
			}
			int count=0;
			if(charCount.get(charArray[i])!=null) {
				count=charCount.get(charArray[i]);
			}
			count++;
			charCount.put(charArray[i], count);
		}
		char[] uniqArr=unique.toCharArray();
		for (int i = 0; i < uniqArr.length; i++) {
			output =output.concat(""+uniqArr[i]+charCount.get(uniqArr[i]));
		}
		return output;
	}

}
