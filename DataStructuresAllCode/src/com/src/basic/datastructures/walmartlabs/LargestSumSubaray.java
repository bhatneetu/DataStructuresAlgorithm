package com.src.basic.datastructures.walmartlabs;

import java.util.Arrays;

public class LargestSumSubaray {

	public static void main(String args[]){
        int input[][] = {{ 2,  1, -3, -4,  5},
                         { 0,  6,  3,  4,  1},
                         { 2, -2, -1,  4, -5},
                         {-3,  3,  1,  0,  3}};
        LargestSumSubaraySolution saw = new LargestSumSubaraySolution();
        System.out.println(saw.maxSum(input));
    }  

}

class LargestSumSubaraySolution{
	
	
	class Result{
		int maxSum;
		int leftBound;
		int rightBound;
		int upBound;
		int lowBound;
		 @Override
	        public String toString() {
	            return "Result [maxSum=" + maxSum + ", leftBound=" + leftBound
	                    + ", rightBound=" + rightBound + ", upBound=" + upBound
	                    + ", lowBound=" + lowBound + "]";
	        }
	}
		 
		 public Result maxSum(int input[][]) {
			 int rows = input.length;
			 int cols = input[0].length;
			 int temp[] = new int[rows]	;
			 Result results = new Result();
			 for(int left=0;left<cols;left++) {
				 for(int i=0;i<rows;i++) {
					 Arrays.fill(temp, 0);
				 }
				 for(int right=left;right<cols;right++) {
					 for(int i=0;i<rows;i++) {
						temp[i]+= input[i][right];
					 }
					 KadaneResult kadane=  kadane(temp);
					 if(results.maxSum>kadane.maxSum) {
						 results.maxSum= kadane.maxSum;
						 results.leftBound = left;
						 results.rightBound=right;
						 results.upBound = kadane.start	;
						 results.lowBound= kadane.end;
					 }
				 }
			 }
			return results;
	
		 }
		 
		

		class KadaneResult{

				public int end;
				public int start;
				public int maxSum;

				public KadaneResult(int maxSum, int start, int end) {
			        this.maxSum = maxSum;
			        this.start = start;
			        this.end = end;
			    }

				
			}
		
		private KadaneResult kadane(int[] temp) {
			int max=0;
			int maxStart=-1;
			int maxEnd=-1;
			int currentStart =0;
			int maxSoFar=0;
			for (int i = 0; i < temp.length; i++) {
				maxSoFar += temp[i];
				if(maxSoFar<0) {
					maxSoFar=0;
					currentStart=i+1;
				}
				if(max<maxSoFar) {
					maxStart = currentStart;
					maxEnd=i;
					max=maxSoFar;
				}
			}
			return new KadaneResult(max,maxStart,maxEnd);
		}
	

	
	
}