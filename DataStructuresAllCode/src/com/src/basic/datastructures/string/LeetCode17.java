package com.src.basic.datastructures.string;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9};
		String[] alpha = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wryz"}; 
		String num= "236";
		System.out.println("&&&&& val..."+num.substring(0, 2));
		List<String> combo = new ArrayList<String>();
		
		for(int i=0;i<num.length();i++) {
			int digit= Integer.valueOf(num.charAt(i));
			String charc = alpha[digit-1];
			
			
		}
	}

}
