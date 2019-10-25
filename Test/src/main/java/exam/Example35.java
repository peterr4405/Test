package exam;

import java.util.Scanner;

public class Example35 {

    public static void main(String[] args) {
//        题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。 

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int max = 0, min = 0, temp = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("請輸入數字: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a.length ; i++) {
            if (a[max] < a[i]) {
                max = i;
            }
        }
        temp = a[0];
        a[0] = a[max];
        a[max] = temp;

        for (int i = 0; i < a.length ; i++) {
            if (a[min] > a[i]) {
                min = i;
            }
        }

        temp = a[4];
        a[4] = a[min];
        a[min] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
