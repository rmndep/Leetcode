class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;

        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        for (int i = 0; i < mid; i++) left[i] = nums[i];
        for (int i = mid; i < nums.length; i++) right[i - mid] = nums[i];

        left = sortArray(left);
        right = sortArray(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) merged[k++] = left[i++];
        while (j < right.length) merged[k++] = right[j++];

        return merged;
    }
}
