package com.src.basic.datastructures.list;

public class LinkedList implements List{
	
	Node head;
	

	
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
	public void deleteLast() {
		if(head==null) {
			System.out.println("List is null nothing to delete");
			return;
		}else {
			Node current=head;
			Node prev = null;
			while(current!=null && current.next!=null) {
				prev=current;
				current=current.next;
			}
			prev.next=null;
		}
		
	}

	@Override
	public void searchDelete(int n) {
		if(head.data==n) {
			head=head.next;
			return;
		}else {
			Node current=head;
			Node prev,temp;
			while(current!=null && current.next!=null) {
				if(current.next.data==n) {
				prev = current;
				temp= current.next.next;
				current = temp;
				prev.next=current;
				}
				if(current!=null) {
				current=current.next;
				}
				}
		}
		
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
		if(head==null)
		{
			System.out.println("The linkde list is empty");
		}else {
			Node current=head;
			while(current!=null) {
				System.out.print(" ->"+current.data);
				current=current.next;
			}
			
		}
		
	}

	@Override
	public boolean contains(int data) {
		if(head!=null) {
			if(head.data==data) {
				return true;
			}else {
				Node current=head;
				while(current!=null) {
					if(current.data==data) {
						return true;
					}
					current=current.next;
				}
			}
		}
		return false;
	}

	@Override
	public void reverse() {
		if(head==null) {
			System.out.println("The list is null..cannot reverse");
			return;
		}else{
			Node current=head;
			Node prev=null,next=null;
			while(current!=null) {
				next= current.next;
				current.next=prev;
				prev=current;
				current=next;
		}
			head=prev;
		}
		
	}

}
