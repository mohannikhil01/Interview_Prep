package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class BTSumElements {
	int sum = 0;
	public int sumElements(BTNode root){
		if(root==null){
			return 0;
		}
		sum = sum + root.getData();
		sumElements(root.getLeft());
		sumElements(root.getRight());
		return sum;
	}
	
	
	public int sumElementsNonRecursive(BTNode root){
		int sum =0;
		if(root==null)
			return 0;
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			sum = sum + temp.getData();
			if(temp.getLeft()!=null)
				q.enQueueObject(temp.getLeft());
			if(temp.getRight()!=null)
				q.enQueueObject(temp.getRight());
		}
		return sum;
	}
}
