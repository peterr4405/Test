package exam;

import java.util.Scanner;

public class Example30 {

    public static void main(String[] args) {
//        题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。

//        題目沒有說是升序還是降序，所以得先做一個判斷是升序還是降序，之後在進行排序

//        int[] arr = {3, 4, 9, 12, 15, 21, 73};
        int[] arr = {73, 21, 15, 12, 9, 4, 3};        
        int[] arrs = new int[arr.length + 1];
        int box;
        boolean ascend = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個數:");
        int num = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            if (arr[i] < arr[i + 1]) {
                ascend = true;
            }
        }

        for (int i = 0; i < arrs.length - 1; i++) {
            arrs[i] = arr[i];
        }
        arrs[arrs.length - 1] = num;

        for (int i = 0; i < arrs.length; i++) {
            for (int j = i+1; j < arrs.length; j++) {
                if (ascend) {
                    if (arrs[i] > arrs[j]) {
                        box = arrs[i];
                        arrs[i] = arrs[j];
                        arrs[j] = box;
                    }
                }
                if (!ascend) {
                    if (arrs[i] < arrs[j]) {
                        box = arrs[i];
                        arrs[i] = arrs[j];
                        arrs[j] = box;
                    }
                }
            }
            System.out.print(arrs[i] + " ");
        }

    }

}
