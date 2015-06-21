package Tree_Problems;

import java.util.List;
import java.util.logging.Level;

import Trees.BTInsert;
import Trees.BTLevelOrder;
import Trees.BTNode;

public class Test {
	
	public static void main(String as[]){
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
		
		// Another Same Tree
		BTNode root1 = null;
		root1 = c.insertBinaryTree(root1,1);
		root1 = c.insertBinaryTree(root1,2);
		root1 = c.insertBinaryTree(root1,3);
		root1 = c.insertBinaryTree(root1,4);
		root1 = c.insertBinaryTree(root1,5);
		root1 = c.insertBinaryTree(root1,6);
		root1 = c.insertBinaryTree(root1,7);
		root1 = c.insertBinaryTree(root1,8);
		/*root1 = c.insertBinaryTree(root1,9);
		root = c.insertBinaryTree(root,10);
		root = c.insertBinaryTree(root,11);*/
		//testFindMaxElement(root);
		//testSearchElement(root,0);
		//testBTSize(root);
		//testBTPrintReverseLevelOrder(root);
		//testBTHeight(root);
		//testBTDeepestNode(root);
		//testBTDeleteElement(root);
		//testBTNumberLeaves(root);
		//testBTFullNode(root);
		//testBTHalfNode(root);
		//testBTSameStructure(root,root1);
		//testBTMAXSumElement(root);
		//testBTSumElements(root);
		testBTDiameter(root);
	}
	
	public static void testFindMaxElement(BTNode root){
		FindMaxElement f = new FindMaxElement();
		System.out.println(f.maxElement(root));
		System.out.println(f.maxElementNonRecursive(root));
	}
	
	public static void testSearchElement(BTNode root,int data){
		SearchElement s = new SearchElement();
		System.out.println(s.searchElementRecursive(root, data));
		System.out.println(s.searchElementNonRecursive(root, data));
	}
	
	public static void testBTSize(BTNode root){
		BTSize s = new BTSize();
		System.out.println(s.sizeOfBinaryTree(root));
		System.out.println(s.sizeOfBinaryTreeNonRecursive(root));
	}
	
	public static void testBTPrintReverseLevelOrder(BTNode root){
		BTPrintReverseLevelOrder p = new BTPrintReverseLevelOrder();
		p.printReverseLevelOrder(root);
	}
	
	public static void testBTHeight(BTNode root){
		BTHeight h = new BTHeight();
		System.out.println(h.heightBinaryTree(root)-1);
		System.out.println(h.heightBinaryTreeNonRecursive(root));
	}
	
	public static void testBTDeepestNode(BTNode root){
		BTDeepestNode d = new BTDeepestNode();
		System.out.println(d.findDeepestNode(root));
		List a = d.findDeepestNodesMoreThanOne(root);
		for(int i=0;i<a.size();i++){
			System.out.print(a.get(i)+",");
		}
	}
	
	public static void testBTDeleteElement(BTNode root){
		BTDeleteElement d = new BTDeleteElement();
		BTNode root_update = d.deleteElement(root, 4);
		BTLevelOrder l = new BTLevelOrder();
		l.levelOrder(root_update);
	}
	
	public static void testBTNumberLeaves(BTNode root){
		BTNumberLeaves b = new BTNumberLeaves();
		System.out.println(b.numberOfLeaves(root));
	}
	
	public static void testBTFullNode(BTNode root){
		BTFullNode b = new BTFullNode();
		System.out.println(b.fullNodes(root));
	}
	
	public static void testBTHalfNode(BTNode root){
		BTHalfNode b = new BTHalfNode();
		System.out.println(b.halfNodes(root));
	}
	
	public static void testBTSameStructure(BTNode root,BTNode root1){
		BTSameStructure b = new BTSameStructure();
		System.out.println(b.isSameStructure(root, root1));
	}
	
	public static void testBTMAXSumElement(BTNode root){
		BTMAXSumLevel s = new BTMAXSumLevel();
		System.out.println(s.maxSumLevel(root));
	}
	
	public static void testBTSumElements(BTNode root){
		BTSumElements b = new BTSumElements();
		System.out.println(b.sumElements(root));
		System.out.println(b.sumElementsNonRecursive(root));
	}
	
	public static void testBTDiameter(BTNode root){
		BTDiameter b = new BTDiameter();
	}

}
