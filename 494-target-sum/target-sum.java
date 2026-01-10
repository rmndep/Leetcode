class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int sum=0;
        for(int num:nums) sum+=num;
        if (Math.abs(target) > sum) return 0;
        if((sum+target)%2 !=0) return 0;
        int reqsum=(sum+target)/2;
        return helper(nums,reqsum);
    }

   public static int helper(int[]arr,int sum){
        int n=arr.length;
        int[][]dp=new int[n+1][sum+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                int a=arr[i-1];
                if(a<=j){
                    dp[i][j]=dp[i-1][j-a]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}