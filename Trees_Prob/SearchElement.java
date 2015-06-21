package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class SearchElement {

	public boolean searchElementRecursive(BTNode root,int data){
		if(root==null){
			return false;
		}
		int rt = root.getData();
		if(rt==data)
			return true;
		boolean left = searchElementRecursive(root.getLeft(), data);
		boolean right = searchElementRecursive(root.getRight(), data);
		return left || right;
	}
	
	
	public boolean searchElementNonRecursive(BTNode root,int data){
		if(root==null){
			System.out.println("No tree");
		}
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			if(temp.getData()==data)
				return true;
			if(temp.getLeft()!=null)
				q.enQueueObject(temp.getLeft());
			if(temp.getRight()!=null)
				q.enQueueObject(temp.getRight());
		}
		return false;
	}
}
