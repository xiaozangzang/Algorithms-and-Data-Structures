package tree;
/**
 * 
 * 树节点类
 */
public class TreeNode {
	private int val;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
	

}
