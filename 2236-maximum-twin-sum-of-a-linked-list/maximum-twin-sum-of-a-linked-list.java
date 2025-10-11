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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
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
    public int pairSum(ListNode head) {
        ListNode mid=middle(head);
        ListNode right=reverse(mid);
        ListNode left=head;
        int sum=Integer.MIN_VALUE;;
        while(right!=null){
            sum=Math.max(sum,left.val+right.val);
            right=right.next;
            left=left.next;
        }
        return sum;
    }
}