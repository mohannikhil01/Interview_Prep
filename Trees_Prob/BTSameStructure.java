package Tree_Problems;

import Trees.BTNode;

public class BTSameStructure {
	
	public boolean isSameStructure(BTNode root1,BTNode root2){
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)   // Good condition. Follow this.
			return false;
		return (root1.getData()==root2.getData() && 
				isSameStructure(root1.getLeft(), root2.getLeft()) && 
				isSameStructure(root1.getRight(), root2.getRight()));
	}

}
