class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int num : nums) {
            int rem = ((num % value) + value) % value; 
            count.put(rem, count.getOrDefault(rem, 0) + 1);
        }
        
        int mex = 0;
        
        while (true) {
            int rem = mex % value;
            if (!count.containsKey(rem) || count.get(rem) == 0) {
                return mex; 
            }
            count.put(rem, count.get(rem) - 1);
            mex++;
        }
    }
}
