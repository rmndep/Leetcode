class Solution {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        int n = strNums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                String s1 = strNums[j] + strNums[j + 1];
                String s2 = strNums[j + 1] + strNums[j];
                if (s1.compareTo(s2) < 0) {
                    // swap
                    String temp = strNums[j];
                    strNums[j] = strNums[j + 1];
                    strNums[j + 1] = temp;
                }
            }
        }

        if (strNums[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : strNums) {
            sb.append(s);
        }

        return sb.toString();
    }
}
