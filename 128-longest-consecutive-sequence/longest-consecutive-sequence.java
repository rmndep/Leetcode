class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        // Arrays.sort(nums);
        // int n=nums.length;
        // int curr=1;
        // int lon=1;
        
        // for(int i=1;i<n;i++){
        //     if(nums[i]==nums[i-1]) continue;

        //     if(nums[i]==nums[i-1]+1){
        //         curr+=1;
        //     }else{
        //         lon=Math.max(curr,lon);
        //         curr=1;
        //     }
        // }
        // return Math.max(lon,curr);

        HashSet<Integer> numSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numSet.add(nums[i]);
        }
        int longestS=1;
        for(int num:numSet){
            if(numSet.contains(num-1)) continue;

            else{
                int curr=num;
                int currS=1;
                while(numSet.contains(curr+1)){
                    curr++;
                    currS++;
                }
                longestS=Math.max(currS,longestS);
            }
        }
        return longestS;
    }
}