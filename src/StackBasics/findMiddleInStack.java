package StackBasics;

import java.util.Stack;

public class findMiddleInStack {

    // Fixed: parameter is a Stack<Integer>, not an int
    // Fixed: returns the middle value so caller can use it
    // Fixed: restores the stack by pushing popped elements back
    public static int middleElement(Stack<Integer> st, int count, int size) {
        // Base case: we've popped size/2 elements, top is now the middle
        if (count == size / 2) {
            int middleElement = st.peek();
            System.out.println("Middle element: " + middleElement);
            return middleElement;
        }

        // Pop and recurse
        int popped = st.pop();
        int result = middleElement(st, count + 1, size);

        // Fixed: push the popped element back to restore the stack
        st.push(popped);

        return result;
    }

    public static void main(String[] args) {
        // Fixed: declare the stack properly
        Stack<Integer> st = new Stack<>();

        // Fixed: use push() to add elements, not pop(10)
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack before: " + st);

        // Fixed: call the correct method name, no System.out.println around void
        middleElement(st, 0, st.size());

        // Stack is restored
        System.out.println("Stack after:  " + st);
    }
}