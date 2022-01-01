package com.src.java.basicdatastructires.lists;

public class LinkedListImpl {

	public static void main(String[] args) {
		
			LinkedList ls = new LinkedList();
			Node n=new Node(6);
			ls.add(n);
			Node n1=new Node(16);
			ls.add(n1);
			Node n2=new Node(160);
			ls.add(n2);
			System.out.println("Size of linkedlist is"+ls.size());
	}

}


class Node{
	
	int data;
	Node prev;
	Node next;
	
	Node(int data){
		this.data=data;
		
	}
	
}
interface List{
	void add(Node n);
	void delete(Node n);
	void insert(Node n);
	void deleteAll();
	List sort();
	int size();
	void print();
	void reverse();
}
class LinkedList implements List{
	
	Node head;

	@Override
	public void add(Node n) {
		if(head==null) {
			head = n;
			return;
		}else {
			System.out.println("entering insert..");
			Node current = head;
			while(current.next!=null) 
				current = current.next;
				//System.out.println("entering insert..");
				
			
			current.next = n; 
			return;
		}
		
	}

	@Override
	public void delete(Node n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Node n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List sort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		
		int size=0;
		if(head==null) {
			size = -1;
		}
		if(head.next==null) {
			
			size = 1;
		}else {
			Node current = head;
			while(current!=null) {
				System.out.println(current.data);
			size++;
				current = current.next;
			}
				
				
				
			
		}
		return size;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
	
}