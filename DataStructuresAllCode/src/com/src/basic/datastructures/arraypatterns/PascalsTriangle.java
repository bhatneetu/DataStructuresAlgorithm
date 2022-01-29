package com.src.basic.datastructures.arraypatterns;

public class PascalsTriangle {

	

	public static void main(String[] args) {
		
		int n=5;
		System.out.println("Pascal truiangle is...\n");
		//SolutionPascals sp=new SolutionPascals();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
					System.out.print(" ");
				
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" "+ncr(i,j));
			
		}
			System.out.println();
		}
		

	}
	
	static int ncr(int n,int r) {
		return factorial(n)/(factorial(n-r) *factorial(r));
	}

	static private int factorial(int n) {
		
		int f;

	      for(f = 1; n > 1; n--){
	         f *= n;
	      }
	      return f;
		/*if(i==0 || i==1) {
			return 1;
		}
		return factorial(i-1)*i;*/
	}

}
