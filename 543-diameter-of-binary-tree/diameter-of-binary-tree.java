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
    int max=0;

    int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        //diameter[0]=Math.max(diameter[0],lh+rh);

        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        // int[] diameter=new int[1];
        // height(root, diameter);
        // return diameter[0];
        // if(root==null) return 0;
        // int l=height(root.left);
        // int r=height(root.right);
        // max=Math.max(max,l+r);

        // diameterOfBinaryTree(root.left);
        // diameterOfBinaryTree(root.right);

        // return max;

        if(root==null) return 0;

        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        int lh=height(root.left);
        int rh=height(root.right);

        int selfD=lh+rh;

        return Math.max(selfD,Math.max(ld,rd));

    }
}