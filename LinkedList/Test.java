package LinkedList;

public class Test {

	public static void main(String ad[]){
		
		//testLinkedList();
		testDoublyLinkedList();
		//testCircularLinkedList();
	
	}
	
	public static void testLinkedList(){
		System.out.println("----------------------------------------------------");
		System.out.println("Linked List Test");
		LinkedList l = new LinkedList();
		Node d = new Node(1);
		Node d1 = new Node(2);
		Node d2 = new Node(3);
		d.setNext(d1);
		d1.setNext(d2);
		Node d3 = new Node(4);
		Node d4 = new Node(5);
		Node d5 = new Node(6);
		d = l.insertLinkedList(d, d3, 1);
		l.printLinkedList(d);
		d = l.insertLinkedList(d, d4, 5);
		l.printLinkedList(d);
		d = l.insertLinkedList(d, d5, 6);
		l.printLinkedList(d);
		d = l.deleteLinkedList(d,1);
		l.printLinkedList(d);
		d = l.deleteLinkedList(d,3);
		l.printLinkedList(d);
		d = l.deleteLinkedList(d,2);
		l.printLinkedList(d);
		d = l.deleteLinkedList(d,3);
		l.printLinkedList(d);	
	}
	
	public static void testDoublyLinkedList(){
		System.out.println("----------------------------------------------------");
		System.out.println("Doubly Linked List Test");
		DoublyLinkedList l = new DoublyLinkedList();
		DLLNode d1 = new DLLNode(1);
		DLLNode d2 = new DLLNode(2);
		DLLNode d3 = new DLLNode(3);
		DLLNode d4 = new DLLNode(4);
		DLLNode d5 = new DLLNode(5);
		DLLNode head = null;
		head = l.insertDoublyLinkedList(head, d1, 1);
		l.printDoublyLinkedList(head);
		head = l.insertDoublyLinkedList(head, d2, 2);
		l.printDoublyLinkedList(head);
		head = l.insertDoublyLinkedList(head, d3, 3);
		l.printDoublyLinkedList(head);
		head = l.insertDoublyLinkedList(head, d4, 1);
		l.printDoublyLinkedList(head);
		head = l.insertDoublyLinkedList(head, d5, 4);
		l.printDoublyLinkedList(head);
		head = l.deleteDoublyLinkedList(head, 1);
		l.printDoublyLinkedList(head);
		head = l.deleteDoublyLinkedList(head, 3);
		l.printDoublyLinkedList(head);
		head = l.deleteDoublyLinkedList(head, 3);
		l.printDoublyLinkedList(head);
	}
	
	public static void testCircularLinkedList(){
		System.out.println("----------------------------------------------------");
		System.out.println("Circular Linked List Test");
		CircularLinkedList l = new CircularLinkedList();
		CCLNode c1 = new CCLNode(1);
		CCLNode c2 = new CCLNode(2);
		CCLNode c3 = new CCLNode(3);
		CCLNode c4 = new CCLNode(4);
		CCLNode c5 = new CCLNode(5);
		CCLNode head = null;
		head = l.insertCircularLinkedList(head, c1,1);
		l.printCircularLinkedList(head);
		head = l.insertCircularLinkedList(head, c2,2);
		l.printCircularLinkedList(head);
		head = l.insertCircularLinkedList(head, c3,1);
		l.printCircularLinkedList(head);
		head = l.insertCircularLinkedList(head, c4,3);
		l.printCircularLinkedList(head);
		head = l.insertCircularLinkedList(head, c5,5);
		l.printCircularLinkedList(head);
		head = l.deleteCircularLinkedList(head, 1);
		l.printCircularLinkedList(head);
		head = l.deleteCircularLinkedList(head, 2);
		l.printCircularLinkedList(head);
		head = l.deleteCircularLinkedList(head, 3);
		l.printCircularLinkedList(head);
	}
}
