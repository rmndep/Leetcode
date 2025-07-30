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
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    static int height(TreeNode root){
        if(root == null) return 1;

       int lefts=height(root.left);
        if(lefts==-1) return -1;
       int rights=height(root.right);
        if(rights==-1) return -1;

        if (Math.abs(lefts-rights)>1) return -1;

        return 1+Math.max(lefts,rights);
    }
}