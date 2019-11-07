package exam;

import java.util.Scanner;

public class Example44 {

    static int x = 0;

    public static void main(String[] args) {
//        题目：一个偶数总能表示为两个素数之和
//        *總共要判斷兩次 第一個確認是素數以後，還要確認第二個也是素數才符合題意

        int num, n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入一個偶數");
            num = sc.nextInt();
            if (num % 2 == 0) {
                break;
            }
            System.out.println("這不是偶數");
        }
        n = num;
        num--;

        calloop:
        while (num > 1) {
            if (x == 0) {
                x = 0;
                check(n - num);
                if (x == 0) {
                    check(num);
                    if (x == 0) {
                        System.out.println(num + " " + (n - num));
                    }

                }
                x = 0;
                num -= 2;
                if (num < (n / 2)) {
                    break calloop;
                }
            }
        }

    }

    public static void check(int f) {

        for (int i = 2; i < f; i++) {
            if (f % i == 0) {
                x = 1;
                break;
            }
        }

    }

}
