package StackBasics;

import java.util.Stack;

public class removeAdjacentDuplicates {

    public static String removeAdjacentDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        // build result after loop, not inside
        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append(st.peek());
            st.pop();
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeAdjacentDuplicates("abbaca"));   // "ca"
        System.out.println(removeAdjacentDuplicates("azxxzy"));   // "ay"
        System.out.println(removeAdjacentDuplicates("aa"));       // ""
        System.out.println(removeAdjacentDuplicates("abc"));      // "abc"
    }
}