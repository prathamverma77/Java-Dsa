package StackBasics;

import java.util.ArrayDeque;
import java.util.Deque;

public class removeKDigits {

    public static String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();

        // monotonic stack: pop larger digits while we still have removals left
        for (char ch : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        // removals still pending (e.g. "12345", k=2) → remove from the end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // stack holds digits top→bottom = reversed order
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();   // correct order

        // strip leading zeros
        int index = 0;
        while (index < ans.length() && ans.charAt(index) == '0') {
            index++;
        }
        String result = ans.substring(index);

        return result.isEmpty() ? "0" : result;
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));   // 1219
        System.out.println(removeKdigits("10200",   1));   // 200
        System.out.println(removeKdigits("10",      2));   // 0
        System.out.println(removeKdigits("12345",   2));   // 123
        System.out.println(removeKdigits("112",     1));   // 11
        System.out.println(removeKdigits("9",       1));   // 0
    }
}