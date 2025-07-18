class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return recursiveSearch(nums, target, s, e );
    }

    private int recursiveSearch(int[] nums, int target, int low, int high) {
       
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[low] <= nums[mid]) {
            if (target >= nums[low] && target < nums[mid]) {
                return recursiveSearch(nums, target, low, mid - 1);
            } else {
                return recursiveSearch(nums, target, mid + 1, high);
            }
        } 
        
        else {
            if (target > nums[mid] && target <= nums[high]) {
                return recursiveSearch(nums, target, mid + 1, high);
            } else {
                return recursiveSearch(nums, target, low, mid - 1);
            }
        }
    }
}