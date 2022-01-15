package com.src.basic.datastructures.vmWareProblems;

public class FindComonIn3SortedArray {

	public static void main(String[] args) {
		int[] array1= {1, 5, 5} ;
		int[] array2= {3, 4, 5, 5, 10} ;
		int[] array3= {5, 5, 10, 20} ;
		int size=samllest(array1.length,array2.length,array3.length);
		int[] arrayComm= new int[size];
		
		int k=0,m=0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j] && k<size) {
					arrayComm[k]=array1[i];
					array1[i]=0;
					array2[j]=0;
					k++;
				}
			}
		}
		int commonSize=findNonZero(arrayComm);
		System.out.println("Least size of array is.."+commonSize);
		int[] arrayCommFinal= new int[commonSize];
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < arrayComm.length; j++) {
				if(array3[i]==arrayComm[j] && m<commonSize) {
					arrayCommFinal[m]=array3[i];
					m++;
				}
			}
		}
		System.out.println("Common elements between array1, array2 and array 3 are");
		for (int i = 0; i < arrayCommFinal.length; i++) {
			System.out.println(" "+arrayCommFinal[i]);
		}
		

	}

	private static int findNonZero(int[] arrayComm) {
		int count=0;
		for (int i = 0; i < arrayComm.length; i++) {
			if(arrayComm[i]!=0) {
				count++;
			}
		}
		return count;
	}

	private static int samllest(int length, int length2, int length3) {
		if(length<length2 && length<length3) {
			System.out.println("Length.."+length);
		return length;
		}else if(length2<length && length2<length3){
			System.out.println("Length.."+length2);
			return length2;
		}
		System.out.println("Length.."+length3);
			return length3;
		
	}

}
