class Solution {
    public int search(int[] nums, int target) {
      return BS(nums, target, 0, nums.length - 1);
    }
    static int BS(int[] arr, int target, int s, int e){
        if(s>e) return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target) return mid;
        if(target<arr[mid]) return BS( arr,  target,  s,  mid-1);
        return BS(arr,target,mid+1,e);
    }
}