package StackBasics;

import java.util.Stack;

public class longestValidParentheses {

    public static int longestValidParentheses(String s){

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int currLen = i - st.peek();
                    maxLen = Math.max(maxLen, currLen);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));       // 2
        System.out.println(longestValidParentheses(")()())"));    // 4
        System.out.println(longestValidParentheses(""));          // 0
        System.out.println(longestValidParentheses("()(()"));     // 2
        System.out.println(longestValidParentheses("()(())"));    // 6

    }

}
