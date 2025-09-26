class Solution {
    public boolean isValid(String s) {
        // Stack<Character> stack=new Stack<>();

        // for(char ch:s.toCharArray()){
            
        //     if(ch=='(' || ch=='{' || ch=='['){
        //         stack.push(ch);
        //     }
        //     else{
        //         if(stack.isEmpty()) return false;

        //         char top=stack.pop();
        //         if((ch==')' && top !='(') ||
        //         (ch=='}' && top !='{')||
        //         (ch==']' && top !='[')){
        //             return false;
        //         }
        //     }
        // }

        // return stack.isEmpty();
        HashMap<Character, Character> bracs=new HashMap<>();
        bracs.put('(',')');
        bracs.put('[',']');
        bracs.put('{','}');

        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(bracs.containsKey(c)){
                st.push(c);
            }
            else{
                if(st.empty()){
                    return false;
                }
                char top=st.pop();
                if(c!=bracs.get(top)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}