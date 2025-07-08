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
    public ListNode middleNode(ListNode head) {
        int length=0;
        int middle=0;
        ListNode current=head;
        while(current != null){
            length++;
            current=current.next;
        }
    
       // if(length%2==0){
            middle=length/2;
        // }else middle=(length/2)+1;

        current = head;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }

        return current;

    }
}