package LLEx;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Prob8 {
	
	public static void main(String a[]){
	Node head1 = new Node(1);
	Node head2 = new Node(2);
	Node d1 = new Node(3);
	Node d2 = new Node(4);
	Node d3 = new Node(5);
	Node d4 = new Node(6);
	Node d5 = new Node(7);
	Node d6 = new Node(8);
	Node d7 = new Node(9);
	Node d8 = new Node(10);
	Node d9 = new Node(11);
	head1.setNext(d1);
	head2.setNext(d2);
	d1.setNext(d3);
	d2.setNext(d4);	
	d3.setNext(d5);
	d4.setNext(d6);
	d5.setNext(d7);
	d6.setNext(d8);
	d7.setNext(d9);
	Node newLink = sortTwoLinkedList(head1,head2);
	LinkedList x = new LinkedList();
	x.printLinkedList(newLink);
	}
	
	public static Node sortTwoLinkedList(Node head1, Node head2){
		Node newLink = null,curr1 = head1, curr2=head2;
		if (head1.getData()<=head2.getData()){
			newLink = head1;
			curr1 = curr1.getNext();
		}else{
			newLink = head2;
			curr2 = curr2.getNext();
		}
		Node curr3 = newLink;
		while(curr1!=null || curr2!=null){
			if(curr1==null){
				curr3.setNext(curr2);
				curr2 = curr2.getNext();
			}
			else if ( curr2 == null){
				curr3.setNext(curr1);
				curr1 = curr1.getNext();
			}
			else if (curr1.getData() <= curr2.getData()){
				Node n = new Node(curr1.getData());
				Node n2 = null;
				if ( curr1.getData() == curr2.getData()){
					n2 = new Node(curr2.getData());
					curr3.setNext(n2);
					curr3 = curr3.getNext();
					curr2 = curr2.getNext();
				}
				curr1 = curr1.getNext();
				curr3.setNext(n);
			}
			else{
				Node n = new Node(curr2.getData());
				curr2 = curr2.getNext();
				curr3.setNext(n);
			}
			System.out.println(curr3.getData());
			curr3 = curr3.getNext();
			
			
			
	}
		return newLink;
	}
}
