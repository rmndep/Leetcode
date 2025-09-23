class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left < right && !isVowel(ans[left])) left++;
            while(left < right && !isVowel(ans[right])) right--;
            if(left < right){
                char swap = ans[left];
                ans[left] = ans[right];
                ans[right] = swap;
                left++;
                right--;
            }
        }
        return new String(ans);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}