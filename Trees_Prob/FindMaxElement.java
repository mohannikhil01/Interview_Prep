package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class FindMaxElement {
	
	public int maxElement(BTNode root){
		int max = 0;
		if(root==null){
			return -1;
		}
		int rt = root.getData();
		int left = maxElement(root.getLeft());
		int right = maxElement(root.getRight());
		if (left > right)
			max = left;
		else
			max = right;
		if(rt > max)
			max = rt;
		
		return max;
	}
	
	public int maxElementNonRecursive(BTNode root){
		int rt = 0,max =0;
		if(root==null){
			System.out.println("No tree");
		}
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
		    rt = temp.getData();
			if(temp.getLeft()!=null){
				q.enQueueObject(temp.getLeft());
			}
			if(temp.getRight()!=null){
				q.enQueueObject(temp.getRight());;
			}
			if(rt > max)
				max = rt;
		}
		return max;
	}

}
