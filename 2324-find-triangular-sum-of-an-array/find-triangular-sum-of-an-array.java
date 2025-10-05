class Solution {
    public int triangularSum(int[] arr) {
        if(arr.length==1) return arr[0]%10;

        int[] temp=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            temp[i]=(arr[i]+arr[i+1])%10;
        }
        return triangularSum(temp);
    }
}