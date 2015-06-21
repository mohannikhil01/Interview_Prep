package LinkedLists;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Test {

	public static void main(String as[]){
		testWeaveLinkedList();
	}
	
	public static void testWeaveLinkedList(){
		WeaveLinkedList w = new WeaveLinkedList();
		LinkedList l = new LinkedList();
		Node head = l.prepareLinkedList();
		l.printLinkedList(head);
		head = w.weaveLinkedListHalf(head);
		l.printLinkedList(head);
	}
}
