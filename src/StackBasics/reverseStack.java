package StackBasics;

import java.util.Stack;

public class reverseStack {

    public static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.empty()) {
            st.push(x);
            return;
        }
        int topValue = st.peek();
        st.pop();
        insertAtBottom(st, x);
        st.push(topValue);
    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.empty()) {
            return;
        }
        int topValue = st.peek();
        st.pop();

        reverseStack(st);
        insertAtBottom(st, topValue);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Before: " + st);

        reverseStack(st);

        System.out.println("After:  " + st);
    }
}