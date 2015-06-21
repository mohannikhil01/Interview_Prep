package Tree_Problems;

import java.util.ArrayList;
import java.util.List;

import Queue.LLQueue;
import Trees.BTNode;

public class BTDeepestNode {

	public int findDeepestNode(BTNode root){
		BTNode temp=null;
		if(root==null){
			System.out.println("No tree");
			return -1;
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
		return temp.getData();
	}
	
	public List<Integer> findDeepestNodesMoreThanOne(BTNode root){
		BTNode temp = null;
		List a= new ArrayList<Integer>();;
		if(root==null){
			System.out.println("NO tree");
			return a;
		}
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		q.enQueueObject(null);
		a.add(root.getData());
		while(!q.isEmpty()){
			temp = (BTNode) q.deQueueObject();
			if(temp==null){
				if(!q.isEmpty()){                   // This condition is important to know if we have reached the end of tree. Else it may
													// go to infinite loop of placing null values.
					a = new ArrayList<Integer>();   // This placement is important. Look out for this one.
					q.enQueueObject(null);
				}
			}else{
				a.add(temp.getData());
				if(temp.getLeft()!=null){
					q.enQueueObject(temp.getLeft());
				}
				if(temp.getRight()!=null){
					q.enQueueObject(temp.getRight());
				}
			}
		}
		return a;
	}
}
