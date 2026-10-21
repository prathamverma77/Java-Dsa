package StackBasics;

import java.util.Stack;

public class checkSortedStack {

    public static boolean checkSortedStack(Stack<Integer> st) {
        // base case
        if (st.size() <= 1) {
            return true;
        }

        // solving one case
        int prevElement = st.peek();
        st.pop();

        int currElement = st.peek();

        boolean caseAns = (prevElement <= currElement);
        boolean recursiveAns = checkSortedStack(st);

        st.push(prevElement);

        return caseAns && recursiveAns;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println("Sorted? " + checkSortedStack(s1));   // true (bottom 1, top 4)

        Stack<Integer> s2 = new Stack<>();
        s2.push(1);
        s2.push(3);
        s2.push(2);
        System.out.println("Sorted? " + checkSortedStack(s2));   // false

        Stack<Integer> s3 = new Stack<>();
        s3.push(5);
        System.out.println("Sorted? " + checkSortedStack(s3));   // true (single element)

        Stack<Integer> s4 = new Stack<>();
        System.out.println("Sorted? " + checkSortedStack(s4));   // true (empty)
    }
}