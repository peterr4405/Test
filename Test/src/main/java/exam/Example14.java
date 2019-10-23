package exam;

import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) {
//        天數計算 閏年規則
//        公元年分除以4不可整除，為平年。
//        公元年分除以4可整除但除以100不可整除，為閏年。
//        公元年分除以100可整除但除以400不可整除，為平年。
//        公元年分除以400可整除，為閏年。
        int sum = 0,leap;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入年(西元):");
        int year = sc.nextInt();
        System.out.println("請輸入月:");
        int month = sc.nextInt();
        System.out.println("請輸入日:");
        int day = sc.nextInt();

        switch (month) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 59;
                break;
            case 4:
                sum = 90;
                break;
            case 5:
                sum = 120;
                break;
            case 6:
                sum = 151;
                break;
            case 7:
                sum = 181;
                break;
            case 8:
                sum = 212;
                break;
            case 9:
                sum = 243;
                break;
            case 10:
                sum = 273;
                break;
            case 11:
                sum = 304;
                break;
            case 12:
                sum = 334;
                break;
            default:
                System.out.println("輸入的越有問題");
                break;
        }
        sum += day;
        if((year%4 ==0 && year%100 !=0)||(year%4 ==0 && year%3200 !=0)){
            leap = 1;
        }else{
            leap = 0;
        }
        if(leap ==1 && month >2){
            sum++;
        }
        System.out.printf("總天數為%d天",sum);
    }

}
