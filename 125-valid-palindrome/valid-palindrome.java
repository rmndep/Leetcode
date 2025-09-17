class Solution {
    public boolean isPalindrome(String s) {
        // String res=s.replace(" ","").replace(",","").replace(":","").toLowerCase();

        // String upss = "";

        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if (Character.isLetterOrDigit(c)) {
        //         upss += c;
        //     }
        // }

        // String ups = upss.toLowerCase();

        // int left = 0;
        // int right = ups.length() - 1;

        // while (left < right) {
        //     char leftChar = ups.charAt(left);
        //     char rightChar = ups.charAt(right);
        //     if (leftChar != rightChar) {
        //         return false;
        //     }

        //     left++;
        //     right--;
        // }
        // return true;
        int left=0;
        int right=s.length()-1;

        while(left<right){
            char cl=s.charAt(left);
            char cr=s.charAt(right);

            if(!Character.isLetterOrDigit(cl)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(cr)){
                right--;
                continue;
            }

            if(Character.toLowerCase(cl)!=Character.toLowerCase(cr))
            return false;
            left++;
            right--;
        }
       return true; 
    }
}
