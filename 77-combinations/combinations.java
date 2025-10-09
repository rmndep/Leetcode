// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>> res = new ArrayList<>();
//         List<Integer> comb = new ArrayList<>();

//         backtrack(1, comb, res, n, k);
//         return res;
//     }

//     private void backtrack(int start, List<Integer> comb, List<List<Integer>> res, int n, int k) {
//         if (comb.size() == k) {
//             res.add(new ArrayList<>(comb));
//             return;
//         }

//         for (int num = start; num <= n; num++) {
//             comb.add(num);
//             backtrack(num + 1, comb, res, n, k);
//             comb.remove(comb.size() - 1);
//         }
//     } 
// }
import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> ans) {
        // Base case: when current combination size == k
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Try each number starting from 'start'
        for (int i = start; i <= n; i++) {
            current.add(i); // choose i
            backtrack(i + 1, n, k, current, ans); // move to next number
            current.remove(current.size() - 1); // backtrack
        }
    }
}
