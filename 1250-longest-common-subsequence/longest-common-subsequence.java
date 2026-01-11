class Solution {
    int [][]dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int [text1.length()+1][text2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(text1,text2,text1.length(),text2.length());
    }
    public int helper(String a,String b, int aa, int bb){
        if(aa==0||bb==0) return 0;

        // char a1=a.charAt(aa-1);
        // char a2=b.charAt(bb-1);
        if(dp[aa][bb]!=-1){
            return dp[aa][bb];
        }
        if(a.charAt(aa-1)==b.charAt(bb-1)){
            dp[aa][bb]= 1+helper(a,b,aa-1,bb-1);
        }else{
            dp[aa][bb]= Math.max(helper(a,b,aa-1,bb),helper(a,b,aa,bb-1));
        }
        return dp[aa][bb];
    }
}