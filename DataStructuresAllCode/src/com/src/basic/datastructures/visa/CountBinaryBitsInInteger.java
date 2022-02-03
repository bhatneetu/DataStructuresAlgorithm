package com.src.basic.datastructures.visa;

public class CountBinaryBitsInInteger {

	public static void main(String[] args) {
		int x=4;
		String bianry = Integer.toBinaryString(x);
		System.out.println("Number of 1's in "+x+" is.."+countNoOfBits(bianry));

	}
public static int countNoOfBits(String s) {
	int count=0;
	char[] binar= s.toCharArray();
	for(int i=0;i<binar.length;i++) {
		if(binar[i]=='1')
			count++;
	}
	return count;
}
}
