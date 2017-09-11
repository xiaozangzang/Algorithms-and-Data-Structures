package tree;
/**
 *操作给定的二叉树，将其变换为原二叉树的镜像。
 */
public class Solution02 {
	public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode temp = root.getRight();
        root.setRight(root.getLeft());
        root.setLeft(temp);
        Mirror(root.getLeft());
        Mirror(root.getRight());
    }
}
