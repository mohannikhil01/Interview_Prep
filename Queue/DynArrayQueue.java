package Queue;

public class DynArrayQueue {
	
	int front;
	int rear;
	int capacity;
	int[] array;
	
	public DynArrayQueue(int capacity){
		front = -1;
		rear = -1;
		this.capacity = capacity;
		array = new int[capacity];
	}
	
	public boolean isEmpty(){
		return front==-1;
	}
	
	public boolean isFull(){
		return front == (rear+1)%capacity;
	}
	
	public int queueSize(){
		if ( front ==-1 ){
			return 0;
		}
		int size = (capacity - ( front - rear)+1)%capacity;
		if( size ==0 ){
			return capacity;
		}
		return size;
	}
	
	public void enQueue(int data){
		if (isFull()){
			resizeQueue();
		}
		rear = (rear + 1)%capacity;
		array[rear] = data;
		if (front==-1){
			front = rear;
		}
	}
	
	public void resizeQueue(){
		int[] newArray = new int[capacity*2];
		System.arraycopy(array, front, newArray, 0,capacity-front);
		rear = capacity-front-1;
		for(int i=0;i<front;i++){
			newArray[++rear] = array[i];
		}
		front = 0;
		capacity = capacity * 2;
		//rear = rear + capacity;
		array = newArray;
	}
	
	public int deQueue(){
		if ( isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int data = array[front];
			if(front == rear){
				front = rear = -1;
			}
			else{
				front = (front + 1)%capacity;
			}
			return data;
		}
	}
	
	public void printQueueElements(){
		System.out.println("Printing Queue Elements");
		for(int i=front;i<front+queueSize();i++){
			System.out.print(array[i%capacity]);
		}
	}

}
