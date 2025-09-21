// class Solution {
//     public int characterReplacement(String s, int k) {
//         int[] occurence=new int[26];
//         int left=0,right=0;
//         int ans=0;
//         int maxOc=0;

//         for(right=0;right<s.length();right++){
//             maxOc=Math.max(maxOc, ++occurence[s.charAt(right)-'A']);
//             if(right-left+1-maxOc>k){
//                 left++;
//                 occurence[s.charAt(left)-'A']--;
//             }
//             ans=Math.max(ans,right-left+1);
//         }
//         return ans;
//     }
// }
class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurrence = new int[26];
        int left = 0;
        int ans = 0;
        int maxOc = 0;

        for (int right = 0; right < s.length(); right++) {
            maxOc = Math.max(maxOc, ++occurrence[s.charAt(right) - 'A']);

            // if more changes needed than k, shrink window
            while ((right - left + 1) - maxOc > k) {
                occurrence[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
