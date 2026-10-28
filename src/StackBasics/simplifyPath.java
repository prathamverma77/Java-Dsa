package StackBasics;

import java.util.Stack;

public class simplifyPath {                                    // note: "simplify", not "simply"

    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();                     // fixed: String, not Character
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();                                 // fixed: st.pop(), not pop()
                }
            } else {
                st.push(part);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append("/");
            str.append(st.pop());                             // fixed: pop(), not removeLast()
        }
        return str.reverse().toString();                      // added: reverse so order is a/b/c
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));            // /home
        System.out.println(simplifyPath("/../"));              // /
        System.out.println(simplifyPath("/home//foo/"));       // /home/foo
        System.out.println(simplifyPath("/a/./b/../../c/"));   // /c
        System.out.println(simplifyPath("/a/b/c"));            // /a/b/c
    }
}