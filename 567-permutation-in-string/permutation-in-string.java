// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if (s1.length() > s2.length()) {
//             return false;
//         }

//         int[] map1 = new int[26];
//         int[] map2 = new int[26];

//         for (int i = 0; i < s2.length(); i++) {
//             map1[s1.charAt(i) - 'a']++;
//             map2[s2.charAt(i) - 'a']++;
//         }
//         for (int i = 0; i < s2.length(); i++) {
//             if (matches(map1, map2)) {
//                 return true;
//             }
//              map2[s2.charAt(i - s1.length()) - 'a']--;
//             map2[s2.charAt(i) - 'a']--;
//         }
//         return matches(map1, map2);
//     }

//     private boolean matches(int[] map1, int[] map2) {
//         for(int i=0;i<26;i++){
//             if(map1[i]!=map2[i]){
//                 return false;
//             }
         
//         }
//         return true;
//     }
// }
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        // build frequency for s1 and first window in s2
        for (int i = 0; i < s1.length(); i++) {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }

        // check first window
        if (matches(map1, map2)) return true;

        // slide window over s2
        for (int i = s1.length(); i < s2.length(); i++) {
            // add new char
            map2[s2.charAt(i) - 'a']++;
            // remove old char
            map2[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(map1, map2)) return true;
        }

        return false;
    }

    private boolean matches(int[] map1, int[] map2) {
        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) {
                return false;
            }
        }
        return true;
    }
}
