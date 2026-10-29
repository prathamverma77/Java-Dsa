package StackBasics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

public class dailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int previousDay = st.pop();
                ans[previousDay] = i - previousDay;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        // [1, 1, 4, 2, 1, 1, 0, 0]

        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 40, 50, 60})));
        // [1, 1, 1, 0]

        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 60, 90})));
        // [1, 1, 0]
    }
}