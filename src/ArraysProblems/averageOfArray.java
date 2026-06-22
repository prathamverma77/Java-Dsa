package ArraysProblems;

public class averageOfArray {

    static double getAverage(int[] arr){
        double sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(getAverage(arr));
    }


}
