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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        // ListNode curr=head;
        // Map<Integer,Integer> count=new HashMap<>();
        // while(curr!=null){
        //     count.put(curr.val,count.getOrDefault(curr.val,0)+1);
        //     curr=curr.next;
        // }

        // curr=head;
        // ListNode dummy=new ListNode(0);
        // ListNode temp=dummy;

        // while(curr!=null){
        //     if(count.get(curr.val)==1){
        //         temp.next=curr;
        //         temp=temp.next;
        //     }
        //     curr=curr.next;
        // }
        // temp.next=null;
        // return dummy.next;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            boolean isDup = false;
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                isDup = true;
            }
            if (isDup)
                prev.next = curr.next;
            else
                prev = prev.next;

            curr = curr.next;
        }

        // while (curr != null) {
        //     if (curr.next != null && curr.val == curr.next.val) {
        //         while (curr.next != null && curr.val == curr.next.val) {
        //             curr = curr.next;
        //         }
        //         prev.next = curr.next;
        //     }else{
        //         prev=prev.next;
        //     }
        //     curr=curr.next;
        // }
        return dummy.next;

    }
}