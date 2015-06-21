package Stack;

public class Test {
	
	public static void main(String sd[]){
		testArrayStack();
		testDynArrayStack();
		testLLStack();
	}
	
	public static void testArrayStack(){
		ArrayStack ar = new ArrayStack();
		ar.push(1);
		ar.push(2);
		ar.push(3);
		ar.push(4);
		ar.pop();
		ar.pop();
		ar.push(5);
		ar.printAllElementsInStack();
	}
	
	public static void testDynArrayStack(){
		DynArrayStack ar = new DynArrayStack();
		ar.push(1);
		ar.push(2);
		ar.push(3);
		ar.push(4);
		ar.pop();
		ar.pop();
		ar.push(5);
		ar.printAllElementsInStack();
	}
	
	public static void testLLStack(){
		LLStack ar = new LLStack();
		ar.push(1);
		ar.push(2);
		ar.push(3);
		ar.push(4);
		ar.pop();
		ar.pop();
		ar.push(5);
		ar.printAllElementsInStack();
	}
	
}
