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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root,0,targetSum);
        
    }
    public boolean sum(TreeNode root,int addtion,int targetSum){
        if(root==null){
            return false;
        }
        else if(root.left==null && root.right==null){
            return addtion+root.val==targetSum;
        }
        else{
            return sum(root.left, addtion + root.val, targetSum) ||
                    sum(root.right, addtion + root.val, targetSum);
        }
    }
}
