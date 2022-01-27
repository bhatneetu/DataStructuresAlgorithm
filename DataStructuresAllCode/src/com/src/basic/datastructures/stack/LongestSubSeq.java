package com.src.basic.datastructures.stack;

import java.util.Stack;

public class LongestSubSeq {

	public static void main(String[] args) {
		String val="abcabcbb";
		String subsequence="";
		String subsequenceF="";
		Stack<Character> nonRep=new Stack<Character>();
		char[] charArray=val.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(nonRep.contains(charArray[i])) {
				subsequence="";
				while(!nonRep.isEmpty()) {
					Character c=nonRep.pop();
					System.out.println("Poping.."+subsequence+"suv "+c);
					
				subsequence+=""+c.toString();
				}
				if(subsequenceF.length()<subsequence.length()) {
					subsequenceF=subsequence;
				}
			}else {
				
				System.out.println("Pushing.."+charArray[i]);
				nonRep.push(charArray[i]);
			}
			
		}
		
		subsequence="";
		while(!nonRep.isEmpty()) {
			Character c=nonRep.pop();
			System.out.println("Poping..1"+subsequence+"suv 1"+c);
			
		subsequence+=""+c.toString();
		}
		if(subsequenceF.length()<subsequence.length()) {
			subsequenceF=subsequence;
		}
		System.out.println("subsequenceF.... "+subsequenceF+"  subsequence....."+subsequence);
		StringBuffer b=new StringBuffer(subsequenceF);
		System.out.println("Longest"+b.reverse());
		b.reverse().toString().length();

	}

}
