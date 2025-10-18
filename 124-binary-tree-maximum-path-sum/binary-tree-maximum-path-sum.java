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
    int helper(TreeNode root, int[] maxi){
        if(root==null) return 0;
        int lh=Math.max(0,helper(root.left,maxi));
        int rh=Math.max(0,helper(root.right,maxi));
        maxi[0]=Math.max(maxi[0],lh+rh+root.val);

        return Math.max(lh,rh)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        int[] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        helper(root,maxi);
        return maxi[0];
    }
}