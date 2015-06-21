package Trees;

import Stack.LLStack;

public class BTPreOrder {
	
	public void PreOrder(BTNode root){
		if(root!=null){
			System.out.print(root.getData()+",");
			PreOrder(root.getLeft());
			PreOrder(root.getRight());
		}
	}
	
	public void preOrderNonRecursive(BTNode root){
		System.out.println("Non-recursive method for preorder");
		if(root==null){
			System.out.println("There is not tree");
		}
		LLStack stack = new LLStack();
		while(true){
		while(root!=null){
			System.out.print(root.getData()+",");
			stack.pushObject(root);
			root = root.getLeft();
		}
		if(stack.isEmpty())
			break;
		root = (BTNode) stack.popObject();
		root = root.getRight();
		}
	}

}
