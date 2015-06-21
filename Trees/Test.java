package Trees;

public class Test {

	public static void main(String ad[]){
		BTPreOrder pre = new BTPreOrder();
		BTPostOrder post = new BTPostOrder();
		BTInorder in = new BTInorder();
		BTLevelOrder l = new BTLevelOrder();
		BTInsert c = new BTInsert();
		BTNode root = null;
		root = c.insertBinaryTree(root,1);
		root = c.insertBinaryTree(root,2);
		root = c.insertBinaryTree(root,3);
		root = c.insertBinaryTree(root,4);
		root = c.insertBinaryTree(root,5);
		root = c.insertBinaryTree(root,6);
		root = c.insertBinaryTree(root,7);
		root = c.insertBinaryTree(root,8);
		System.out.println("Pre-Order Result");
		pre.PreOrder(root);
		System.out.println();
		pre.preOrderNonRecursive(root);
		System.out.println();
		System.out.println("Post-Order Result");
		post.PostOrder(root);
		System.out.println();
		post.postOrderNonRecursive(root);
		System.out.println();
		System.out.println("In-Order Result");
		in.Inorder(root);
		System.out.println();
		in.inOrderNonRecursive(root);
		System.out.println();
		l.levelOrder(root);
	}
	
}
