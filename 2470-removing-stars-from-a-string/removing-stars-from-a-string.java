class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*' && !st.isEmpty()){
                st.pop();
            }else if (c != '*') { 
                st.push(c); 
            }
        }
        StringBuilder sb=new StringBuilder();
       while (!st.isEmpty()) {
            sb.append(st.pop()); 
        }
        return sb.reverse().toString();
    }
}