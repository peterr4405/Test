package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Example49 {
    
    public static void main(String[] args) {
//        题目：计算字符串中子串出现的次数 
            int count = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入字串:");
            String str1 = sc.nextLine();
            System.out.println("請輸入要查詢的字:");
            String str2 = sc.nextLine();
            
            String[] spilt_str = str1.split(" ");
            for(String s : spilt_str){
                if(str2.equals(s)){
                    count++;
                }
            }

            
            System.out.printf("總共出現%d次",count);
    }
    
}
