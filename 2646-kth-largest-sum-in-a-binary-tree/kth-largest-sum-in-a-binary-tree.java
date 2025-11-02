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
    
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> arr=new ArrayList<>();
        // sum(root,k,ans);
        // return ans;
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            long sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            arr.add(sum);
        }
        Collections.sort(arr, Collections.reverseOrder());
        if (k > arr.size()) return -1;
        return arr.get(k-1);
    }
}