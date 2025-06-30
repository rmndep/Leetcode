class Solution {
    public int trap(int[] height) {
        int res = 0;

        // for (int i = 1; i < height.length - 1; i++) {

        //     int left = height[i];
        //     for (int j = 0; j < i; j++)
        //         left = Math.max(left, height[j]);

        //     int right = height[i];
        //     for (int j = i + 1; j < height.length; j++)
        //         right = Math.max(right, height[j]);

        //     res += Math.min(left, right) - height[i];
        // }

        // return res;

        int[] left=new int[height.length];
        int[] right=new int[height.length];

         left[0]=height[0];
         right[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }

        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }

        for(int i=1;i<height.length-1;i++){
            res+=Math.min(left[i],right[i])-height[i];
        }
        return res;
    }
}