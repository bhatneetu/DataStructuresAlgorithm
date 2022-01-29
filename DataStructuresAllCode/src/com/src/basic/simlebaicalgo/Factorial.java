package com.src.basic.simlebaicalgo;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		FactorialImpl fctr=new FactorialImpl();
		System.out.println("Factorial is..."+fctr.factorial(13));

	}

}
class FactorialImpl{
	

	

	public BigInteger factorial(int i) {
		if(i==0 || i==1) {
			return BigInteger.ONE;
		}
		return factorial(i-1).multiply(new BigInteger(""+i));
	}
}