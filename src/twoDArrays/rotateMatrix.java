package twoDArrays;

public class rotateMatrix {
    // Solution class is now at the same level (not inside rotateMatrix)
    static class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;

            // Step 1: Transpose the matrix (flip across diagonal)
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Step 2: Reverse each row
            for(int row = 0; row < n; row++) {
                int startCol = 0;
                int endCol = n - 1;
                while(startCol < endCol) {
                    int temp = matrix[row][startCol];
                    matrix[row][startCol] = matrix[row][endCol];
                    matrix[row][endCol] = temp;
                    startCol++;
                    endCol--;
                }
            }
        }
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main method with test case
    public static void main(String[] args) {
        // Create a 3x3 matrix (test case)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix
        Solution sol = new Solution();
        sol.rotate(matrix);

        System.out.println("Rotated Matrix (90° clockwise):");
        printMatrix(matrix);
    }
}