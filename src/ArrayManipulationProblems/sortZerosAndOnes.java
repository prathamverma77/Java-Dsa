package ArrayManipulationProblems;

public class sortZerosAndOnes {

    static void sortZerosAndOnes(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
                //swap
                arr[i] = 0;
                arr[j] = 1;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,0,0,1};
        sortZerosAndOnes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
