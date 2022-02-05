package com.src.basic.datastructures.salesforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {

	public static void main(String[] args) {
		String[] sentence= {"the","day","is","sunny","the","the","the","sunny","is","is"};
		int k=4;
		Map<String,Integer> kFreqWords = new HashMap<String,Integer>();
		for(int i=0;i<sentence.length;i++) {
			int counter=0;
			if(kFreqWords.get(sentence[i]) != null) {
				counter= kFreqWords.get(sentence[i]);
			}
			counter++;
			kFreqWords.put(sentence[i], counter);
		}
		ArrayList<String>  res = new ArrayList<String> (kFreqWords.keySet());
		
		Collections.sort(res,(a,b)-> kFreqWords.get(a) != kFreqWords.get(b) ? kFreqWords.get(b)-kFreqWords.get(a) : a.compareTo(b));
		
		List<String> myList = res.subList(0, k);
		
		for (String string : myList) {
			System.out.println(string);
		}
	}

}
