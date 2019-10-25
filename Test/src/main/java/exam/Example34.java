package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example34 {

    public static void main(String[] args) {
//        题目：输入3个数a,b,c，按大小顺序输出。
        int a,b,c;
        int [] ans = new int[3];
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入第一個數:");
        a = sc.nextInt();
        System.out.println("請輸入第二個數:");
        b = sc.nextInt();
        System.out.println("請輸入第三個數:");
        c = sc.nextInt();
        
        ans[0] = a;
        ans[1] = b;
        ans[2] = c;
        
        Arrays.sort(ans);
        
        for(int i=0; i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

}
