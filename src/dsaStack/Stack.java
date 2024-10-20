package dsaStack;

public class Stack {
	
	private int top;
	private int maxSize;
	private int arr[];
	
	Stack() {
		
	}
	Stack(int maxSize){
		top=-1;
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}
	
	boolean isFull() {
		if(top==maxSize-1) return true;
		return false;
	}
	
	boolean push(int element) {
		if(isFull()) {
			System.out.println("The stack is full");
			return false;
		}else {
			arr[++top] = element;
			System.out.println(element +" is pushed");
		}
		return true;
	}
	
	boolean isEmpty() {
		if(top==-1) return true;
		return false;
	}
	
	int pop() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return arr[top--];
	}
	
	int peek() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return arr[top];
	}
	
	void display() {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println("The stack index is "+i+" And element is "+arr[i]);
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack(5);
		
		s.push(10);
//		
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(20);
		s.display();
		System.out.println("The popped element is "+ s.pop());
		System.out.println("The popped element is "+s.pop());
		System.out.println("The popped element is "+s.pop());
		System.out.println("The popped element is "+s.pop());
		System.out.println("The popped element is "+s.pop());
		System.out.println("The stack is empty"+s.pop());
		
		s.push(222);
		System.out.println("The peek element is "+s.peek());
	}
}
