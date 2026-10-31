package StackBasics;

import java.util.ArrayDeque;
import java.util.Deque;

public class stockSpan {

    private Deque<int[]> st;

    public stockSpan() {
        st = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;
        // monotonic pattern: pop all <= price and accumulate their spans
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        // Simulates LeetCode's:
        //   StockSpanner obj = new StockSpanner();
        //   obj.next(100); obj.next(80); ...
        stockSpan obj = new stockSpan();

        System.out.println(obj.next(100));  // 1
        System.out.println(obj.next(80));   // 1
        System.out.println(obj.next(60));   // 1
        System.out.println(obj.next(70));   // 2
        System.out.println(obj.next(60));   // 1
        System.out.println(obj.next(75));   // 4
        System.out.println(obj.next(85));   // 6
    }
}