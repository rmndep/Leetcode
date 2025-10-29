// class Solution {
//     public void rotate(int[] arr, int k) {
//         int n=arr.length;
//         k=k%n;
//         int[] temp=new int[k];
//         for(int i=0;i<k;i++){
//             temp[i]=arr[i];
//         }
//         for(int i=k;i<n;i++){
//             arr[i-k]=arr[i];
//         }
//         for(int i=n-k;i<n;i++){
//             arr[i]=temp[i-(n-k)];
//         }
//     }
// }
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
