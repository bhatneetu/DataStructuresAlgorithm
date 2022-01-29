package com.src.basic.datastructures.string;

public class FindNmberOfSentences {

	

	public static void main(String[] args) {
		String[] paragraph= {"","alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int maxLength=0;
		for (int i = 0; i < paragraph.length; i++) {
			int length = getSentenceLength(paragraph[i]);
			if(length>maxLength) {
				maxLength=length;
			}
			System.out.println("Length of sentence... "+paragraph[i]+" is "+length);
		}
		System.out.println("Max Length of sentence... "+maxLength);
	}

	private static int getSentenceLength(String string) {
		// TODO Auto-generated method stub
		if(string.length()==0) {
			return 0;
		}
		if(string.length()==1) {
			return 1;
		}
		String[] arra=string.split(" ");
		return arra.length;
	}

}
