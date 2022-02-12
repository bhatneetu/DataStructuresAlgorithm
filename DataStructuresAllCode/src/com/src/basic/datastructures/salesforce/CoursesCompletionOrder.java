package com.src.basic.datastructures.salesforce;

import java.util.ArrayList;

public class CoursesCompletionOrder {

	public static void main(String[] args) {
		int[][] prerequisites = {{1,0},{0,1}};
		int numberOfCourse =2;
		CourseCompletionStatus course= new CourseCompletionStatus();
		System.out.println("Can you finish all course after meeting pre requisites..."+course.canComplete(numberOfCourse, prerequisites));
		
		
		
		
		
		
	}

}

class CourseCompletionStatus{
	public boolean canComplete(int numberOfCourse,int[][] prerequisites) {
		
		ArrayList<Integer>[] adj= new ArrayList[numberOfCourse];
		
		
		/*  1. create a adjacency matrix that stores pre requisites for each course
		 *  2. Keep a visited array for every element that is visited--default it to 0 for not visited 1 for visited 2 for complete
		 *  3. Initialize the adjacency matrix to all elements in the pre-requisutes array
		 *  4. Initialize all elements of array to ArrayList
		 *  
		 *  
		 *  5. for each courseNo--run a dfs of its adjacency matrix and 
		 *  		-- if !dfs --- return false---if it doesnt hv cycles
		 *  		---else return true
		 */
		
		int[] visited = new int[numberOfCourse];
		
		for(int i=0;i<numberOfCourse;i++) {
			visited[i] =0;
		}
		
		for(int i=0;i<numberOfCourse;i++) {
			adj[i] =new ArrayList<Integer>();
			
		}
		for(int[] n: prerequisites) {
			adj[n[0]].add(n[1]);
		}
		for(int i=0;i<numberOfCourse;i++) {
			if(!dfs(i,visited,adj)) {
				return false;
			}
		}
		
		return true;
		
		
	}

	private static boolean dfs(int i, int[] visited, ArrayList<Integer>[] adj) {
		if(visited[i]==1) {
			return false;
		}
		
		
		if(visited[i]==2) {
			return true;
		}
		
		visited[i]=1;
		
		for(int n:adj[i]) {
			if(!dfs(n,visited,adj)) {
				return false;
			}
		}
		
		visited[i]=2;
		return true;
	}
}
