package LinkedList;

//TODO : Try recursive format of this.

public class DeleteFirstElement {

	public Node deleteFirstElementLinkedlist(Node head){
		if(head==null){
			return null;
		}
		head = head.getNext();
		return head;
	}
	
}
