package dsaLinkedList;

class Node{
	String data;
//	for next, the default value is null. because it has to store the reference of an node object. for objects 
//	the default value is null
	Node next;
	Node(){
		
	}
	Node(String data){
		this.data =data;
		this.next=null;
	}
	void setData(String data) {
		this.data = data;
	}
	String getData() {
		if(data==null) {
			return null;
		}
		return data;
	}
	boolean setNext(Node next) {
		this.next = next;
		return true;
		
	}
	Node getNext() {
		return this.next;
	}
	
}

public class LinkedList {
	
	Node head;
	Node tail;
	
	Node getHead() {
		return this.head;
	}
	Node getTail() {
		return this.tail;
	}
	
	void addAtEnd(String input) {
		Node node = new Node(input);
		if(this.head == null) {
			System.out.println("LinkedList is empty, so add the elements to it.");
			this.head=this.tail=node;
		}else {
			this.tail.next = node;
			this.tail=node;
			System.out.println(input+" Node is added");
		}
	}
	 void addAtFirst(String data) {
		 Node node = new Node(data);
		 if(this.head == null) {
			this.head=this.tail=node;
		 }else {
			 node.next=head;
			 head=node;
		 }
	 }
	 
	  Node search(String a) {
		 Node temp=head;
		 while(temp!=null) {
			 if(temp.getData().equals(a)) {
				 System.out.println("It is available");
				 return temp;
			 }
			 temp=temp.getNext();
		 }
//		 System.out.println("It is not available");
		 return null;
	 }
	 
	 boolean insert(String target, String newValue) {
		 Node temp= head;
		 Node newNode = new Node(newValue);
		 if(head==null) {
			 this.head=this.tail=newNode;
		 }else {
			 Node beforeNode = search(target);
			 if(beforeNode!=null) {
				 newNode.setNext(beforeNode.getNext());
				 beforeNode.setNext(newNode);
				 
				 if(beforeNode==this.tail) {
						this.tail=newNode; 
				}
				 return true;
			 }else {
				 System.out.println("Element Not Found");
			 }
			 
		 }
		 return false;
	 }
	 
	 boolean delete(String a) {
		 
		 if(head==null) {
			 return false;
		 }
		 if(head.getData().equals(a)) {
			 if(head==tail) {
				 this.head=this.tail=null;
			 }else {
				 Node node = head.getNext();
				 head.setNext(null);
				 head=node;
			 }
		 }
		 Node temp=head;
		 while(temp!=null && temp.getNext()!=null) {
			 Node deletedNode = null;
			 if(temp.getNext().getData().equals(a)) {
				 deletedNode = temp.getNext();
			 }
			 if(deletedNode!=null) {
				 if(deletedNode==tail) {
					 temp.setNext(null);
					 return true;
					 
				 }else {
					 temp.setNext(deletedNode.getNext());
					 deletedNode.setNext(null);
					 return true;
				 }
			 }
			 temp=temp.getNext();
			 
		 }
		
		 
		 return false;
	 }
	  
	 void display() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.println(temp.getData());
			 temp=temp.getNext();
		 }
	 
	 }
	 
	 int getSize() {
		 Node temp=head;
		 int count=0;
		 while(temp!=null) {
			 count++;
			 temp=temp.getNext();
		 }
		 return count;
	 }
	 
	public static void main(String[] args) {
//		LinkedList list = new LinkedList();
//		list.addAtEnd("Premanand");
//		list.addAtEnd("Nityanand");
//		list.addAtEnd("Saraswathi");
//		list.addAtEnd("KondalReddy");
//		list.addAtEnd("Sama Family");	
//		
//		Node temp=list.head;
//		while(temp!=null) {
//			System.out.println(temp.data);
//			temp = temp.next;
//		}
//		
//		list.addAtFirst("Reddy Family");
//		System.out.println("----------------");
//		Node temp1=list.head;
//		while(temp1!=null) {
//			System.out.println(temp1.data);
//			temp1 = temp1.next;
//		}
//		
//		System.out.println("--------");
//		
//		Node res = list.search("Sama Family");
//		if(res != null) {
//			System.out.println(res.getData());
//		}else {
//			System.out.println("Data is not available");
//		}
//		System.out.println("++++++++++++++++++");
//		if(list.insert("Saraswathi","Good Electrician")) {
//			list.display();
//		}else {
//			System.out.println("Not inserted");
//		}
//		
//		System.out.println("@@@@@@@@@@@@");
//		
//		if(list.delete("Sama Family")) {
//			System.out.println("successfully deleted");
//		}else {
//			System.out.println("It is not deleted");
//		}
//		list.display();
		
		  LinkedList linkedList1 = new LinkedList();
	        linkedList1.addAtEnd("ABC");
	        linkedList1.addAtEnd("DFG");
	        linkedList1.addAtEnd("XYZ");
	        linkedList1.addAtEnd("EFG");
	            
	        LinkedList linkedList2 = new LinkedList();
	        linkedList2.addAtEnd("ABC");
	        linkedList2.addAtEnd("DFG");
	        linkedList2.addAtEnd("XYZ");
	        linkedList2.addAtEnd("EFG");
	            
	        System.out.println("Initial List");
	        linkedList1.display();

	        System.out.println("\nList after left shifting by 2 positions");
	        shiftListLeft(linkedList1, 2);
	        linkedList1.display();
	            
	        System.out.println("\nInitial List");
	        linkedList2.display();
	            
	        System.out.println("\nList after right shifting by 2 positions");
	        shiftListRight(linkedList2, 2);
	        linkedList2.display();
	        
	        
	        LinkedList linkedList = new LinkedList();
	        LinkedList reversedLinkedList = new LinkedList();

	        linkedList.addAtEnd("Data");
	        linkedList.addAtEnd("Structures");
	        linkedList.addAtEnd("and");
	        linkedList.addAtEnd("Algorithms");

	        System.out.println("Initial List:");
	        linkedList.display();

	        System.out.println();

	        reverseList(linkedList.getHead(), reversedLinkedList);
	        System.out.println("Reversed List:");
	        reversedLinkedList.display();
		
	}
	 public static void shiftListLeft(LinkedList linkedList, int n) {
		  if (linkedList.getHead() == null || n <= 0) return;

	        int size = linkedList.getSize();
	        n = n % size; // In case n is greater than the size of the list

	        for (int i = 0; i < n; i++) {
	            Node currentHead = linkedList.getHead();
	            linkedList.setHead(currentHead.getNext()); // Shift the head

	            // Add the old head to the end
	            linkedList.addAtEnd(currentHead.getData());
	        }
	    }

	    void setHead(Node next) {
		// TODO Auto-generated method stub
	    this.head=next;
	    }
		public static void shiftListRight(LinkedList linkedList, int n) {
	        //Implement your code here   
	    	if (linkedList.getHead() == null || n <= 0) return;

	        int size = linkedList.getSize();
	        n = n % size; // In case n is greater than the size of the list

	        // Right shift by n is equivalent to left shift by (size - n)
	        shiftListLeft(linkedList, size - n);	    
	       }
		
		  public static void reverseList(Node head, LinkedList reversedLinkedList) {
		        // Traverse the original list and add nodes to the beginning of the reversed list
		        Node temp = head;

		        while (temp != null) {
		            reversedLinkedList.addAtFirst(temp.getData());
		            temp = temp.getNext();
		        }
		    }
}