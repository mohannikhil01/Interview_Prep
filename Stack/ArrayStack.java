package Stack;

public class ArrayStack {
	int top;
	int capacity;
	int[] array;
	
	
	public ArrayStack(){
		top = -1;
		capacity = 3;
		array = new int[capacity];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return ( top==array.length-1);
	}
	
	public void push(int data){
		if (isFull()){
			System.out.println("Stack is Full");
		}
		else{
			array[++top] = data;
		}
	}
	
	public int pop(){
		if (isEmpty()){
			// Handle exception here instead of print statement later.
			System.out.println("Stack is Empty");
			return -1;
		}
		else{
			return array[top--];
		}
	}
	
	public void deleteStack(){
		top = -1;
	}
	
	public void printAllElementsInStack(){
		System.out.println("Printing Elements in Stack");
		for(int i=top;i>=0;i--){
			System.out.print(array[i]);
		}
	}

}
