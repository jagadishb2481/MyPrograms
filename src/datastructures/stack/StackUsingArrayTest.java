package datastructures.stack;

public class StackUsingArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingByArray s = new StackUsingByArray();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		System.out.println("popped element: "+s.pop());
		System.out.println("popped element: "+s.pop());
		s.display();
		System.out.println();
		System.out.println(s.arr.length);
		
	}

}
