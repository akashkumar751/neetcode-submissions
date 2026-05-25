class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        if (n == 1)
            return false;

        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' && !st.isEmpty()) {
                char top = st.peek();
                if (top != '(')
                    return false;
                st.pop();
            } else if (c == '}' && !st.isEmpty()) {
                char top = st.peek();
                if (top != '{')
                    return false;
                st.pop();
            } else if (c == ']' && !st.isEmpty()) {
                char top = st.peek();
                if (top != '[')
                    return false;
                st.pop();
            } else {
                return false;
            }
        }

        return st.isEmpty() ? true : false;
    }
}
