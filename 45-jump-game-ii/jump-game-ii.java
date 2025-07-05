class Solution {
    public int jump(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;

        int count = 0;
        int start = 0, end = 0;

        while (end < n - 1) {
            count++;
            int last = end;
            for (int i = start; i <= end; i++) {
                if (i + arr[i] > last) {
                    last = i + arr[i];
                }
            }
            if (last == end) return -1;

            start = end + 1;
            end = last;
        }

        return count;
    }
}