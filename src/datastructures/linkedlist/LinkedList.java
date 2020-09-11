package datastructures.linkedlist;


public class LinkedList{
	public static Node head;
	int size;
	public void add(int data) {
		// TODO Auto-generated method stub
		size++;
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head = node;
		}else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next = node;
		}
		
	}
	
	public void display() {
		Node n = head;
		while(n.next!=null) {
			System.out.print(n.data +" ");
			n=n.next;
		}
		System.out.println(n.data);
	}

	public void addFirst(int i) {
		// TODO Auto-generated method stub
		size++;
		Node node = new Node();
		node.data =i;
		node.next=head;
		head = node;
		
	}

	public void add(int index, int data) {
		// TODO Auto-generated method stub
		size++;
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0) {
			head.data = data;
		}
		else {
			Node n = head;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			node.next=n.next;
			n.next = node;
		}
		
		

		
	}

	public void removeAt(int index) {
		// TODO Auto-generated method stub
		size--;
		if(index==0) {
			Node n = head;
			head = n.next;
			n=null;
		}else {
		Node n = head;
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		Node node = n.next;
		n.next=node.next;
		node=null;}
		
	}

	
	
	
	
}