package Trees;

import Queue.LLQueue;

public class BTInsert {
	
	public BTNode insertBinaryTree(BTNode root, int data){
		BTNode newNode = new BTNode(data);
		LLQueue q = new LLQueue();
		if (root==null){
			root = newNode;
			return root;
		}
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode tmp = (BTNode) q.deQueueObject();
			if(tmp.getLeft()!=null){
				q.enQueueObject(tmp.getLeft());
			}
			if(tmp.getRight()!=null){
				q.enQueueObject(tmp.getRight());
			}
			if(tmp.getLeft()==null){
				tmp.setLeft(newNode);
				break;
			}
			if(tmp.getLeft()!=null && tmp.getRight()==null){
				tmp.setRight(newNode);
				break;
			}
			
		}
		return root;
	}
}
