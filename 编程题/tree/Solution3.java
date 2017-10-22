/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
*  判断两棵树是否相等
*/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
         if (p == null && q == null ) {
            return true;
        }
        if (p != null && q == null || p == null && q != null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}