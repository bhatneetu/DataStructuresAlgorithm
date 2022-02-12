package com.src.basic.datastructures.visa;

import java.math.BigInteger;

public class CountOfSubArraySumK {

	public static void main(String[] args) {
		int[] subarray = {1,2,3};
		int SumMax=3;
		
		int count=0;
		for(int i=0;i<subarray.length;i++) {
			int interSum=0;
			
			for(int j=i;j<subarray.length ;j++) {
				
				interSum += subarray[j];
				
				if(interSum==SumMax) {
					count++;
					
				}
			}
		}
		System.out.println("COunt.."+count);
	}

}
