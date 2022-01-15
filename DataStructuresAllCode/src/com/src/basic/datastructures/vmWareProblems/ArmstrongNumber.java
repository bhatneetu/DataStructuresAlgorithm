package com.src.basic.datastructures.vmWareProblems;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=1;
		System.out.println("Is "+number+" Armstrong = "+ isArmstrong(number));

	}

	private static boolean isArmstrong(int number) {
		boolean isTrue=false;
		String numberS=String.valueOf(number);
		int power= numberS.length();
		int n=number;
		int cubeSUm=0;
		if(number>0) {
			while(n>0) {
				
				int digit=n%10;
				n=n/10;
				
				cubeSUm=(int) (cubeSUm+Math.pow(digit, power));
				//System.out.println("Digit"+digit+" Number"+n+" CubeSum"+cubeSUm);
			}
		}
		if(cubeSUm==number) {
			isTrue=true;
		}
		return isTrue;
	}

}
