class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                res.append(c);
            } else if (c == '*') {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1);
                }
            } else if (c == '#') {
                res.append(res.toString());
            } else if (c == '%') {
                res.reverse();
            }
        }
        return res.toString();
    }

    public String reverse(String res) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char ch : res.toCharArray()) {
            st.add(ch);
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }
}