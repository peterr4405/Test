package exam;

import java.util.Scanner;



public class Example32 {
    
    public static void main(String[] args) {
//        题目：取一个整数a从右端开始的4～7位。

        System.out.println("請輸入超過7位數的數字");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while(Integer.parseInt(input) <1000000){
            System.out.println("數字不能小於7位數");
            input = sc.next();
        }
        
        System.out.printf("%s的右端開始4-7位分別為%s%s%s%s",input,input.charAt(3),input.charAt(4),input.charAt(5),input.charAt(6));
        
    }
    
}
