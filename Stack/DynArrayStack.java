package Stack;

public class DynArrayStack {
	int top;
	int capacity;
	int[] array;
	
	public DynArrayStack(){
		top =-1;
		capacity = 3;
		array = new int[capacity];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top == array.length-1);
	}
	
	public void push(int data){
		if (isFull()){
			doubleStack();
		}
		array[++top] = data;
	}
	
	public int pop(){
		if (isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		else{
			return array[top--];
		}
	}
	
	public void doubleStack(){
		int[] newArray = new int[capacity*2];
		System.arraycopy(array, 0, newArray, 0, capacity);
		capacity = capacity * 2;
		array = newArray;
	}
	
	public void printAllElementsInStack(){
		System.out.println("Printing Elements in Stack");
		for(int i=top;i>=0;i--){
			System.out.print(array[i]);
		}
	}

}
