package collectionAssignments;


import java.util.LinkedList;
class Queue {
	//Implement your logic here
	private int maxSize;
    private LinkedList<String> queue;
   public Queue(int maxSize){
        this.maxSize = maxSize;
        this.queue = new LinkedList<String>();
    }
    
    public LinkedList<String> getQueue(){
        return this.queue;
    }
   public  
    boolean isFull(){
        if(this.queue.size()>=maxSize) return true;
        return false;
    }
    
   public  boolean isEmpty(){
        if(this.queue.size()==0) return true;
        return false;
    }
    
   public  boolean enqueue(String data){
        if(!isFull()){
            this.queue.add(data);
            return true;
            
        }
        return false;
    }
    
    public boolean dequeue(){
        if(isEmpty()) return false;
        this.queue.remove(0);
        return true;
    }
}

class QueueWithLinkedList {

	public static void main(String arga[]){
		Queue queue= new Queue(5);
		
		queue.enqueue("Emily");
		queue.enqueue("Lily");
		queue.enqueue("Rachel");
		queue.enqueue("Rose");
		
		queue.dequeue();
		queue.dequeue();
	
		System.out.println(queue.getQueue());
	}
}