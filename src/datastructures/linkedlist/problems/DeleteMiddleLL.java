package datastructures.linkedlist.problems;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

public class DeleteMiddleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l.head);
		l.display();
		deleteMiddle(l);
	}

	private static void deleteMiddle(LinkedList l) {
		// TODO Auto-generated method stub
		Node slow = l.head;
		Node fast = l.head;
		Node prev =l.head;;
		while(null!=fast && null!=fast.next) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next=slow.next;
	l.display();
	}

}
