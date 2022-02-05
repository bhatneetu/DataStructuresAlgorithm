package com.src.basic.datastructures.salesforce;

public class ExcelColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String columnName="ABC";
		int result=0;
		for(int i=0;i<columnName.length();i++) {
			result *=26;
			result += columnName.charAt(i)-'A' + 1;
		}
		System.out.println("Column number is.."+result);
	}

}
