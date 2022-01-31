package com.src.basic.datastructures.amexCodility;

import java.util.Arrays;

public class BankBalancePerYear{
	
	 public static void main(String[] args)
	    {
		 int[] A = {100,100,-50,-25,-25,100,200,30,-10};//430-10=420-55=365
		 String[]D = {"2020-10-01","2020-10-12","2020-10-21","2020-10-21","2020-10-31","2020-09-31","2020-08-31","2020-09-31","2020-07-31"};
		 CalculateBankBalance bal= new CalculateBankBalance();
		 System.out.println("Total balance by EO Financial year is.."+bal.annualbalance(A, D));
		 
	    }
	
}

class CalculateBankBalance{
	
	public int annualbalance(int[] A, String D[]) {
		int finalBalnce=0;
		int[] negativeSum =new int[12];
		int[] negativeCounter=new int[12];
		Arrays.fill(negativeSum, 0);
		Arrays.fill(negativeCounter, 0);
		
		int len=A.length;
		for(int i=0;i<len;i++) {
			finalBalnce = finalBalnce + A[i];
			int month=getMonth(D[i]);
			if(A[i]<0) {
				int ngatveMonBal = negativeSum[month] ;
				ngatveMonBal = ngatveMonBal + A[i];
				negativeSum[month] = ngatveMonBal;
				
				int ngatveMonCount = negativeCounter[month] ;
				ngatveMonCount++;
				negativeCounter[month] = ngatveMonCount;
			}
			
		}
		int anualBal= finalBalnce -((12-getMonthsConsideredForFee(negativeSum,negativeCounter))*5);
		
		return anualBal;
		
	}
	
	public int getMonth(String date) {
		return Integer.valueOf(date.split("-")[1])-1;
		
	}
	
	public int getMonthsConsideredForFee(int[] negativeSum,int[] negativeCounter) {
		int monthOmited=0;
		for(int i=0;i<negativeSum.length;i++) {
			if(negativeSum[i]<=-100 && negativeCounter[i]>=3) {
				monthOmited++;
			}
		}
		return monthOmited;
	}
	
}