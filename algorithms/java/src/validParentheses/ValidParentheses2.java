package validParentheses;

import java.util.Stack;

/**
 * @author kaizen
 * @date 2019/12/24
 */
public class ValidParentheses2 {

    public boolean isValid(String s) {
        MStack stack = new MStack(s.length());
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    class MStack {
        private char[] stack;
        private int n;

        public MStack(int cap) {
            stack = new char[cap];
        }

        public void push(char c) {
            stack[n++] = c;
        }

        public char pop() {
            return stack[--n];
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public int size(){
            return n;
        }
    }
}
