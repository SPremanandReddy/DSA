//class LinkedList {
//
//    private Node head;
//    private Node tail;
//
//    public Node getHead() {
//        return this.head;
//    }
//
//    public Node getTail() {
//        return this.tail;
//    }
//
//    public void setHead(Node head) {
//        this.head = head;
//    }
//
//    public void setTail(Node tail) {
//        this.tail = tail;
//    }
//
//    public void addAtEnd(String data) {
//        Node node = new Node(data);
//
//        if (this.head == null) {
//            this.head = this.tail = node;
//        } else {
//            this.tail.setNext(node);
//            this.tail = node;
//        }
//    }
//
//    public void addAtBeginning(String data) {
//        Node node = new Node(data);
//
//        if (this.head == null) {
//            this.head = this.tail = node;
//        } else {
//            node.setNext(this.head);
//            this.head = node;
//        }
//    }
//
//    public void display() {
//        Node temp = this.head;
//
//        while (temp != null) {
//            System.out.println(temp.getData());
//            temp = temp.getNext();
//        }
//    }
//
//    public Node find(String data) {
//        Node temp = this.head;
//
//        while (temp != null) {
//            if (temp.getData().equals(data))
//                return temp;
//            temp = temp.getNext();
//        }
//        return null;
//    }
//
//    public int getSize() {
//        Node temp = this.head;
//        int count = 0;
//        while (temp != null) {
//            count++;
//            temp = temp.getNext();
//        }
//        return count;
//    }
//
//    public void insert(String data, String dataBefore) {
//        Node node = new Node(data);
//
//        if (this.head == null)
//            this.head = this.tail = node;
//        else {
//            Node nodeBefore = this.find(dataBefore);
//            if (nodeBefore != null) {
//                node.setNext(nodeBefore.getNext());
//                nodeBefore.setNext(node);
//                if (nodeBefore == this.tail)
//                    this.tail = node;
//            } else
//                System.out.println("Node not found");
//        }
//    }
//
//    public void delete(String data) {
//
//        if (this.head == null)
//            System.out.println("List is empty");
//        else {
//            Node node = this.find(data);
//
//            if (node == null)
//                System.out.println("Node not found");
//
//            if (node == this.head) {
//                this.head = this.head.getNext();
//                node.setNext(null);
//
//                if (node == this.tail)
//                    tail = null;
//            } else {
//                Node nodeBefore = null;
//                Node temp = this.head;
//                while (temp != null) {
//                    if (temp.getNext() == node) {
//                        nodeBefore = temp;
//                        break;
//                    }
//                    temp = temp.getNext();
//                }
//
//                nodeBefore.setNext(node.getNext());
//
//                if (node == this.tail)
//                    this.tail = nodeBefore;
//                node.setNext(null);
//            }
//        }
//    }
//}
//
//class Tester {
//
//    public static void main(String args[]) {
//        LinkedList linkedList1 = new LinkedList();
//        linkedList1.addAtEnd("ABC");
//        linkedList1.addAtEnd("DFG");
//        linkedList1.addAtEnd("XYZ");
//        linkedList1.addAtEnd("EFG");
//
//        LinkedList linkedList2 = new LinkedList();
//        linkedList2.addAtEnd("ABC");
//        linkedList2.addAtEnd("DFG");
//        linkedList2.addAtEnd("XYZ");
//        linkedList2.addAtEnd("EFG");
//
//        System.out.println("Initial List");
//        linkedList1.display();
//
//        System.out.println("\nList after left shifting by 2 positions");
//        shiftListLeft(linkedList1, 2);
//        linkedList1.display();
//
//        System.out.println("\nInitial List");
//        linkedList2.display();
//
//        System.out.println("\nList after right shifting by 2 positions");
//        shiftListRight(linkedList2, 2);
//        linkedList2.display();
//        
//        
//        
//        LinkedList linkedList = new LinkedList();
//        LinkedList reversedLinkedList = new LinkedList();
//
//        linkedList.addAtEnd("Data");
//        linkedList.addAtEnd("Structures");
//        linkedList.addAtEnd("and");
//        linkedList.addAtEnd("Algorithms");
//
//        System.out.println("Initial List:");
//        linkedList.display();
//
//        System.out.println();
//
//        reverseList(linkedList.getHead(), reversedLinkedList);
//        System.out.println("Reversed List:");
//        reversedLinkedList.display();
//    }
//
//    // Shifts the list left by 'n' positions
//    public static void shiftListLeft(LinkedList linkedList, int n) {
//        if (linkedList.getHead() == null || n <= 0) return;
//
//        int size = linkedList.getSize();
//        n = n % size; // In case n is greater than the size of the list
//
//        for (int i = 0; i < n; i++) {
//            Node currentHead = linkedList.getHead();
//            linkedList.setHead(currentHead.getNext()); // Shift the head
//
//            // Add the old head to the end
//            linkedList.addAtEnd(currentHead.getData());
//        }
//        
//      
//        
//    }
//
//    // Shifts the list right by 'n' positions
//    public static void shiftListRight(LinkedList linkedList, int n) {
//        if (linkedList.getHead() == null || n <= 0) return;
//
//        int size = linkedList.getSize();
//        n = n % size; // In case n is greater than the size of the list
//
//        // Right shift by n is equivalent to left shift by (size - n)
//        shiftListLeft(linkedList, size - n);
//    }
//    
//
//  
//}
package dsaLinkedList;


