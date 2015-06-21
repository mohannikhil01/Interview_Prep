package LinkedList;

public class DoublyLinkedList {

	public int lengthDoublyLinkedList(DLLNode head){
		DLLNode current = head;
		int count =0;
		while(current !=null){
			current = current.getNext();
			count++;
		}
		return count;
	}
	
	public DLLNode insertDoublyLinkedList(DLLNode head, DLLNode insert, int position){
		int size = lengthDoublyLinkedList(head);
		if(size==0){
			return insert;
		}
		if( position > size+1 || position < 1){
			System.out.println("Invalid position given");
			return head;
		}
		if(position ==1){
			insert.setNext(head);
			head.setPrevious(insert);
			head = insert;
			return head;
		}
		else{
			int count = 1;
			DLLNode previous = head;
			while( count < position-1 ){
				previous = previous.getNext();
				count++;
			}
			DLLNode current = previous.getNext();
			insert.setNext(current);
			insert.setPrevious(previous);
			if ( current != null){
				current.setPrevious(insert);
			}
			previous.setNext(insert);
			return head;
		}
	}
	
	public DLLNode deleteDoublyLinkedList(DLLNode head, int position){
		int size = lengthDoublyLinkedList(head);
		if(size==0) {
			return head;
		}
		if(position > size +1 || position < 1){
			System.out.println("Invalid position");
		}
		if(position == 1){
			DLLNode previous = head;
			DLLNode current = previous.getNext();
			head = current;
			head.setPrevious(null);
			return head;
		}
		else{
			DLLNode previous = head;
			int count =1;
			while(count < position -1){
				previous = previous.getNext();
				count++;
			}
			DLLNode current = previous.getNext();
			DLLNode next = current.getNext();
			if(next!=null)
			next.setPrevious(previous);
			previous.setNext(current.getNext());
		}
		return head;
	}
	
	public void printDoublyLinkedList(DLLNode head){
		DLLNode current = head;
		while(current!=null){
			System.out.print(current.getData());
			current = current.getNext();
		}
		System.out.println();
	}
	
	
}
