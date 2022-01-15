package com.src.basic.datastructures.vmWareProblems;

import java.util.Iterator;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		int number=10;
		System.out.println("All prime numbers are.."+printPrimeNumbers(number));

	}

	private static String printPrimeNumbers(int number) {
		String primeNum=" ";
		for(int i=1;i<number;i++) {
			if(isPrime(i)) {
				primeNum=primeNum+" "+i;
			}
		}
		return primeNum;
	}

	private static boolean isPrime(int i) {
		boolean isPrime=false;
		if(i==0|| i==1) {
			isPrime=true;
		}else {
			int m=i/2;
			int flag=0;
			for (int j = 2; j <= m; j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
				
				
			}
			if(flag==0) {
				isPrime=true;
			}
		}
		return isPrime;
	}

}
