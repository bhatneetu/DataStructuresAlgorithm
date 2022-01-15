package com.src.basic.datastructures.vmWareProblems;

public class Reversal {

	public static void main(String[] args) {
		int[] arrayInt = {1,2,3,4,5,6,7,8};
		
		for (int i = 0, j=arrayInt.length-1 ;i < (arrayInt.length/2)  && j>=(arrayInt.length/2); i++, j--) {
			
			int temp= arrayInt[j];
			arrayInt[j] = arrayInt[i];
			arrayInt[i] = temp;
			
			
		}
		System.out.println("Array after reversal is...\n");
		for (int i = 0;i < arrayInt.length ; i++) {
			
			System.out.print(" "+arrayInt[i]);
		}
	}

}