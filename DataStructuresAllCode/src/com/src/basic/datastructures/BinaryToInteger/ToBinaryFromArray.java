package com.src.basic.datastructures.BinaryToInteger;

public class ToBinaryFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] bianry= {"0","1","1","0","1","0","1","0","1","1"};
		String val="";
		for (int i = 0; i < bianry.length; i++) {
			val+=bianry[i];
			//System.out.println("Number is..."+val+bianry[i]);
			System.out.println("Number is..."+val+" Decimal equivalent is.. "+Integer.parseInt(val,2));
			String a="dlsk";
			char j='a';
			val.concat(""+j);
			System.out.println("val"+val);
		}
	}

}
