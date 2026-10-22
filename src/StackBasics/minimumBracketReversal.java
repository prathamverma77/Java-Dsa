package StackBasics;

import java.util.Stack;

public class minimumBracketReversal {

    public static int minBracketReversal(String str) {            // fixed: int return, String param
        if (str.length() % 2 == 1) {
            return -1;
        }

        Stack<Character> st = new Stack<>();                      // fixed: Character, declared

        for (char ch : str.toCharArray()) {                       // fixed: ()
            if (ch == '}' && !st.isEmpty() && st.peek() == '{') { // fixed: !isEmpty, ==
                st.pop();
            } else {
                st.push(ch);                                      // fixed: pass ch
            }
        }

        int open = 0;
        int close = 0;

        while (!st.isEmpty()) {                                   // fixed: !isEmpty
            if (st.peek() == '{') {
                open++;
            } else {
                close++;
            }
            st.pop();
        }

        // your original formula — unchanged
        if (open % 2 == 0) {
            return (open / 2) + (close / 2);
        } else {
            return (close - 1) / 2 + 2 + (open - 1) / 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(minBracketReversal("}{"));    // 2
        System.out.println(minBracketReversal("{{"));    // 1
        System.out.println(minBracketReversal("}}"));    // 1
        System.out.println(minBracketReversal("}{}{"));  // 2
        System.out.println(minBracketReversal("{"));     // -1
    }
}