/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            st.push(curr);
            count++;
            curr = curr.next;
        }
        // System.out.println(st);
        curr=head;
        for(int i=0;i<count/2;i++){
            ListNode endNode=st.pop();
            ListNode nextNode=curr.next;
            curr.next=endNode;
            endNode.next=nextNode;
            curr=nextNode;
        }
           curr.next=null;
    }
}