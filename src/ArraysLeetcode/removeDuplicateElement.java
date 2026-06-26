public class removeDuplicateElement {
    // Returns the count of unique elements after removing duplicates
    static int removeDuplicateElement(int arr[]) {
        if (arr.length == 0) return 0;

        int i = 0; // Pointer for unique elements

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Number of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int uniqueCount = removeDuplicateElement(arr);
        System.out.println("Unique elements count: " + uniqueCount);

        // Print first 'uniqueCount' elements
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
        // Output: 1 2 3 4
    }
}