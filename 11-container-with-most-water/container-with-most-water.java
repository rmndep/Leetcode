class Solution {
    public int maxArea(int[] nums) {
        int maxarea=0;
        int n=nums.length;
        int l=0;
        int r=nums.length-1;

        while(l<r){
            int h=Math.min(nums[l],nums[r]);
            int w=r-l;

            int area=h*w;
            maxarea=Math.max(maxarea,area);
            if(nums[l]<nums[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int h=Math.min(nums[i],nums[j]);
        //         int w=j-i;
        //         int a=h*w;
        //         maxarea=Math.max(maxarea,a);
        //     }
        // }
        // return maxarea;
    }

}