package exam;

import java.util.Scanner;

public class Example26 {

    public static void main(String[] args) {
//        题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。
//        Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        System.out.println("請輸入日期的第一個字母:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        switch (input.toLowerCase()) {
            case "m":
                System.out.println("星期一");
                break;
            case "t":
                System.out.println("請再輸入第二個字母進行更精確的判斷:");
                String sec = sc.next();
                if (sec.toLowerCase().equals("u")) {
                    System.out.println("星期二");
                } else if (sec.toLowerCase().equals("h")) {
                    System.out.println("星期四");
                } else {
                    System.out.println("錯誤的日期!");
                }
                break;
            case "w":
                System.out.println("星期三");
                break;
            case "f":
                System.out.println("星期五");
                break;
            case "s":
                System.out.println("請再輸入第二個字母進行更精確的判斷:");
                String sec2 = sc.next();
                if (sec2.toLowerCase().equals("a")) {
                    System.out.println("星期六");
                } else if (sec2.toLowerCase().equals("u")) {
                    System.out.println("星期日");
                } else {
                    System.out.println("查無此日期!");
                }
                break;
                default:
                    System.out.println("錯誤的字母!");
                    break;
        }

    }

}
