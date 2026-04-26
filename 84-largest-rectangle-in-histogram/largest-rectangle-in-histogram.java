class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int[] nsr=new int[n];
        int[] nsl=new int[n];
        Stack<Integer> st=new Stack<>();

        //nsr
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        //nsl
          for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=st.peek();
            }
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            int w=nsr[i]-nsl[i]-1;
            int a=w*arr[i];
            maxArea=Math.max(maxArea,a);
        }
        return maxArea;
    }
}