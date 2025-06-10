class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; 
        int n = s.length(); 

        for (int i = 0; i < n; i++) {
            String sub = ""; 

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j); 

                if (sub.indexOf(ch) != -1) {
                    break;
                }

                sub += ch; 
                maxLength = Math.max(maxLength, sub.length());
            }
        }

        return maxLength;
    }
}