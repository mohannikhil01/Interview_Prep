package LinkedLists;

import LinkedList.Node;

public class WeaveLinkedList {
	
	public Node weaveLinkedListHalf(Node head){
		Node fast = head;
		Node slow = head;
		Node newLinkedList = new Node();
		Node current = newLinkedList;
		while(fast!=null && fast.getNext()!=null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		fast = head;
		while(slow!=null){
			Node next = new Node(fast.getData());
			Node next2 = new Node(slow.getData());
			current.setNext(next);
			current = current.getNext();
			current.setNext(next2);
			slow  = slow.getNext();
			fast = fast.getNext();
			current = current.getNext();
		}
		fast.setNext(null);
		return newLinkedList.getNext();
	}

}
