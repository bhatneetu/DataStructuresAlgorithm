package com.src.basic.datastructures.salesforce;

public class Strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="aaaaaa";
		String needle="baa";
		int position =-1;
		if(haystack.contains(needle)) {
			position =haystack.indexOf(needle, 0);
		}
		System.out.println("Position.."+position);
		
		
		   String s="aba aba";
		   
		        int idx = (s + s).indexOf(s, 1);
		        System.out.println("idx="+idx+"S="+s);
		        System.out.println(  idx < s.length());
		        
		        char a='A';
		        String newS= a+s;
		        System.out.println("newS...."+newS);
		  
		
	}

}
