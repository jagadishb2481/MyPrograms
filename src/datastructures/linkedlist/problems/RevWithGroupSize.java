package datastructures.linkedlist.problems;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

public class RevWithGroupSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.display();
		l.head=reverseWithGroupSize(l.head,3);
		l.display();
	}

	private static Node reverseWithGroupSize(Node head, int size) {
		// TODO Auto-generated method stub
		Node curr = head;
		Node prev = null;
		Node next=null;
		for(int i=1;i<=size && curr!=null ;i++) {
			next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		System.out.println("reverse: "+prev);
		if(next!=null) {
			System.out.println("next: "+next);
			head.next = reverseWithGroupSize(next,size);
		}
		
		return prev;
	}

}
