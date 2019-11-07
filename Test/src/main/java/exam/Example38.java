package exam;

import java.util.Scanner;


public class Example38 {
    
    public static void main(String[] args) {
//        题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。 

            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入一個字符串");
            String s = sc.nextLine();
            System.out.println("長度為:"+ s.length());

    }
    
}
