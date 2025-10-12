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
        // Stack<ListNode> st = new Stack<>();
        // ListNode curr = head;
        // int count = 0;
        // while (curr != null) {
        //     st.push(curr);
        //     count++;
        //     curr = curr.next;
        // }
        // // System.out.println(st);
        // curr=head;
        // for(int i=0;i<count/2;i++){
        //     ListNode endNode=st.pop();
        //     ListNode nextNode=curr.next;
        //     curr.next=endNode;
        //     endNode.next=nextNode;
        //     curr=nextNode;
        // }
        //    curr.next=null;

        if(head==null || head.next == null) return;

        //find middle
        ListNode mid=middle(head);

        //reverse second half
        ListNode right=reverse(mid.next);
        mid.next = null;
        ListNode left = head;
        //make connections
        while(right!=null){
            ListNode rNext=right.next;
            ListNode lNext=left.next;

            left.next = right;
            right.next = lNext;

            left=lNext;
            right=rNext;
        }

    }
    public static ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode nxt=null;

        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
}