package com.src.basic.datastructures.amexCodility;

public class PrintCommand {

	public static void main(String[] args) {
		int n=15;
		
		if(n%3==0 && n%5==0) {
			System.out.println("RETIRE");
		}else if(n%5==0) {
			System.out.println("SLEEP");
		}else if(n%3==0) {
			System.out.println("GO");
		
		}

	}

}
