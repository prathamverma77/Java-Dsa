package Patterns;

public class solidRhombus {

    public static void main(String[] args) {
//        //printing a solid rhombus
//        int n = 5;
//        //first row
//        for (int row = 1; row<=n; row++){
//            //for each row gottta print spaces and then stars
//
//            //spaces
//            for (int col = 1; col<=n-row; col++){
//                System.out.print(" ");
//            }
//            //stars
//            for (int col = 1; col<=n; col++){
//                System.out.print("* ");
//            }
//            //moving to the next row
//            System.out.println();
//        }



        // reverse 90deg triangle
//        int n = 5;
//
//        for (int row = 1; row<=n; row++){
//            //first row of the stars
//            for (int col= 1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //perfect triangle pattern
        int n = 5;
        for (int row = 1; row<=n; row++){

            for (int col = 1; col<=n-row; col++){
                System.out.print("  ");
            }
            for (int col = 1; col<=2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
