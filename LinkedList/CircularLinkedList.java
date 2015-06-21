package LinkedList;

public class CircularLinkedList {
	
	public int lengthCircularLinkedList(CCLNode head){
		int length =0;
		CCLNode current = head;
		while(current!=null){
			length++;
			current = current.getNext();
			if(current == head){
				break;
			}
		}
		return length;
		
	}
	
	public CCLNode insertCircularLinkedList(CCLNode head, CCLNode insert, int position){
		int size = lengthCircularLinkedList(head);
		CCLNode previous = null;
		if(head == null){
			return insert;
		}
		if(position ==1 ){
			CCLNode current = head;
			while(current !=null){
				previous = current;
				current = current.getNext();
				if(current == head){
					break;
				}
			}
			insert.setNext(head);
			previous.setNext(insert);
			head = insert;
			return head;
		}
		if(position > size +1 || position < 1){
			System.out.println("Invalid position");
		}
		else{
			previous = head;
			int count =1;
			while(count < position -1 ){
				previous = previous.getNext();
				count++;
			}
			CCLNode current = previous.getNext();
			insert.setNext(current);
			previous.setNext(insert);
			return head;
		}
		return head;
	}
	
	public CCLNode deleteCircularLinkedList(CCLNode head,int position){
		int size = lengthCircularLinkedList(head);
		if(size == 0) return head;
		if( position > size +1 || position < 1)
		{
			System.out.println("Invalid position");
		}
		if(position == 1){
			CCLNode current = head;
			CCLNode previous = head;
			while(current!=null){
				previous = current;
				current = current.getNext();
				if(current==head)break;
			}
			previous.setNext(current.getNext());
			head = current.getNext();
			return head;
		}
		else{
			CCLNode previous = head;
			int count = 1;
			while(count < position -1){
				previous = previous.getNext();
				count++;
			}
			CCLNode current = previous.getNext();
			previous.setNext(current.getNext());
			return head;
		}
	}
	
	public void printCircularLinkedList(CCLNode head){
		CCLNode current = head;
		while(current!=null){
			System.out.print(current.getData());
			current = current.getNext();
			if(current == head){
				break;
			}
		}
		System.out.println();
	}
	
	

}
