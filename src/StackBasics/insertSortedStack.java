package StackBasics;

import java.util.Stack;

public class insertSortedStack {

    public static void insertSortedStack(Stack<Integer> st, int x){
        //base case
        if(st.empty()){
            st.push(x);
            return;
        }

        int topVal = st.peek();
        if(topVal < x){
            st.pop();
            insertSortedStack(st, x);
            st.push(topVal);
        }
        else{
            st.push(x);
            return;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);                // bottom→top: [5,4,3,2], decreasing

        System.out.println("Before: " + st);
        insertSortedStack(st, 3);
        System.out.println("After:  " + st);   // [5,4,3,3,2] ✅

        insertSortedStack(st, 6);
        System.out.println("After:  " + st);   // [6,5,4,3,3,2] ✅
    }
}
