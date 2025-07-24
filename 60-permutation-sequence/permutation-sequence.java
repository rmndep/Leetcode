class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int fact = 1;

        // Step 1: Create the numbers list and calculate factorial of n
        for (int i = 1; i <= n; i++) {
            nums.add(i);
            fact *= i;
        }

        // Step 2: Adjust k to be zero-based
        k--;

        StringBuilder ans = new StringBuilder();

        // Step 3: Recursively build answer
        for (int i = 0; i < n; i++) {
            fact = fact / (n - i); // update block size
            int index = k / fact;  // which block we are in
            ans.append(nums.get(index)); // pick the number
            nums.remove(index); // remove from list
            k = k % fact; // update k to new subproblem
        }

        return ans.toString();
    }
}