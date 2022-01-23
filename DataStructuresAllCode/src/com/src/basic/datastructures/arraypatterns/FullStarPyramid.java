package com.src.basic.datastructures.arraypatterns;

public class FullStarPyramid {

	public static void main(String[] args) {
		int n=5;int k=0;
		for (int i = 1; i <= n; ++i,k=0) {
			for (int j = 1; j <= n-i; ++j) {
			System.out.print(" ");
		}
			while(k != 2*i-1) {
				System.out.print("*");
				++k;
			}
			System.out.println();
	}

	}

}
