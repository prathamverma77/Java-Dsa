package BasicArraysProblems;

public class linearSearch {

    static boolean findTarget (int arr[], int target) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {12,4,46,23,23,6,7,60};
        boolean ans = findTarget(arr, 60);
        System.out.println(ans);
    }
}


