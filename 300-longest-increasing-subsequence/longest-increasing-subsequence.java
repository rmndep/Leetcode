class Solution {
    static int[][] dp;
    public int lengthOfLIS(int[] nums) {
        dp=new int[nums.length][nums.length+1];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length+1;j++){
                dp[i][j]=-1;
            }
        }
        return solve(nums,0,-1);
    }

    public int solve(int[] nums, int i, int prev){
        if(i==nums.length) return 0;

        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
        int not=solve(nums,i+1,prev);
        int take=0;
        if(prev==-1||nums[i]>nums[prev]){
            take=1+solve(nums,i+1,i);
        }

        return dp[i][prev + 1] = Math.max(take, not);
    }
}