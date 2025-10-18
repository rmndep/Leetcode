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
    int preIndex = 0; 
    int search(int[] inorder,int left, int right,int val){
        for(int i=left;i<=right;i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }

    TreeNode helper(int[] preorder, int[] inorder, int left,int right){
       if(left>right) return null;
       int rootVal = preorder[preIndex++];
        TreeNode root=new TreeNode(rootVal);

        int inorderIndex=search(inorder,left, right,rootVal);
        root.left=helper(preorder,inorder,left,inorderIndex-1);
        root.right=helper(preorder,inorder,inorderIndex+1,right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder, 0,inorder.length-1);
    }
}