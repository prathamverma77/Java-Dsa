package ArraysLeetcode;

public class twoSum {

    static int[] twoSum(int arr[], int target) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {  // ✅ j starts from i+1, not n-1
                if (arr[i] + arr[j] == target) {
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        return new int[]{};  // Return empty array if no solution
    }

    public static void main(String[] args) {
        int arr[] = {1, 12, 3, 4, 5};
        int target = 9;
        int result[] = twoSum(arr, target);  // ✅ Store result

        if (result.length == 0) {
            System.out.println("No solution found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        }
    }
}