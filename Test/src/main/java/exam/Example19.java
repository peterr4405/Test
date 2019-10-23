package exam;

public class Example19 {

    public static void main(String[] args) {
//        题目：打印出如下图案（菱形）
//     *
//    ***
//   *****
//  *******
//   *****
//    ***
//     *

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i>0;i--){
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }

}
