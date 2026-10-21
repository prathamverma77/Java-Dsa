//package StackBasics;
//
//import java.util.Stack;
//
//public class stringIsValid {
//
//
//    public static void stringValid(Stack<Integer> st){
//
//        for(char ch: s.toCharArray()){
//            if(ch == 'a' || ch == 'b'){
//                st.push(ch);
//            }
//            else{
//                if(st.size() < 2) {
//                    return false;
//                }
//                if(st.peek() != 'b'){
//                    return false;
//                }
//                //if b is there
//                st.pop();
//                if(st.peek() != 'a'){
//                    return false;
//                }
//                //if a is there
//                st.pop();
//            }
//        }
//        if(st.isEmpty()){
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }
//
//}


package StackBasics;

import java.util.Stack;

public class stringIsValid {

    public static boolean stringValid(String s, Stack<Character> st) {   // fixed: boolean + String + Character
        for (char ch : s.toCharArray()) {
            // push every character (a, b, and c all matter)
            st.push(ch);

            // after pushing, if top three are a,b,c (bottom->top), remove them
            if (st.size() >= 3) {
                char top = st.pop();     // c
                char mid = st.pop();     // b
                char bot = st.pop();     // a
                if (!(bot == 'a' && mid == 'b' && top == 'c')) {
                    // not a match — restore
                    st.push(bot);
                    st.push(mid);
                    st.push(top);
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(stringValid("abcabc", new Stack<>()));   // true
        System.out.println(stringValid("abcab",  new Stack<>()));   // false
        System.out.println(stringValid("abc",    new Stack<>()));   // true
        System.out.println(stringValid("aabcbc", new Stack<>()));   // true
        System.out.println(stringValid("abccba", new Stack<>()));   // false
    }
}