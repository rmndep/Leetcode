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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();

        
        TreeNode curr=root;
        while(curr!=null){
            st.push(curr);
            if(curr.left!=null){
                curr=curr.left;
            }else{
                break;
            }
        }
        while(!st.isEmpty()){
            TreeNode cur=st.peek();
            st.pop();
            ans.add(cur.val);
            if(cur.right!=null)
            {
                TreeNode temp=cur.right;
                while(temp!=null){
                    st.push(temp);
                    if(temp.left!=null){
                        temp=temp.left;
                    }else{
                        break;
                    }
                }
            }
        }
        return ans;
    }
}