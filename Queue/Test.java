package Queue;

public class Test {
	
	public static void main(String ad[]){
		
		//testArrayQueue();
		testDynArrayQueue();
		testLinkedListQueue();
	}
	
	public static void testArrayQueue(){
		ArrayQueue q = new ArrayQueue(4);
		System.out.println(q.queueSize());
		q.enQueue(1);
		System.out.println(q.queueSize());
		q.enQueue(2);
		System.out.println(q.queueSize());
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.enQueue(8);
		System.out.println(q.queueSize());
		q.printQueueElements();
		System.out.println();
	}
	
	public static void testDynArrayQueue(){
		DynArrayQueue q = new DynArrayQueue(2);
		System.out.println(q.queueSize());
		q.enQueue(1);
		System.out.println(q.queueSize());
		q.enQueue(2);
		System.out.println(q.queueSize());
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.enQueue(8);
		q.enQueue(9);
		q.enQueue(10);
		q.enQueue(11);
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		q.enQueue(12);
		q.enQueue(13);
		q.enQueue(14);
		q.enQueue(15);
		q.printQueueElements();
		System.out.println();
	}
	
	public static void testLinkedListQueue(){
		LLQueue q = new LLQueue();
		System.out.println(q.queueSize());
		q.enQueue(1);
		System.out.println(q.queueSize());
		q.enQueue(2);
		System.out.println(q.queueSize());
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.enQueue(8);
		q.enQueue(9);
		q.enQueue(10);
		q.enQueue(11);
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		System.out.println(q.queueSize());
		q.deQueue();
		q.enQueue(12);
		q.enQueue(13);
		q.enQueue(14);
		q.enQueue(15);
		q.printQueueElements();

	}

}
