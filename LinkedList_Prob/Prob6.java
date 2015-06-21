package LLEx;

public class Prob6 {
	
	Tree t = new Tree();
	

}

class Tree{
	
	int i;
	Tree left;
	Tree right;
	
	public Tree(){
		this.i = 0;
		this.left = null;
		this.right = null;
	}
	
	public void setData(int i){
		this.i = i;
	}
	
	public void setLeft(Tree left){
		this.left = left;
	}
	
	public void setRight(Tree right){
		this.right = right;
	}
	
	public int getData(){
		return i;
	}
	
	public Tree getLeft()
	{
		return left;
	}
	
	public Tree getRight()
	{
		return right;
	}
}