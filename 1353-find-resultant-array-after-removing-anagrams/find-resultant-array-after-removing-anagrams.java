class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!areAnagrams(words[i],words[i-1])){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}