class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char ab;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (!st.isEmpty()) {
                    ab = st.peek();
                } else {
                    return false;
                }
                if (ch == ')' && ab == '(' || ch == '}' && ab == '{' || ch == ']' && ab == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
