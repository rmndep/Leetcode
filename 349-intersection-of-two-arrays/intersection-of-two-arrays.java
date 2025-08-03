class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!result.contains(nums1[i])) {
                        result.add(nums1[i]);
                    }
                    break;
                }
            }
        }

        int[] resArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArr[i] = result.get(i);
        }

        return resArr;
    }
}