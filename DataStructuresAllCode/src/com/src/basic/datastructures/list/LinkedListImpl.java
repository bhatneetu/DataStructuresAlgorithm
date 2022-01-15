package com.src.basic.datastructures.list;

public class LinkedListImpl{
	
	Node head;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls= new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(10);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(10);
		ls.add(60);
		ls.add(10);
		System.out.println("Size of Linked List is:-  "+ls.size());
		System.out.println();
		ls.print();
		
		System.out.println("\n Linked list in reverse order is \n");
		ls.reverse();
		ls.print();
		
		//ls.searchDelete(40);
		System.out.println("\n List is now aftr delteing 40\n");
		ls.print();
		System.out.println("\n Size of Linked List is:-  "+ls.size());
		
		ls.searchDelete(10);
		System.out.println("\n Size of Linked List is:-  "+ls.size()+"  head is now"+ls.head.data);
		
		System.out.println("\n List is now \n");
		ls.print();
		//ls.searchDelete(60);
		System.out.println("\n Size of Linked List is:-  "+ls.size()+"  head is now"+ls.head.data);

		
		System.out.println("\n  List is now \n");
		ls.print();
		
		System.out.println("\n  Does list contain 50 \n"+ls.contains(50));
		System.out.println("\n  Does list contain 10 \n"+ls.contains(10));
		
		System.out.println("\n  After deleting last element of list \n");
		//ls.deleteLast();
		ls.print();
		int m=0,differnce=0;
		
		
	}

}
