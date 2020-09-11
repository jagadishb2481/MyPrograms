package datastructures.linkedlist.problems;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.display();
		reverse(l);
	}

	private static void reverse(LinkedList l) {
		// TODO Auto-generated method stub
		Node curr = l.head;
		Node prev = null;
		Node next = null;
		while (null != curr) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		l.head = prev;
		l.display();
	}

	/*
	 * private static Node reverse(LinkedList l) { // TODO Auto-generated method
	 * stub Node node = l.head; Node curr = node; Node next = null; Node prev =
	 * null; System.out.println("current: "+ curr); while(null!=curr) { next =
	 * curr.next; System.out.println("NEXT: "+next); curr.next=prev;
	 * System.out.println("current next: "+curr.next); prev=curr;
	 * System.out.println("prev: "+prev); curr=next;
	 * System.out.println("curr: "+curr); System.out.println(); } node = prev;
	 * l.head = node; l.display(); System.out.println(node.toString()); return node;
	 * 
	 * }
	 */

}
