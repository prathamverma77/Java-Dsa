package BasicArraysProblems;

public class countZerosOnes {

    static int[] countZerosAndOnes (int arr[]) {
        int zero = 0;
        int one = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
               zero++;
            }
            else{
                one++;
            }
        }
        int ans[] = {zero, one};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,1};
        int ans[] = countZerosAndOnes(arr);
        System.out.println("zerocounts =" + ans[0]);
        System.out.println("zerocounts =" + ans[1]);
    }
}
