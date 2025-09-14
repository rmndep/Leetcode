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
     
// eficient than brute force, this has tc-> o(n log(n))), brute force has o(n2)
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;

// using hashset -> as hashset doesnt contain duplicates! tc--> o(n)

        HashSet<Integer> seenNum=new HashSet<>();

        for(int num:nums){
            if(seenNum.contains(num)){
                return true;
            }
            seenNum.add(num);
        }
        return false;
    }
}