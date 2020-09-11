package datastructures.linkedlist.problems;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

public class FindMiddleLLTest {

	static Node findMiddle(LinkedList l) {
		Node middle =l.head;
		Node traverseFast = l.head;
		while(null!=traverseFast && null!=traverseFast.next) {
				traverseFast = traverseFast.next.next;
				middle=middle.next;
		}
		System.out.println(middle.data);
		return middle;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		//l.add(5);
		System.out.println(l.head);
		l.display();
		findMiddle(l);
	}

}
