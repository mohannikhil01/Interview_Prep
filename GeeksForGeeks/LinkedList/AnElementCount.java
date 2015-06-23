package LinkedList;


/**
 * @author Nikhil Mohan
 * 
 *  counts the number of times a given int occurs in a Linked List
 *
 */
public class AnElementCount {
	
	public int elementCount(Node head,int n){
		if(head == null){
			System.out.println("No data");
			return 0;
		}
		int count =0;
		Node current = head;
		while(current!=null){
			if(current.getData()==n)
				count++;
			current = current.getNext();
		}
		return count;
	}

}
