class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int size=m+n;
        // int[] arr = new int[size];

        // for(int i=0;i<m;i++){
        //     arr[i]=nums1[i];
        // }
        // for(int i=0;i<n;i++){
        //     arr[m+i]=nums2[i];
        // }

        // //print
        // // for(int i=0;i<m+n;i++){
        // //     System.out.print(arr[i]);
        // // }

        // Arrays.sort(arr);
        // for (int i = 0; i < size; i++) {
        //     nums1[i] = arr[i];
        // }
       
        // System.out.println(Arrays.toString(nums1));
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[idx--]=nums1[i--];
            }else{
                nums1[idx--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[idx--]=nums2[j--];
        }
    }
}