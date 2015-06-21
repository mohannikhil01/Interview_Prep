package Queue;

class Node{
	int data;
	Node next;
	Object dataObject;
	
	public Node(){
		this.next = null;
	}
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public Node(Object dataObject){
		this.dataObject = dataObject;
		this.next = null;
	}
	
	public void setObject(Object dataObject){
		this.dataObject = dataObject;
	}
	
	public Object getDataObject(){
		return this.dataObject;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public int getData(){
		return this.data;
	}
	
	public Node getNext(){
		return this.next;
	}
	
}
public class LLQueue {
	private Node frontNode;
	private Node rearNode;
	
	public LLQueue(){
		frontNode = rearNode = null;
	}
	
	public boolean isEmpty(){
		return frontNode == null;
	}
	
	public void enQueue(int data){
		Node newNode =  new Node(data);
		if (rearNode!=null)
			rearNode.setNext(newNode);
		rearNode = newNode;
		if ( frontNode == null){
			frontNode = rearNode;
		}
	}
	
	public void enQueueObject(Object dataObject){
		Node newNode = new Node(dataObject);
		if (rearNode!=null){
			rearNode.setNext(newNode);
		}
		rearNode = newNode;
		if (frontNode==null){
			frontNode = rearNode;
		}
	}
	
	public int deQueue(){
		if ( isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		else{
			int data = frontNode.getData();
			frontNode = frontNode.getNext();
			return data;
		}
	}
	
	public Object deQueueObject(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return null;
		}
		else{
			Object data = frontNode.getDataObject();
			frontNode = frontNode.getNext();
			return data;
		}
		
	}
	
	public int queueSize(){
		Node current = frontNode;
		int count = 0;
		while(current!=null){
			System.out.println(frontNode.getData());
			current = current.getNext();
			count++;
		}
		return count;
	}
	
	public void deleteQueue(){
		frontNode = rearNode = null;
	}
	
	public void printQueueElements(){
		Node current = frontNode;
		while(current!=null){
			System.out.print(current.getData());
			current = current.getNext();
		}
	}
}
