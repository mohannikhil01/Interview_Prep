package LLEx;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Prob5 {
	
	public static void main(String as[]){
		Node head = new Node(1);
		Node d = new Node(2);
		Node d1 = new Node(3);
		Node d2 = new Node(4);
		Node d3 = new Node(5);
		Node d4 = new Node(6);
		Node d5 = new Node(7);
		Node d6 = new Node(8);
		Node d7 = new Node(9);
		Node d8 = new Node(10);
		head.setNext(d);
		d.setNext(d1);
		d1.setNext(d2);
		d2.setNext(d3);
		d3.setNext(d4);
		d4.setNext(d5);
		d5.setNext(d6);
		d6.setNext(d7);
		d7.setNext(d8);
		
		Node head2 = new Node(11);
		Node d12 = new Node(12);
		Node d13 = new Node(13);
		head2.setNext(d12);
		d12.setNext(d13);
		d13.setNext(d6);
		
		LinkedList l = new LinkedList();
		int len1 = l.linkedListlength(head);
		int len2 = l.linkedListlength(head2);
		int diff = 0;
		Node current1 = null;
		Node current2 = null;
		if(len1 > len2){
			diff = len1 - len2;
			current1 = head;
			current2 = head2;
		}else{
			diff = len2 - len1;
			current2 = head2;
			current1 = head;
		}
		int count =1;
		for(int i=0;i<diff;i++){
			current1 =current1.getNext();
		}
		while(current1!=null){
			if(current1 == current2){
				System.out.println(current1.getData()); 
				break;
			}
				current1 = current1.getNext();
				current2 = current2.getNext();
			
			}
		}
		
	}


