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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;

        while(cur != null){
            ListNode newN=cur.next;
            cur.next=prev;
            prev=cur;
            cur = newN;
           
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while (fast != null && fast.next != null) {
            slow =slow.next;
            fast=fast.next.next;
        }

        ListNode first=reverse(slow);
        ListNode second=head;

        while(first != null){
            if(first.val != second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
}