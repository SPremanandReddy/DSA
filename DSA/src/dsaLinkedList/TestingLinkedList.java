//package dsaSpringBoard;
//
//class Node{
//	String data;
//	Node next;
//	
//Node(){
//		
//	}
//	Node(String data){
//		this.data =data;
//		this.next=null;
//	}
//	void setData(String data) {
//		this.data = data;
//	}
//	String getData() {
//		if(data==null) {
//			return null;
//		}
//		return data;
//	}
//	boolean setNext(Node next) {
//		this.next = next;
//		return true;
//		
//	}
//	Node getNext() {
//		return this.next;
//	}
//}
//
//class linkedList{
//	Node head;
//	Node tail;
//	linkedList(){
//		
//	}
//	
//	void addATStart(String data) {
//		Node node = new Node(data);
//		if(this.head==null && this.tail==null) {
//			this.head = this.tail= node;
//		}else {
//			node.setNext(this.head);
//			this.head = node;
//		}
//		
//	}
//	void addAtEnd(String data) {
//		Node node  = new Node();
//		node.setData(data);
//		if(this.head==null && this.tail==null) {
//			this.head=this.tail=node;
//			return;
//		}else {
//			this.tail.setNext(node);
//			this.tail=node;
//		}
//		
//	}
//	
//	
//	void search(String data) {
//		
//		Node temp = head;
//		int index=0;
//		boolean isFound=false;
//		while(temp!=null) {
//			if(temp.getData().equals(data)) {
//				System.out.println("The data is found at "+index);
//				isFound=true;
//			}
//			index++;
//			temp=temp.getNext();
//		}
//		if(!isFound) {
//			System.out.println(data+" is not found");
//		}
//	}
//	
//	void insert(String target, String data) {
//		Node node  = new Node(data);
//		Node temp=head;
//		if(this.head==null) {
//			this.head=node;
//		}else {
//			while(temp!=null) {
//				if(temp.getData().equals(target)) {
//					break;
//				}
//				temp=temp.getNext();
//			}
//		}
//		if(temp==this.tail) {
//			this.tail.setNext(node);
//			this.tail=node;
//		}else if(temp!=null) {
//		
//		node.setNext(temp.getNext());
//		temp.setNext(node);
//		}
//	}
//	
//	void delete(String data) {
//		
//		Node temp=head;
//		Node prev=null;
//		while(temp!=null) {
//			if(temp.getData().equals(data)) {
//				break;
//			}
//			prev=temp;
//			temp=temp.getNext();	
//		}
//		if(temp==null) {
//			System.out.println("element not found");
//		}else {
//			if(this.head == temp) {
//				this.head=this.head.getNext();
//					if(this.tail==temp) {
//						this.tail=null;
//				}
//			}else {
//				prev.setNext(temp.getNext());
//				if(temp==this.tail) {
//					this.tail=prev;
//				}
//			}
//		}
//	}
//	
//	void print() {
//		Node temp = head;
//		while(temp!=null){
//			System.out.println(temp.getData());
//			temp=temp.getNext();
//		}
//	}
//}
//public class TestingLinkedList {
//	
//	
//	public static void main(String[] args) {
//		linkedList ll = new linkedList();
//		ll.addAtEnd("prem");
//		ll.addAtEnd("nitya");
//		ll.addAtEnd("saraswati");
//		System.out.println("---atend---");
//		ll.addATStart("Kondalreddy");
//		ll.print();
//		System.out.println("---atstart----");
//		ll.search("nitya");
//		System.out.println("----searched----");
//		ll.insert("prem","Software Developer");
//		
//		ll.print();
//		System.out.println("---inserted----");
//		ll.delete("nitya");
//		ll.print();
//	}
//	
//}
package dsaLinkedList;


