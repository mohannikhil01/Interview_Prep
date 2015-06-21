package LinkedList;

public class LinkedList {
	
	public int linkedListlength(Node head){
		Node current = head;
		int count = 0;
		while ( current !=null ){
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	public Node insertLinkedList(Node head, Node insert, int position){
		if ( head == null ) return insert;
		int size = linkedListlength(head);
		if(position > size+1 || position < 1){
			System.out.println("Invalid position");
			return head;
		}
		if ( position == 1){
			insert.setNext(head);
			head = insert;
			return head;
		}
		if ( position > 1){
			int i=1;
			Node previous = head;
			while ( i < position-1 ){
				previous = previous.getNext();
				i++;
			}
			Node current = previous.getNext();
			insert.setNext(current);
			previous.setNext(insert);
			return head;
		}
		return head;
	}
	
	public Node deleteLinkedList(Node head,int position){
		if(head == null) return head;
		int size= linkedListlength(head);
		if(position > size+1 || position < 1){
			System.out.println("Invalid position");
		}
		if(position ==1 ){
			Node current = head.getNext();
			return current;
		}
		else{
			Node current = head;
			int i =1;
			Node previous = head;
			while( i <position ){
				previous = current;
				current = current.getNext();
				i++;
			}
			previous.setNext(current.getNext());
			return head;
		}
	}
	
	public void printLinkedList(Node head){
		Node current = head;
		while ( current !=null){
			System.out.print(current.getData());
			current = current.getNext();
		}
		System.out.println();
	}
	
	public Node prepareLinkedList(){
		Node head = new Node(1);
		Node current = head;
		for(int i=2;i<=10;i++){
			Node next = new Node(i);
			current.setNext(next);
			current = current.getNext();
		}
		return head;
	}

}
