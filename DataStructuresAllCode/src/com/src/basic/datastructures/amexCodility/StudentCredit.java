package com.src.basic.datastructures.amexCodility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCredit {

	public static void main(String[] args) {
		int[] subject= {3,4,1,2};
		int[] student= {5,3};
		List<List<Integer>> pairs= new ArrayList<List<Integer>>();
		
		for(int i=0;i<subject.length;i++) {
			
			for(int j=0;j<student.length;j++) {
				List<Integer> combo = new ArrayList<Integer>();
				if(student[j]>=subject[i]) {
					
					combo.add(student[j]);
					combo.add(subject[i]);
					Collections.sort(combo);
				}
				System.out.println("\n Pairs are..");
				for(int k=0;k<combo.size();k++) {
					System.out.print("  "+combo.get(k));
				}
				if(!combo.isEmpty())
					pairs.add(combo);
			}
			
		}
		
		System.out.println("\n Number of pair combinations is.."+pairs.size());
		
	}

}
