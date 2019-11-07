package exam;

import java.util.Scanner;


public class Example46 {
    
    public static void main(String[] args) {
//        题目：两个字符串连接程序 

            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入第一串字串");
            String input1 = sc.nextLine();
            System.out.println("請輸入第二串字串");
            String input2 = sc.nextLine();
            
            String result = input1.concat(input2);
            System.out.println(result);

    }
    
}
