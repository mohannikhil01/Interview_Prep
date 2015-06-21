package LLEx;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Prob1 {
	
	public static void  main(String as[]){
		LinkedList l = new LinkedList();
		Node head = l.prepareLinkedList();
		l.printLinkedList(head);
		findNodeFromEnd(head,5);
		findNodeFromEnd2(head,5);
	}
	
	public static void findNodeFromEnd(Node head,int n){
		Node current = head;
		LinkedList l = new LinkedList();
		int size = l.linkedListlength(head);
		int nodePosition = size - n + 1;
		int count =1;
		while( count <nodePosition){
			current = current.getNext();
			count++;
		}
		System.out.println(current.getData());
	}
	
	public static void findNodeFromEnd2(Node head, int n){
		Node previous = head, current = head;
		int count = 1;
		while(current.getNext()!=null){
			current = current.getNext();
			count++;
			if(count > n){
				previous = previous.getNext();
			}
		}
		System.out.println(previous.getData());
	}

}
