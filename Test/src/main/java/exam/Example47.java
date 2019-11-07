package exam;

import java.util.Scanner;

public class Example47 {

    public static void main(String[] args) {
//        题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 7;) {
            while (i<=7) {
                System.out.printf("請輸入第%d個數(1-50)\n", i);
                int num = sc.nextInt();
                if (num <= 50) {
                    print(num);
                    i++;
                } else {
                    System.out.println("不正確的數字!，請重新輸入");
                }
            }
        }
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
