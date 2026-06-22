package ArraysProblems;

public class getPosNegSum {

    static int[] PosNegSum(int arr[]) {
        int neg = 0;
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos = pos + arr[i];
            } else {
                neg = neg + arr[i];
            }
        }
        int ans[] = {pos, neg};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, -5, -6};
        int ans[] = PosNegSum(arr);
        System.out.println("Positive sum: " + ans[0]);
        System.out.println("Negative sum: " + ans[1]); 
    }
}