class Solution {

    public static boolean isTrionic(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0) return false; 

        int mid = i;
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        if (i == mid) return false;
        int last = i;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == last) return false;

        return i == n - 1;

    }
}