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
    public int[] nextLargerNodes(ListNode head) {
        // List<Integer> values = new ArrayList<>();
        // while (head != null) {
        //     values.add(head.val);
        //     head = head.next;
        // }

        // int n = values.size();
        // int[] result = new int[n];
        // for (int i = 0; i < n; i++) {
        //     int current = values.get(i);
        //     for (int j = i + 1; j < n; j++) {
        //         if (values.get(j) > current) {
        //             result[i] = values.get(j);
        //             break;
        //         }
        //     }
        // }
        // return result;
        ArrayList <Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int[] ans = new int[list.size()];
        Stack <Integer> st = new Stack<>();
        for(int i=0;i<list.size();i++){
           while(!st.isEmpty() && list.get(st.peek())<list.get(i)){
              ans[st.pop()]=list.get(i);
           }
           st.push(i);
        }
        return ans;
    }
}