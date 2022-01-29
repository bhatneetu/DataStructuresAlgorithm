package com.src.basic.datastructures.graphs;

import java.util.ArrayList;

public class Graph {

	public static void main(String[] args) {
		  int V = 5;
	        ArrayList<ArrayList<Integer> > adj
	            = new ArrayList<ArrayList<Integer> >(V);
	 
	        for (int i = 0; i < V; i++)
	            adj.add(new ArrayList<Integer>());
	 
	        // Adding edges one by one
	        addVertxGraph(adj, 0, 1);
	        addVertxGraph(adj, 0, 4);
	        addVertxGraph(adj, 1, 2);
	        addVertxGraph(adj, 1, 3);
	        addVertxGraph(adj, 1, 4);
	        addVertxGraph(adj, 2, 3);
	        addVertxGraph(adj, 3, 4);
	 
	        printGraph(adj);
		//List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		

	}
	
	public static void addVertxGraph(ArrayList<ArrayList<Integer>> adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.print("Adjacency matrix of "+i+" is ->");
			ArrayList<Integer> adjM=adj.get(i);
			for(int j=0;j<adjM.size();j++) {
				System.out.print(" "+adjM.get(j));
			}
			System.out.println();
		}
	}

}
