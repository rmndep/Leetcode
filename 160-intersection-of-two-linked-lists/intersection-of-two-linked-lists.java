/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1=headA;
        ListNode curr2=headB;

        int lenA=0, lenB=0;

        while(curr1!=null){
            lenA++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            lenB++;
            curr2=curr2.next;
        }
        curr1=headA;
        curr2=headB;
        if(lenA>lenB){
            int steps=lenA-lenB;
            for(int i=1;i<=steps;i++){
                curr1=curr1.next;
            }
        }else{
            int steps=lenB-lenA;
            for(int i=0;i<steps;i++){
                curr2=curr2.next;
            }
        }

        while(curr1!=curr2){
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return curr1;
    }
}