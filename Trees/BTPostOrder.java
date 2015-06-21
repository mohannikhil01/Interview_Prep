package Trees;

import Stack.LLStack;

public class BTPostOrder {

	public void PostOrder(BTNode root){
		if(root!=null){
		PostOrder(root.getLeft());
		PostOrder(root.getRight());
		System.out.print(root.getData()+",");
		}
	}
	
	public void postOrderNonRecursive(BTNode root){
		//TODO
	}
}
