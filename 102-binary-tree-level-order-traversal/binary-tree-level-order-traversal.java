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
    public List<List<Integer>> levelOrder(TreeNode root) {
       // if (root == null) return ans;
        List<List<Integer>> ans=new ArrayList<>();
         if (root == null) return ans;
        TreeNode curr=root;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(curr);

        while(!q.isEmpty()){
            int length=q.size();
            List<Integer> ad=new ArrayList<>();

            for(int i=0;i<length;i++){
                TreeNode temp=q.poll();
                ad.add(temp.val);

                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            ans.add(ad);
        }
        return ans;
    }
}