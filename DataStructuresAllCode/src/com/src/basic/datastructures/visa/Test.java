package com.src.basic.datastructures.visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
	int x=Integer.MAX_VALUE;
	System.out.println(Math.abs(x));
	}
	

}
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> pairs= new ArrayList<List<Integer>>();
        int len=arr.length;
        List<Integer> arraylst= new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<len;j++){
                if(arr[j]-arr[i]==1){
                	if(arr[j]>arr[i]) {
                    arraylst.add(arr[j]);
                    arraylst.add(arr[i]);
                	}else {
                		arraylst.add(arr[i]);
                        arraylst.add(arr[j]);
                	}
            }
                Collections.sort(arraylst);
             pairs.add(arraylst); 
             //Collections.sort(pairs);
            }
        }
        return pairs;
    
    }
}