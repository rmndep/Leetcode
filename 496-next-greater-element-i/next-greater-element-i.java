class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }
            arr[i] = -1;
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[k] > nums2[index]) {
                    arr[i] = nums2[k];
                    break;
                }
            }
        }
        return arr;
    }
}