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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode prev = null;    
        ListNode current = head; 

        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev;             
            prev = current;                  
            current = nextNode;              
        }
        return prev; 

    }
}