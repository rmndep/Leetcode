/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int idx = binarySearchAsc(mountainArr, 0, peak, target);
        if (idx != -1) return idx;
        return binarySearchDesc(mountainArr, peak + 1, mountainArr.length() - 1, target);
    }

    private int findPeak(MountainArray arr) {
        int l = 0, r = arr.length() - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    private int binarySearchAsc(MountainArray arr, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            if (val < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    private int binarySearchDesc(MountainArray arr, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            if (val > target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
