package LinkedList;

//TODO : If the element is the last to be deleted.

/**
 * @author Nikhil Mohan
 * 
 * Given only a pointer to a node to be deleted in a singly linked list, how do you delete it?
 *
 */

/**
 * Fast solution is to copy the data from the next node to the node to be deleted and delete the next node.This solution doesn’t work 
 * if the node to be deleted is the last node of the list. To make this solution work we can mark the end node as a dummy node. 
 * 
 */

public class DeletePointedNode {

	public Node deletePointedNodeLinkedList(Node head,Node pointer){
		Node next = pointer.getNext();
		if(next!=null){
		pointer.setData(next.getData());
		pointer.setNext(next.getNext());
		}
		else{
			//TODO
		}
		return head;
	}
}
