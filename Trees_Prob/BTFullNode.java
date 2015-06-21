package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class BTFullNode {

	public int fullNodes(BTNode root){
		int count = 0;
		if(root==null){
			System.out.println("No tree");
			return -1;
		}
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			if(temp.getLeft()!=null)
				q.enQueueObject(temp.getLeft());
			if(temp.getRight()!=null)
				q.enQueueObject(temp.getRight());
			if(temp.getLeft()!=null && temp.getRight()!=null)
				count++;
		}
		return count;
	}
}
