package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class BTSize {

	public int sizeOfBinaryTree(BTNode root){
		if(root==null)
			return 0;
		
		else
			return (sizeOfBinaryTree(root.getLeft())+1+sizeOfBinaryTree(root.getRight()));
	}
	
	
	public int sizeOfBinaryTreeNonRecursive(BTNode root){
		int count =0;
		if(root==null)
			return 0;
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			count++;
			if(temp.getLeft()!=null)
				q.enQueueObject(temp.getLeft());
			if(temp.getRight()!=null)
				q.enQueueObject(temp.getRight());
		}
		return count;
	}
}
