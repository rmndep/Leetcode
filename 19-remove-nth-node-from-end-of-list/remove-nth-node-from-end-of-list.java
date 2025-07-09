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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null) return null;
        int length=0;
        ListNode current=head;
        while(current !=null){
            length++;
            current=current.next;
        }

        if(length==n){
            return head.next;
        }
        int pos = length - n;
        ListNode temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;

        return head;

        
        
    }
}