package Tree_Problems;

import Queue.LLQueue;
import Stack.LLStack;
import Trees.BTNode;

public class BTPrintReverseLevelOrder {
	
	public void printReverseLevelOrder(BTNode root){
		if(root==null)
			System.out.println("No tree");
		LLQueue q = new LLQueue();
		LLStack s = new LLStack();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			if(temp.getLeft()!=null)
				q.enQueueObject(temp.getLeft());
			if(temp.getRight()!=null)
				q.enQueueObject(temp.getRight());
			s.push(temp.getData());
		}
		while(!s.isEmpty()){
			System.out.print(s.pop()+",");
		}
	}

}
