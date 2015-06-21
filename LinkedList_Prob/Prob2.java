package LLEx;

import LinkedList.Node;

public class Prob2 {
	
	public static void main(String as[]){
		Node head = new Node(1);
		Node d = new Node(2);
		Node d1 = new Node(3);
		Node d2 = new Node(4);
		Node d3 = new Node(5);
		Node d4 = new Node(6);
		Node d5 = new Node(7);
		Node d6 = new Node(8);
		Node d7 = new Node(9);
		Node d8 = new Node(10);
		head.setNext(d);
		d.setNext(d1);
		d1.setNext(d2);
		d2.setNext(d3);
		d3.setNext(d4);
		d4.setNext(d5);
		d5.setNext(d6);
		d6.setNext(d7);
		d7.setNext(d8);
		
		// For loop uncomment below line
		d8.setNext(d3);
		boolean loop = findLoop(head);
		if(loop == true){
			System.out.println("There is loop inside the linked list");
		}else{
			System.out.println("No loop");
		}
		findStartNodeLoop(head);
		
		int l = findLoopLength(head);
		System.out.println(l);
	}
	
	public static boolean findLoop(Node head){
		boolean flag= false;
		Node slow = head, fast = head;
		while(slow!=null && fast!=null && fast.getNext()!=null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if(slow==fast){
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void findStartNodeLoop(Node head){
		Node slow = head, fast = head;
		boolean flag = false;
		while(slow!=null && fast!=null && fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow==fast){
				flag = true;
				System.out.println(slow.getData());
				System.out.println(fast.getData());
				break;
			}
		}
		if(flag == true){
			slow = head;
			while(slow != fast){
				slow = slow.getNext();
				fast = fast.getNext();
			}
			System.out.println(fast.getData());
		}
	}
	
	public static int findLoopLength(Node head){
		Node slow = head, fast = head;
		boolean flag = false;
		int count = 1;
		while(slow!=null && fast!=null && fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow==fast){
				flag = true;
				System.out.println(slow.getData());
				System.out.println(fast.getData());
				break;
			}
		}
		if(flag == true){
			fast = fast.getNext();
			while(slow!=fast){
				fast = fast.getNext();
				count++;
			}
		}
		return count;
	}

}
