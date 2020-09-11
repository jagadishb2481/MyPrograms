package datastructures.stack;

import java.util.Arrays;

public class StackUsingByArray {

	Object []arr;
	int top;
	
	public StackUsingByArray(){
		arr= new Object[10];
	}
	
	public void push(int data) {
		// TODO Auto-generated method stub
		if(top==arr.length) {
			ensureCapacity();
		}
		else {
			arr[top] = data;
			top++;
		}
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		arr = Arrays.copyOf(arr, arr.length+10);
	}

	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<top;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public int pop() {
			int pop;
			top--;
			pop=(int) arr[top];
			arr[top]=0;
		return pop;
	}
	
	

}
