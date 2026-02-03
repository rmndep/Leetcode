class Solution {
    public int candy(int[] arr) {
        int n=arr.length;
        int[] cand=new int[n];
        Arrays.fill(cand,1);

        for(int i=1;i<n;i++){ //left-->right
            if(arr[i]>arr[i-1]){
                cand[i]=cand[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                cand[i]=Math.max(cand[i],cand[i+1]+1);
            }
        }
        int sum=0;
        for(int s:cand){
            sum+=s;
        }
        return sum;
    }
}