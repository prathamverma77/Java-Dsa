package StackBasics;

import java.util.ArrayDeque;
import java.util.Deque;

public class validParentheses {

    public static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            // if this is an open bracket
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                // check top of the stack if ch is closing bracket we gonna pop otherwise return false
                if (st.isEmpty()) {
                    return false;
                }
                if (ch == ')' && st.peek() != '(') {
                    return false;
                }
                if (ch == ']' && st.peek() != '[') {
                    return false;
                }
                if (ch == '}' && st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        // true cases
        System.out.println(isValid("()"));        // true
        System.out.println(isValid("()[]{}"));    // true
        System.out.println(isValid("{[]}"));      // true

        // false cases
        System.out.println(isValid("(]"));        // false
        System.out.println(isValid("([)]"));      // false
        System.out.println(isValid("]"));         // false
        System.out.println(isValid("("));         // false
    }
}