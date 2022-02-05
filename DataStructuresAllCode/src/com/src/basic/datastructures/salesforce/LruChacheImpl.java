package com.src.basic.datastructures.salesforce;


import java.util.LinkedHashMap;
import java.util.Map;


public class LruChacheImpl {
	private static LinkedHashMap<Integer, Integer> cache;

	public static void main(String[] args) {
		
		
		
	
		
		LruChacheImpl LruChacheImpl=new LruChacheImpl(3);
		cache.put(1,1);
		cache.put(2,2);
		System.out.println(cache.get(2));
		System.out.println(cache);
		cache.put(3,3);
		cache.put(4,4);
		System.out.println(cache);

	}

	
	
	public LruChacheImpl(int capacity){
		//CAPCITY=capacity;
		this.cache=new  LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
				return cache.size()>capacity;
			}
		};
		
	}

}
