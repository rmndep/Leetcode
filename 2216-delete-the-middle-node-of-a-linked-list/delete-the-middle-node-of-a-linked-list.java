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
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) {
            return null;
        }
         int length=0;
        int middle=0;
        ListNode current=head;
        while(current != null){
            length++;
            current=current.next;
        }
    
            middle=length/2;
 

        current = head;
        for (int i = 0; i < middle-1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }
}