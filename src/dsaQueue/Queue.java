package dsaQueue;

public class Queue {
	
	private int front;
	private int rear;
	private int maxSize;
	private int arr[];
	
	Queue(int maxSize){
		front=0;
		rear=-1;
		this.maxSize=maxSize;
		arr = new int[maxSize];
	}
	public int getMaxSize() {
        return maxSize;
    }
	boolean isFull() {
		if(rear==maxSize-1) return true;
		return false;
	}
	
	boolean enqueue(int element) {
		if(isFull()) return false;
		arr[++rear]=element;
		System.out.println("The element is added at "+ rear + "value is "+element);
		return true;
	}
	
	boolean isEmpty() {
		if(rear<front) return true;
		return false;
	}
	void display() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			return ;
		}
		if(front>rear) System.out.println("Stack is empty");
		for(int i=front; i<=rear; i++) {
			System.out.println("The element is "+arr[i]+" at "+ i);
		}
	}
	int Dequeue() {
		if(isEmpty()) return Integer.MIN_VALUE;
		int result=arr[front++];
		if(front>rear) {
			front=0;
			rear=-1;
		}
		return result;
	}
	
	 public static Queue[] splitQueue(Queue queue) {
	        Queue oddQueue = new Queue(queue.getMaxSize());
	        Queue evenQueue = new Queue(queue.getMaxSize());

	        while (!queue.isEmpty()) {
	            int data = queue.Dequeue();
	            if (data % 2 == 0) {
	                evenQueue.enqueue(data);
	            } else {
	                oddQueue.enqueue(data);
	            }
	        }

	        return new Queue[] { oddQueue, evenQueue };
	    }
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.display();
		System.out.println(q.Dequeue());
		q.display();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(10);
		q.display();
		System.out.println("The dequeued element is "+q.Dequeue());
		System.out.println("The dequeued element is "+q.Dequeue());
		System.out.println("The dequeued element is "+q.Dequeue());
		q.display();
		q.Dequeue();
		System.out.println(q.enqueue(101));
		q.display();
		q.enqueue(121);
		q.display();
	}
}
