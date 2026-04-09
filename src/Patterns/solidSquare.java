public class solidSquare {

    public static void main(String[] args) {
//        //Solid Square pattern
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        //rectangle pattern
//        int n = 3;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col<=5 ; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Ladder star pattern
        int n = 5;
        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}