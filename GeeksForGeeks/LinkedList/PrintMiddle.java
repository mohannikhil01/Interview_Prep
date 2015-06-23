package LinkedList;


/**
 * @author Nikhil Mohan
 * 
 * print the middle of a given linked list
 *
 */


/**
 * Method 1:
Traverse the whole linked list and count the no. of nodes. Now traverse the list again till count/2 and return the node at count/2.

Method 2:
Traverse linked list using two pointers. Move one pointer by one and other pointer by two. When the fast pointer reaches end slow 
pointer will reach middle of the linked list.

Method-3:
Initialize mid element as head and initialize a counter as 0. Traverse the list from head, while traversing increment the counter 
and change mid to mid->next whenever the counter is odd. So the mid will move only half of the total length of the list
 *
 */


public class PrintMiddle {
	
	//Method-1
	public Node printMiddleValueIteration(Node head){
		if(head==null){
			return null;
		}
		Node current = head;
		int length = 0;
		while(current!=null){
			length++;
			current = current.getNext();
		}
		if(length%2==0){
			length = length/2+1;
		}else{
			length = (length+1)/2;
		}
		current = head;
		Node previous = head;
		while(length>0){
			previous = current;
			current = current.getNext();
			length--;
		}
		return previous;
	}
	
	// Method-2
	public Node printMiddleValue(Node head){
		if(head!=null){
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.getNext()!=null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		return slow;
		}
		return null;
	}
	
	// Method-3
	public Node printMiddleValueMethod3(Node head){
		if(head==null)
			return null;
		Node current = head;
		Node slow = head;
		int count = 0;
		while(current!=null){
		if(count%2==1){
			slow = slow.getNext();
		}
		current = current.getNext();
		count++;
		}
		return slow;
	}
}
