class Solution {
    public int[] productExceptSelf(int[] nums) {
        //    int n = nums.length;
        //     int[] answer = new int[n];

        //     answer[0] = 1;
        //     for (int i = 1; i < n; i++) {
        //         answer[i] = answer[i - 1] * nums[i - 1];
        //     }

        //     int suffixProduct = 1;
        //     for (int i = n - 1; i >= 0; i--) {
        //         answer[i] = answer[i] * suffixProduct;
        //         suffixProduct *= nums[i];
        //     }

        //     return answer;

        int n = nums.length;
        // int[] pre = new int[n];
        // int[] suf = new int[n];

        // pre[0] = 1;
        // suf[n - 1] = 1;

        // // Compute prefix products
        // for (int i = 1; i < n; i++) {
        //     pre[i] = pre[i - 1] * nums[i - 1];
        // }

        // // Compute suffix products
        // for (int j = n - 2; j >= 0; j--) {
        //     suf[j] = suf[j + 1] * nums[j + 1];
        // }

        // // Final answer: pre[i] * suf[i]
        // int[] ans = new int[n];
        // for (int i = 0; i < n; i++) {
        //     ans[i] = pre[i] * suf[i];
        // }

        // return ans;

        int[] ans=new int[n];
        Arrays.fill(ans,1);
        int pre=1;
        int post=1;

        for(int i=0;i<n;i++){
            ans[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*post;
            post=post*nums[i];
        }

        return ans;
    }
}
