package ArraysLeetcode;

import java.util.Arrays;

public class kadanesAlgorithm {

    static int kadanesAlgorithm(int arr[]){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0)
                sum = 0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        // Test Case: Standard array with positive and negative numbers
        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("========================================");
        System.out.println("     KADANE'S ALGORITHM - TEST CASE");
        System.out.println("========================================\n");

        System.out.println("Input array: " + Arrays.toString(test1));
        System.out.println("Maximum subarray sum: " + kadanesAlgorithm(test1));
        System.out.println("Expected: 6");
        System.out.println("Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6");
        System.out.println("Result: " + (kadanesAlgorithm(test1) == 6 ? "✅ PASS" : "❌ FAIL"));
    }
}