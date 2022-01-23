package com.src.basic.datastructures.balancer;

import java.util.Stack;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paran="[{}(){([])}]";
		String paran2="[]{(}";
		System.out.println(paran.toCharArray());
		System.out.println("Is balanced? "+balanceTree(paran.toCharArray()));
		
		System.out.println(paran2.toCharArray());
		System.out.println("Is balanced? "+balanceTree(paran2.toCharArray()));
		
	}
	public static boolean balanceTree(char[] array) {
		Stack<Character> stack= new Stack<Character>();
		boolean isBalanced=false;
		for (int i = 0; i < array.length; i++) {
			if( (array[i]=='{' || array[i]=='[' || array[i]=='(')) {
				stack.add(array[i]);
				System.out.println("Added in stack"+array[i]);
			}
			if(stack.size()>0 && (array[i]==']' || array[i]=='}' || array[i]==')')) {
				Character clos= stack.pop();
				if(array[i]==']' && clos!='[') {
					isBalanced =false;
					break;
				}
				else if(array[i]=='}' && clos!='{') {
					isBalanced =false;
					break;
				}
				else if(array[i]==')' && clos!='(') {
					isBalanced =false;
					break;
				}else {
					isBalanced=true;
				}
			}
			
			
		}
		return isBalanced;
	}

}

