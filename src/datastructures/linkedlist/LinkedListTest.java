package datastructures.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.addFirst(4);
		l.add(3, 5);
		l.removeAt(1);
		
		l.display();
		System.out.println(l.size);

	}

}
