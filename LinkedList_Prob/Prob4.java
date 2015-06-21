package LLEx;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Prob4 {
	
	public static void main(String as[]){
		LinkedList l = new LinkedList();
		Node head = l.prepareLinkedList();
		head = reverseLinkedList(head);
		l.printLinkedList(head);
	}
	
	public static Node reverseLinkedList(Node head){
		Node prev = null, curr = head, next = head.getNext();
		while(curr!=null){
			curr.setNext(prev);
			prev = curr;
			curr = next;
			if(curr!=null)
			next = curr.getNext();
		}
		return prev;
	}

}
