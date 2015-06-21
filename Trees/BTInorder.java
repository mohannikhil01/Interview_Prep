package Trees;

import Stack.LLStack;

public class BTInorder {
	
	public void Inorder(BTNode root){
		if(root!=null){
			Inorder(root.getLeft());
			System.out.print(root.getData()+",");
			Inorder(root.getRight());
		}
	}
	
	public void inOrderNonRecursive(BTNode root){
		System.out.println("In-Order Non-recursive");
		if(root==null){
			System.out.println("There is no tree");
		}
		LLStack stack = new LLStack();
		while(true){
			while(root!=null){
				stack.pushObject(root);
				root = root.getLeft();
			}
			if(stack.isEmpty()){
				break;
			}
			root = (BTNode) stack.popObject();
			System.out.print(root.getData()+",");
			root = root.getRight();
		}
	}

}
