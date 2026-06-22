package ArraysProblems;

public class findMax {

    static int getMax (int arr[]){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main (String[] args){
        int arr[] =  {1,2,34,5,6688,7,6};
        System.out.println(getMax(arr));

//        int arr2[] = {1,2,3,4,5,6};
//        math.max(arr2);
//        System.out.println(arr2);
    }
}
