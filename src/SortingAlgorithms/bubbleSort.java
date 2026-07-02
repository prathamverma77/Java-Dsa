package SortingAlgorithms;

public class bubbleSort {

    // Method returns void since it sorts in-place
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to print array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Test case
    public static void main(String[] args) {
        // Test Case: Unsorted array
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

        // Additional test case with duplicate values
        int[] arr2 = {5, 2, 8, 2, 9, 1, 5};
        System.out.println("\nOriginal array 2:");
        printArray(arr2);

        bubbleSort(arr2);
        System.out.println("Sorted array 2:");
        printArray(arr2);
    }
}