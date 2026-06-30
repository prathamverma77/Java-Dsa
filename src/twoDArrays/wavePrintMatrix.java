package twoDArrays;

public class wavePrintMatrix {

    static void wavePrintMatrix(int arr[][]) {
        int m = arr.length;        // Number of rows
        int n = arr[0].length;     // Number of columns

        for (int col = 0; col < n; col++) {
            if ((col & 1) == 1) {  // Odd column → bottom to top
                for (int row = m - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {               // Even column → top to bottom
                for (int row = 0; row < m; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        wavePrintMatrix(matrix);
        // Output: 1 5 9 12 8 4 3 7 11 10 6 2
    }
}