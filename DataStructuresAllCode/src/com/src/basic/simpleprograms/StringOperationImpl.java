package com.src.basic.simpleprograms;

public class StringOperationImpl {

	public static void main(String[] args) {
	String str = "leetcode";
	int count[] = new int[256];
	int len= str.length();
	for(int i=0;i<len;i++) {
		System.out.println("Count of "+str.charAt(i)+" "+(++count[str.charAt(i)]));
	}
	for(int i=0;i<count.length;i++) {
		System.out.println(" value "+i+" "+count[i]);
	}

	}

}
