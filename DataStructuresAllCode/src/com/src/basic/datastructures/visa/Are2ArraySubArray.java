package com.src.basic.datastructures.visa;

public class Are2ArraySubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="1-2223-8 9";
		String delimiter1=" ";
		String delimiter2="-";
		s=s.replaceAll(delimiter1, delimiter2);
		System.out.println("After replaching strong"+s);
		String[] array=s.split("-");
		for(int i=0;i<array.length;i++) {
			System.out.println(""+array[i]);
		}*/
		
		int[] Array1= {1,2,3,4,5,6,7};
		int [] Array2= {2,3,5,109};
		
		System.out.println("Is Array2 sub array of Array1??  "+isSubArray(Array1, Array2));
			

	}
	
	public static boolean isSubArray(int[] Array1,int[] Array2) {
		boolean[] visited=new boolean[Array2.length];
		for(int i=0;i<Array1.length;i++) {
			for(int j=0;j<Array2.length;j++) {
				if(Array1[i]==Array2[j]) {
					visited[j]=true;
				}
			}
		}
		boolean isSubArray=true;
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				isSubArray=false;
			}
		}
		
		return isSubArray;
	}

}
