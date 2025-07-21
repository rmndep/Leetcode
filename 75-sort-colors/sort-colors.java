class Solution {
    //     public void sortColors(int[] nums) {
    //         int n = nums.length;
    //         int lo = 0, mid = 0, hi = n - 1;

    //         while (mid <= hi) {
    //             if (nums[mid] == 0) {
    //                 int temp = nums[mid];
    //                 nums[mid] = nums[lo];
    //                 nums[lo] = temp;
    //                 lo++;
    //                 mid++;
    //             } else if (nums[mid] == 1) {
    //                 mid++;
    //             } else {
    //                 int temp = nums[mid];
    //                 nums[mid] = nums[hi];
    //                 nums[hi] = temp;
    //                 hi--;
    //             }
    //         }
    //     }
    // }
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;

        for (int num : nums) {
            if (num == 0)
                zero++;
            else if (num == 1)
                one++;
            else
                two++;
        }

        int i = 0;
        while (zero-- > 0)
            nums[i++] = 0;
        while (one-- > 0)
            nums[i++] = 1;
        while (two-- > 0)
            nums[i++] = 2;
    }
}