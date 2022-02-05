package com.src.basic.datastructures.amexCodility;

import java.util.*;

public class Solution {
    public int sum(int N, int[] A, int[] B) {
    	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    	int edges = A.length;
    	int[] weights = new int[N];
    	for(int i:A)
    		hm.merge(i, 1, Integer::sum);
    	for(int i:B)
    		hm.merge(i, 1, Integer::sum);
    	HashMap<Integer,Integer> sorted = sortByValue(hm);
    	int k=N;
    	 for (Map.Entry<Integer, Integer> en :
    		 sorted.entrySet()) {
            weights[en.getKey()-1]=k;
            k--;
        }
    	 int total = 0;
    	 for(int i=0;i<edges;i++) {
    		 total+= weights[A[i]-1]+weights[B[i]-1];
    	 }
    	return total;
    }
    
    public  HashMap<Integer, Integer>
    sortByValue(HashMap<Integer, Integer> hm)
    {
        List<Map.Entry<Integer, Integer> > list
            = new LinkedList<Map.Entry<Integer, Integer> >(
                hm.entrySet());
 
        Collections.sort(
            list,
            (i1,
             i2) -> i2.getValue().compareTo(i1.getValue()));
 
        HashMap<Integer, Integer> temp
            = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	public static void main(String[] args) {
		Solution s = new Solution();
//		int N = 5;
//		int[] A = {2, 2, 1, 2}, B = {1, 3, 4, 4};
		int N=4;
		int[] A= {1,3}, B= {2,4};
		System.out.println(s.sum(N, A, B));

	}

}
