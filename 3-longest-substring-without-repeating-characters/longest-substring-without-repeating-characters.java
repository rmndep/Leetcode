class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0; 
        int n = s.length(); 

        // for (int i = 0; i < n; i++) {
        //     String sub = ""; 

        //     for (int j = i; j < n; j++) {
        //         char ch = s.charAt(j); 

        //         if (sub.indexOf(ch) != -1) {
        //             break;
        //         }

        //         sub += ch; 
        //         maxLength = Math.max(maxLength, sub.length());
        //     }
        // }

        // return maxLength;

        if(n==0 || s==null){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int left=0;
        int right=0;
        HashSet<Character> set=new HashSet<>();
        while(right<n){
            char c=s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}