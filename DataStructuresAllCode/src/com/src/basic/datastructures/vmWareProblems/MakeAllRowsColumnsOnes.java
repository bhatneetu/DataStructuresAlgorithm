package com.src.basic.datastructures.vmWareProblems;

public class MakeAllRowsColumnsOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayInt= {{0,0,0},{0,0,0},{0,0,1}};
		int ROW=arrayInt.length;
		int COl=arrayInt[0].length;
		System.out.println("ROW"+ROW);
		boolean[][] visited = new boolean[arrayInt.length][arrayInt[0].length]	;	
		for(int i=0;i<arrayInt.length;i++) {
			for(int j=0;j<arrayInt[0].length;j++) {
				if(arrayInt[i][j]==1) {
					DFSOn4Side(arrayInt,i,j,visited,ROW,COl);
				}
			}
		}
		
		System.out.println("After changing to 1s...array is..\n");
		for (int i = 0; i < ROW; i++) {
			for(int j=0;j<COl;j++) {
				System.out.print(" "+arrayInt[i][j]);
			}
			System.out.println(" ");
			
		}

	}

	private static void DFSOn4Side(int[][] arrayInt, int i, int j, boolean[][] visited, int rOW, int cOl) {
		if(i<0 || j<0 || i>rOW || j>cOl || visited[i][j]) {
			return;
		}
		while(arrayInt[i][j]==1 && !visited[i][j]) {
			int k=0,l=0;
			while(l<cOl) {
				System.out.println("i="+i);
				arrayInt[i][l]=1;
				visited[i][l]=true;
				l++;
				System.out.println("L="+l);
			}
			while(k<rOW   ) {
				//while(!visited[k][j]) {
				System.out.println("J="+j);
				arrayInt[k][j]=1;
				visited[k][j]=true;
				k++;
				System.out.println("K="+k);
				//}
			}
		}
		
		
	}

}
