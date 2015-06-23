package LinkedList;

public class TestG {

		public static void main(String sd[]){
			
			//testFindLength();
			//testSearchElement();
			//testDeleteFirstElement();
			//testNthNode();
			//testDeletePointedNode();
			//testPrintMiddleValue();
			//testNthNodeFromEnd();
			testElementCount();
		}
		
		public static void testFindLength(){
			FindLength f = new FindLength();
			LinkedList l = new LinkedList();
			Node head = l.prepareLinkedList(10);
			System.out.println(f.findLengthLinkedList(head));
			System.out.println(f.findLengthWithRecursion(head));
		}
		
		public static void testSearchElement(){
			SearchElement s = new SearchElement();
			LinkedList l = new LinkedList();
			Node head = l.prepareLinkedList(10);
			System.out.println(s.searchElementLinkedList(head, 10));
			System.out.println(s.searchElementRecursive(head, 10));
			System.out.println(s.searchElementLinkedList(head, 11));
			System.out.println(s.searchElementRecursive(head, 11));
			System.out.println(s.searchElementLinkedList(head, 0));
			System.out.println(s.searchElementRecursive(head, 0));
			System.out.println(s.searchElementLinkedList(head, 1));
			System.out.println(s.searchElementRecursive(head, 1));
			System.out.println(s.searchElementLinkedList(head, 3));
			System.out.println(s.searchElementRecursive(head, 3));
		}
		
		public static void testDeleteFirstElement(){
			DeleteFirstElement d = new DeleteFirstElement();
			LinkedList l = new LinkedList();
			Node head = l.prepareLinkedList(2);
			head = d.deleteFirstElementLinkedlist(head);
			l.printLinkedList(head);
			head = d.deleteFirstElementLinkedlist(head);
			l.printLinkedList(head);
			head = d.deleteFirstElementLinkedlist(head);
			l.printLinkedList(head);
		}
		
		public static void testNthNode(){
			NthNodeFromStart n = new NthNodeFromStart();
			LinkedList l = new LinkedList();
			Node head = l.prepareLinkedList(2);
			Node temp = n.getNthNodeData(head, 1);
			if(temp ==null)
				System.out.println("Data Not found");
			else{
				System.out.println(temp.getData());
			}
			temp = n.getNthNodeData(head, 0);
			if(temp ==null)
				System.out.println("Data Not found");
			else{
				System.out.println(temp.getData());
			}
			temp = n.getNthNodeData(head, 2);
			if(temp ==null)
				System.out.println("Data Not found");
			else{
				System.out.println(temp.getData());
			}
		}
		
		public static void testDeletePointedNode(){
			DeletePointedNode p = new DeletePointedNode();
			LinkedList l = new LinkedList();
			Node head = l.prepareLinkedList(2);
			l.printLinkedList(head);
			head = p.deletePointedNodeLinkedList(head, head);
			l.printLinkedList(head);
		}
		
		public static void testPrintMiddleValue(){
			PrintMiddle m = new PrintMiddle();
			LinkedList l = new LinkedList();
			
			Node head = l.prepareLinkedList(2);
			l.printLinkedList(head);
			Node temp = m.printMiddleValue(head);
			testReturnValue(temp);
			temp = m.printMiddleValueIteration(head);
			testReturnValue(temp);
			temp = m.printMiddleValueMethod3(head);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(6);
			l.printLinkedList(head);
			temp = m.printMiddleValue(head);
			testReturnValue(temp);
			temp = m.printMiddleValueIteration(head);
			testReturnValue(temp);
			temp = m.printMiddleValueMethod3(head);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(1);
			l.printLinkedList(head);
			temp = m.printMiddleValue(head);
			testReturnValue(temp);
			temp = m.printMiddleValueIteration(head);
			testReturnValue(temp);
			temp = m.printMiddleValueMethod3(head);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(7);
			l.printLinkedList(head);
			temp = m.printMiddleValue(head);
			testReturnValue(temp);
			temp = m.printMiddleValueIteration(head);
			testReturnValue(temp);
			temp = m.printMiddleValueMethod3(head);
			testReturnValue(temp);
		}
		
		public static void testReturnValue(Node temp){
			if(temp==null){
				System.out.println("No Element");
			}else{
			System.out.println(temp.getData());
			}
		}
		
		public static void testNthNodeFromEnd(){
			NthNodeFromEnd n = new NthNodeFromEnd();
			LinkedList l = new LinkedList();
			
			Node head = l.prepareLinkedList(2);
			l.printLinkedList(head);
			Node temp = n.NthNodeFromEndLinkedList(head, 1);
			testReturnValue(temp);
			temp = n.NthNodeFromEndLinkedListMethod2(head,1);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(6);
			l.printLinkedList(head);
			temp = n.NthNodeFromEndLinkedList(head, 1);
			testReturnValue(temp);
			temp = n.NthNodeFromEndLinkedListMethod2(head,1);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(6);
			l.printLinkedList(head);
			temp = n.NthNodeFromEndLinkedList(head, 4);
			testReturnValue(temp);
			temp = n.NthNodeFromEndLinkedListMethod2(head,4);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(6);
			l.printLinkedList(head);
			temp = n.NthNodeFromEndLinkedList(head, 6);
			testReturnValue(temp);
			temp = n.NthNodeFromEndLinkedListMethod2(head,6);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(5);
			l.printLinkedList(head);
			temp = n.NthNodeFromEndLinkedList(head, 1);
			testReturnValue(temp);
			temp = n.NthNodeFromEndLinkedListMethod2(head,1);
			testReturnValue(temp);
			
			head = l.prepareLinkedList(1);
			l.printLinkedList(head);
			temp = n.NthNodeFromEndLinkedList(head, 1);
			testReturnValue(temp);
			temp = n.NthNodeFromEndLinkedListMethod2(head,1);
			testReturnValue(temp);
		}
		
		public static void testElementCount(){
			AnElementCount a = new AnElementCount();
			LinkedList l = new LinkedList();
			Node head = l.prepareLinkedList(2);
			l.printLinkedList(head);
			System.out.println(a.elementCount(head, 3));
			System.out.println(a.elementCount(head, 2));
			System.out.println(a.elementCount(head, 1));
		}
}
