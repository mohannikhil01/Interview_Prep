package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class BTHeight {
	
	public int heightBinaryTree(BTNode root){
		int leftHeight=0,rightHeight=0;
		if(root==null)
			return 0;
		leftHeight = heightBinaryTree(root.getLeft());
		rightHeight = heightBinaryTree(root.getRight());
		if (leftHeight > rightHeight)
			return leftHeight+1;
		else
			return rightHeight+1;
	}
	
	public int heightBinaryTreeNonRecursive(BTNode root){
		int level =0;
		if(root==null)
			return 0;
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		q.enQueueObject(null);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			if(temp==null){
				if(!q.isEmpty()){
					q.enQueueObject(null);
					level++;
				}
			}
			else {
				if(temp.getLeft()!=null)
					q.enQueueObject(temp.getLeft());
				if(temp.getRight()!=null)
					q.enQueueObject(temp.getRight());
		}
	}
		return level;
	}
}
