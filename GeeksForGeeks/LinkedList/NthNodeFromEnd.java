package LinkedList;



/**
 * @author Nikhil Mohan
 * 
 * Nth node from the end of a Linked List
 *
 */



/**
 * Method 1 (Use length of linked list)
1) Calculate the length of Linked List. Let the length be len.
2) Print the (len – n + 1)th node from the begining of the Linked List.

Method 2 (Use two pointers) 
Maintain two pointers – reference pointer and main pointer. Initialize both reference and 
main pointers to head. First move reference pointer to n nodes from head. Now move both pointers one by one 
until reference pointer reaches end. Now main pointer will point to nth node from the end. Return main pointer.

 *
 */
public class NthNodeFromEnd {

	// Method-1
	public Node NthNodeFromEndLinkedList(Node head,int n){
		if(head==null)
			return null;
		Node current = head;
		int length = 0;
		while(current!=null){
			length++;
			current = current.getNext();
		}
		int startCount = length -n+1;
		current = head;
		for(int i=1;i<startCount;i++){
			current = current.getNext();
		}
		return current;
	}
	
	// Method -2
	public Node NthNodeFromEndLinkedListMethod2(Node head,int n){
		Node fast = head;
		Node slow = head;
		for(int i=0;i<n;i++){
			if(fast!=null)
				fast = fast.getNext();
		}
		while(fast!=null){
			slow = slow.getNext();
			fast = fast.getNext();
		}
		return slow;
	}

}
