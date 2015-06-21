package LinkedList;

public class Node {
	
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public Node(){
		
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return this.next;
	}

}
