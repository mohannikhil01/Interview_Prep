package Trees;

public class BTNode {
	
	private int data;
	private BTNode left;
	private BTNode right;
	
	public BTNode(){
		
	}
	
	public BTNode(int data){
		this.data = data;
		this.left = this.right = null;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setLeft(BTNode left){
		this.left = left;
	}
	
	public void setRight(BTNode right){
		this.right = right;
	}
	
	public int getData(){
		return this.data;
	}
	
	public BTNode getLeft(){
		return this.left;
	}
	
	public BTNode getRight(){
		return this.right;
	}

}
