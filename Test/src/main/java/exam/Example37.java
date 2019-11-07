package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example37 {

    public static void main(String[] args) {
//        题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下
//        的是原来第几号的那位。

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入人數:");
        int num = sc.nextInt();
        int n = num;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        int count = 1;
        int index = 0;

        while (num > 1) {
            if (count == 3) {
                count = 1;
                System.out.println("移除: "+list.get(index));
                list.remove(index);
                num--;
            }
            index++;
            count++;
            if (index > num-1) {
                index = 0;
            }
        }
        System.out.println("最後剩下的是: "+list.get(0));

    }

}
