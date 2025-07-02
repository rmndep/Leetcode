class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set<Integer> seen = new HashSet<>();
        
        // for (int num : nums) {
        //     if (seen.contains(num)) {
        //         return true; 
        //     }
        //     seen.add(num);
        // }
        
        // return false;
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}