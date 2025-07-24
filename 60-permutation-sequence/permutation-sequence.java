class Solution {
    String res="";
    int count=0;
    public String getPermutation(int n, int k) {
        boolean[] used=new boolean[n+1];
        answer(n,k,new StringBuilder(),used);
        return res;
    }

     void answer(int n, int k, StringBuilder path, boolean[] used){
        if(n==path.length()){
            count++;
            if(count==k){
                res=path.toString();
            }
            return;
        }

        for(int i=1;i<=n;i++){
            if(used[i]) continue;
            used[i]=true;
            path.append(i);
            answer(n,k,path,used);
            path.deleteCharAt(path.length() - 1);
            used[i]=false;
        }
    }
}