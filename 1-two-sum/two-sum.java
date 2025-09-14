class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }

        // return new int[] {};

        Map<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(ans.containsKey(rem)){
                return new int[]{ans.get(rem),i};
            }
            ans.put(nums[i],i);
        }
        return new int[] {};

    }

}