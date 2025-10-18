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
    // public static int height(TreeNode x){
    //     if(x==null) return 1;
    //     int leftH=height(x.left);
    //     int rightH=height(x.right);
    //     return 1+Math.max(leftH,rightH);
    // }
    // public boolean compare(TreeNode root1,TreeNode root2){
    //     if (root1 == null && root2 == null) return true;
    //     if (root1 == null || root2 == null) return false;
    //     if (root1.val != root2.val) return false;
    //     return compare(root1.left, root2.left) && compare(root1.right, root2.right);
    // }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // int h1=height(p);
        // int h2=height(q);

        // if(h1==h2 && compare(p,q)){
        //     return true;
        // }
        // return false;
        if(p==null || q==null) return p==q;

        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}