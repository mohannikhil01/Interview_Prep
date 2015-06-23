package LinkedList;

public class NthNodeFromStart {

	// To differentiate between an existent value or not, the return is made as Node instead of data
	public Node getNthNodeData(Node head,int n){
		if(head == null)
			return null;
		Node current = head;
		int count = 0;
		while(current!=null){
			if(count==n){
				return current;
			}
			current = current.getNext();
			count++;
		}
		/*for(int i=0;i<count;i++){
			current = current.getNext();
		}*/
		return null;
	}
}
