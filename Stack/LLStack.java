package Stack;

class Node{
	int data;
	Node next;
	Object dataObject;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public Node(Object dataObject){
		this.dataObject = dataObject;
		this.next = null;
	}
	
	public Node(){
		this.next = null;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setDataObject(Object dataObject){
		this.dataObject = dataObject;
	}
	
	public Object getDataObject(){
		return this.dataObject;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Node getNext(){
		return this.next;
	}
	
}
public class LLStack {
	private Node head;
	
	public LLStack(){
		head = null;
	}
	
	public void push(int data){
		if ( head == null){
			head = new Node(data);
		}
		else{
			Node insert = new Node(data);
			insert.setNext(head);
			head = insert;
		}
	}
	
	public void pushObject(Object dataObject){
		if ( head == null){
			head = new Node(dataObject);
		}
		else{
			Node insert = new Node(dataObject);
			insert.setNext(head);
			head = insert;
		}
	}
	
	public int pop(){
		if(head == null){
			// Throw exception
			System.out.println("Empty Stack");
			return -1;
		}
		else{
			int data = head.getData();
			head = head.getNext();
			return data;
		}
	}
	
	public Object popObject(){
		if(head == null){
			// Throw exception
			System.out.println("Empty Stack");
			return null;
		}
		else{
			Object data = head.getDataObject();
			head = head.getNext();
			return data;
		}
	}
	
	public int top(){
		if ( head==null){
			System.out.println("Stack is empty");
			return -1;
		}
		else{
			return head.getData();
		}
	}
	
	public boolean isEmpty(){
		return ( head==null);
	}
	
	public void deleteStack(){
		head = null;
	}
	
	public void printAllElementsInStack(){
		System.out.println("Printing Elements in Stack");
		Node current = head;
		while(current!=null){
			System.out.print(current.getData());
			current = current.getNext();
		}
	}
}
