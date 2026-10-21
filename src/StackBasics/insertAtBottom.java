package StackBasics;

import java.util.Stack;

public class insertAtBottom {

    public static void insertAtBottom(Stack<Integer> st, int x) {
        // base case: stack empty → push x at the bottom
        if (st.empty()) {
            st.push(x);
            return;
        }

        int topValue = st.peek();
        st.pop();

        insertAtBottom(st, x);   // recurse to reach the bottom

        st.push(topValue);       // restore popped element on the way back up
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        // stack now: bottom [1, 2, 3] top

        System.out.println("Before: " + st);

        insertAtBottom(st, 10);   // insert 0 at the bottom

        System.out.println("After:  " + st);
    }
}