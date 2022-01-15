package com.src.basic.datastructures.vmWareProblems;
/*
 * 
 * Given a singly linked list, find the middle of the linked list. For example, 
 * if the given linked list is 1->2->3->4->5 then the output should be 3. 
 *If there are even nodes, then there would be two middle nodes, 
 *we need to print the second middle element. 
 *For example, if given linked list is 
 *1->2->3->4->5->6 then the output should be 4. 
 * 
 * 
 * 
 * */
public class PrintMiddleOfLinkedList {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.push(9);
		ls.push(8);
		ls.push(7);
		ls.push(6);
		ls.push(5);		
		ls.push(4);
		ls.push(2);
		ls.printList();
		System.out.println("Middle of linked list");
		ls.middleElement();
	}

}
class LinkedList{
	
	Node head;
	
	public void push(int i) {
		Node node=new Node(i);
		node.next = head;
		head=node;
	}
	
	public void middleElement() {
		Node slow_p=head;
		Node fast_p=head;
		if(head==null) {
			System.out.println("List is empty");
		}else {
			while(slow_p!=null && fast_p!=null && fast_p.next!=null) {
				slow_p	= slow_p.next;
				fast_p  = fast_p.next.next;
			}
			if(slow_p!=null) {
				System.out.println("Middle element is "+slow_p.data);
			}
		}
	}
	
	public void printList() {
		Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
	}
	
}
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
}