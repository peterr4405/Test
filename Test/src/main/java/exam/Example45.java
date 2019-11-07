package exam;

import java.util.Scanner;

public class Example45 {

    static int count = 0;
    static int num  = 0;

    public static void main(String[] args) {
//        判断一个数能被几个9整除

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入一個可以被9除的數: ");
            num = sc.nextInt();
            if (num % 9 == 0) {
                break;
            }
            System.out.println("你輸入的數不能被9整除!請重新輸入");
        }

        cal(num);
        System.out.printf("可以被%d個9整除",count);

    }

    public static int cal(int n) {

        while (true) {
            if (n <9) {
                break;
            }
            n /= 9;
            count++;
        }
        return count;
    }

}
