class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] arr=new int[2];
       arr[0]=first(nums,0,target);
       arr[1]=last(nums,nums.length-1,target);
       return arr;
    }
    public static int first(int[]arr, int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,i+1,key);
    }
     public static int last(int[]arr, int i,int key){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return last(arr,i-1,key);
    }
}
// class Solution {
    
//     // Function to find the first occurrence
//     private int findFirst(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;
//         int ans = -1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 ans = mid;
//                 right = mid - 1; // move left to find first occurrence
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return ans;
//     }

//     // Function to find the last occurrence
//     private int findLast(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;
//         int ans = -1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 ans = mid;
//                 left = mid + 1; // move right to find last occurrence
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return ans;
//     }

//     // Main function
//     public int[] searchRange(int[] nums, int target) {
//         int first = findFirst(nums, target);
//         int last = findLast(nums, target);
//         return new int[]{first, last};
//     }
// }

