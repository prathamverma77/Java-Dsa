package twoDArrays;

import java.util.ArrayList;
import java.util.List;

public class printSumOfRow2DArray {

    static List<Integer> printSumOfRow2DArray(int arr[][]) {
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;

        for (int row = 0; row < m; row++) {
            int sum = 0;
            for (int col = 0; col < n; col++) {
                sum = sum + arr[row][col];
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(printSumOfRow2DArray(matrix)); // [6, 15]
    }
}