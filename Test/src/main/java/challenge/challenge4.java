package challenge;

public class challenge4 {

    public static void main(String[] args) {
        //畫星星

        star6();
    }

    public static void star1() {
//        *
//        **
//        ***
//        ****
//        *****

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void star2() {
//            *
//           **
//          ***
//         ****
//        *****

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j - i > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void star3() {
//        *****
//        ****
//        ***
//        **
//        *

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void star4() {
//        *****
//         ****
//          ***
//           **
//            *

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void star5() {
//            * 
//           * * 
//          * * * 
//         * * * * 
//        * * * * *         

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2; k++) {
                if (k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void star6() {
//            * 
//           * * 
//          * * * 
//         * * * * 
//        * * * * * 
//         * * * *
//          * * *
//           * *
//            *        

        //上半部
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2; k++) {
                if (k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //下半部
        for (int i = 4; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                if (k % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}
