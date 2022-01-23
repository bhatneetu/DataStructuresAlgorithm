package com.src.basic.datastructures.arraypatterns;

public class PrintHalfPyramidSameAlpha {

	public static void main(String[] args) {
		//int n=5;
		for(char i='A';i<='E';i++) {
			for(char j='A';j<=i;j++) {
				System.out.print((i)+" ");
			}
			System.out.println();
		}

	}


	

}
