package exam;

import java.util.Scanner;



public class Example24 {
    
    public static void main(String[] args) {
//        题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。 

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字:");
        String num = sc.next();
        int s = Integer.parseInt(num);
        
        
        int len = num.length();
        int [] ans = new int[len];
        
        for(int i=0;i<len;i++){
           ans[i] = s%10;
           s /= 10; 
    }
        System.out.printf("你輸入的數字為%d位數，逆序為",len);
        for(int i=0;i<len;i++){
        System.out.print(ans[i]);
        }
    }
    
}
