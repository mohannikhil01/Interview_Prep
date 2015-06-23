package LinkedList;

public class FindLength {

	public int findLengthLinkedList(Node head){
		Node current = head;
		int count = 0;
		while(current!=null){
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	public int findLengthWithRecursion(Node head){
		if(head==null){
			return 0;
		}
		int count = findLengthWithRecursion(head.getNext())+1;
		return count;
	}
}
