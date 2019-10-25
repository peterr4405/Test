package exam;

import java.util.Scanner;

public class Example36 {

    public static void main(String[] args) {
//        题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数 

        System.out.println("請輸入你要輸入多少個個數:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("請輸入第%d個數\n", i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.println("目前順序為:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("你希望往右偏移多少?(不能超過長度)");

        int m = sc.nextInt();

        while (true) {
            if (m > len - 1 || m < 0) {
                System.out.println("移動的位數不能大於長度或為負數，請重新輸入:");
                m = sc.nextInt();
            } else {
                break;
            }
        }

        int[] newArr = new int[len];

        for (int i = 0; i < len; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < len; i++) {
            int tmp = (i + m) % len;
            arr[tmp] = newArr[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
