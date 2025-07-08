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
    public int pairSum(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        int sum = 0;
        int i = 0, j = values.size() - 1;

        while (i < j) {
            sum = Math.max(sum, values.get(i) + values.get(j));
            i++;
            j--;
        }

        return sum;
    }
}