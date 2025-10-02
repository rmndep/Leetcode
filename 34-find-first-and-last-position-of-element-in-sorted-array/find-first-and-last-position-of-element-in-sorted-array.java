// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] arr = {-1, -1};
//         boolean first = true;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target && first) {
//                 arr[0] = i;
//                 arr[1] = i; 
//                 first = false;
//             } else if (nums[i] == target) {
//                 arr[1] = i;
//             }
//         }

//         return arr;
//     }
// }
class Solution {
    
    // Function to find the first occurrence
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1; // move left to find first occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Function to find the last occurrence
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1; // move right to find last occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Main function
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
}

