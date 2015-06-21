package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class BTDeleteElement {
	
	public BTNode deleteElement(BTNode root,int data){
		BTNode temp = null;
		if(root==null){
			System.out.println("No tree");
			return null;
		}
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			temp = (BTNode) q.deQueueObject();
			if(temp.getLeft()!=null)
				q.enQueueObject(temp.getLeft());
			if(temp.getRight()!=null)
				q.enQueueObject(temp.getRight());
		}
		
		q.deleteQueue();
		q.enQueueObject(root);
		BTNode temp2=null;
		while(!q.isEmpty()){
			temp2 = (BTNode) q.deQueueObject();
			if(temp2.getData()==data)
				temp2.setData(temp.getData());
			if(temp2.getLeft()!=null)
				q.enQueueObject(temp2.getLeft());
			if(temp2.getRight()!=null)
				q.enQueueObject(temp2.getRight());
			if(temp2.getLeft()==temp)
				temp2.setLeft(null);
			if(temp2.getRight()==temp)
				temp2.setRight(null);
		}
		return root;
	}
}
