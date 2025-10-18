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
    void helper(TreeNode root, int targetSum, List<List<Integer>> ans, ArrayList<Integer> curr){
        if(root==null) return;
        curr.add(root.val);
        targetSum=targetSum-root.val;
        
        if(root.left==null && root.right==null && targetSum == 0) {
               ans.add(new ArrayList<>(curr)); 
        }
      

        helper(root.left,targetSum, ans, curr);
        helper(root.right,targetSum, ans, curr);

        curr.remove(curr.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,targetSum, ans, new ArrayList<>());
        return ans;
    }
}