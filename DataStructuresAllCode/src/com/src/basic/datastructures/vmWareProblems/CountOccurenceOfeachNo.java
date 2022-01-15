package com.src.basic.datastructures.vmWareProblems;


import java.util.Map;
import java.util.TreeMap;
/*
 * 
 * Given an unsorted array of n integers that can contain integers from 1 to n. Some elements can be repeated multiple times and some other elements can be absent from the array. Count the frequency of all elements that are present and print the missing elements.

Examples: 

Input: arr[] = {2, 3, 3, 2, 5}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 2
        3 -> 2
        4 -> 0
        5 -> 1
Explanation: Frequency of elements 1 is 
0, 2 is 2, 3 is 2, 4 is 0 and 5 is 1.
 
Input: arr[] = {4, 4, 4, 4}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 0
        3 -> 0
        4 -> 4
Explanation: Frequency of elements 1 is 
0, 2 is 0, 3 is 0 and 4 is 4.
 * 
 * 
 */
public class CountOccurenceOfeachNo {

	public static void main(String[] args) {
		int[] arrayInt = {2,2,3,4,5,5,7,5};
		printTheCOunt(arrayInt);
		}

	private static void printTheCOunt(int[] arrayInt) {
		System.out.println("Size of array is"+arrayInt.length);
		Map<Integer, Integer> countOcc=new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < arrayInt.length; i++) {
			int count=0;
			if(countOcc.get(arrayInt[i])!=null) {
				count = countOcc.get(arrayInt[i]);
				
			}
			count++;
			countOcc.put(arrayInt[i], count);
		}
		for(int i=1;i<arrayInt.length+1;i++) {
			int value=0;
			if(countOcc.get(i)!=null) {
				value= countOcc.get(i);
			}
			System.out.println(i+"->"+value);
		}
		
		
	}
		
	

}
