package Trees;

import Queue.LLQueue;

public class BTLevelOrder {
	
	public void levelOrder(BTNode root){
		System.out.println("Level Order Traversal");
		if(root==null){
			System.out.println("No tree");
		}
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			System.out.print(temp.getData()+",");
			if(temp.getLeft()!=null){
				q.enQueueObject(temp.getLeft());
			}
			if(temp.getRight()!=null){
				q.enQueueObject(temp.getRight());
			}
		}
	}

}
