package StringBasics;

public class PrintEachCharinString {

    // Move this method INSIDE the class
    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        printString(str);
        System.out.println("hello");
    }
}