import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();

        // Push all characters
        for (char c : s) {
            st.push(c);
        }

        // Pop back into the array (in place)
        int i = 0;
        while (!st.isEmpty()) {
            s[i++] = st.pop();
        }
        // No return — method is void
    }
}
