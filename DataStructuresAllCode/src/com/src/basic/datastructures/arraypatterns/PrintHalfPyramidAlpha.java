package com.src.basic.datastructures.arraypatterns;

public class PrintHalfPyramidAlpha {

	public static void main(String[] args) {
		//int n=5;
		for(char i='A';i<='F';i++) {
			for(char j='A';j<=i-1;j++) {
				System.out.print((j)+" ");
			}
			System.out.println();
		}

	}

}
