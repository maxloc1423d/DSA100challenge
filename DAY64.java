/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isEqual(root.left, root.right);
    }

    public boolean isEqual(TreeNode p, TreeNode q) {
        if (p == q) { 
            return true;
        }
       
        if (p == null||q == null) {
            return false;
        }
       
        if (p.val != q.val) {
            return false;
        }
        if (!isEqual(p.left, q.right)||!isEqual(p.right, q.left)) {
            return false;
        }
      
        return true;
    }
}
