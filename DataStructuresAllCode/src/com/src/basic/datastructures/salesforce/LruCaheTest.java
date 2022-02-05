package com.src.basic.datastructures.salesforce;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCaheTest {

	
	static LinkedHashMap<Integer,Integer> cache;
	public static void main(String[] args) {
		LruCaheTest  test=new LruCaheTest(3);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.put(3, 3);
		System.out.println(cache);
		cache.put(4, 4);
		System.out.println(cache);

	}
	
	public LruCaheTest(int capacity) {
		LruCaheTest.cache=new  LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
				return cache.size()>capacity;
			}
		};
	}
	

}
