package com.src.basic.datastructures.list;

public class LinkedList implements List{
	
	Node head;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(int n) {
		Node new_node= new Node(n);
		if(head==null) {
			head=new_node;
			return;
		}else {
			Node current=head;
			while(current.next!=null)
				current= current.next;
			
			current.next=new_node;
				
		}
		
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchDelete(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		int size=0;
		if(head==null)
		{
			size=0;
		}else if(head.next==null){
			size=1;
		}else {
			Node current=head;
			while(current!=null) {
				size++;
				current=current.next;
			}
		}
		return size;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(int data) {
		// TODO Auto-generated method stub
		return false;
	}

}
