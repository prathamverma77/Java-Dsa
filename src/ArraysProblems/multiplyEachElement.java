package ArraysProblems;

public class multiplyEachElement {

    static int[] multiplyElement(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];
        for (int i=0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    public static void main (String[] args) {
        int arr[] = {1,2,3,4,5};
        int newArray[] = multiplyElement(arr);
        System.out.println("printing new multiplied array");
        for(int i:newArray){
            System.out.println(i);
        }
    }

}
