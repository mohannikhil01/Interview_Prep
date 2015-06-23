package LinkedList;

public class SearchElement {

	public boolean searchElementLinkedList(Node head,int x){
		Node current = head;
		while(current!=null){
			if(current.getData()==x){
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	public boolean searchElementRecursive(Node head,int x){
		if(head==null){
			return false;
		}
		if(head.getData()==x){
			return true;
		}
		return searchElementRecursive(head.getNext(),x);
	}
}
