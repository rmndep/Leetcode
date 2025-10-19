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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while (!q.isEmpty()) {
            int len = q.size();
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode temp = q.poll();
                // ans.add(temp);
                //    int index=(flag_lr)?i:len-1-i;
                //    ans.set(index, temp.val);
                if (leftToRight)
                    ans.add(temp.val);
                else
                    ans.add(0, temp.val);

                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            leftToRight = !leftToRight;
            res.add(ans);
        }
        return res;
    }
}