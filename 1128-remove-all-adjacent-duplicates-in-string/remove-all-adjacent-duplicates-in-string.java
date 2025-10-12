class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();   
            }  else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder(st.size());
        // while(st.size()>0){
        //     sb.append(st.pop());
        // }
        // return sb.reverse().toString();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}