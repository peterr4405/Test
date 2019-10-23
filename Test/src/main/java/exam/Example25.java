package exam;

import java.util.Scanner;

public class Example25 {

    public static void main(String[] args) {
//        题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。 

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個5位數的數字:");
        String num = sc.next();
        int s = Integer.parseInt(num);
        int len = num.length();
        int [] res = new int [len];
        

        for (int i = 0; i < len; i++) {
            res[i] = s % 10;
            s /= 10;
        }
        if(res[0] == res[4] && res[1] == res[3]){
            System.out.println("是回數");
        }else{
            System.out.println("不是回數");
        }
        

    }

}
