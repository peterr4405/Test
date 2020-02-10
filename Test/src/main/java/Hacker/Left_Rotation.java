package Hacker;

import java.util.Scanner;

public class Left_Rotation {

    static int[] rotLeft(int[] a, int d) {
        int count = 0;
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i + d < a.length) {
                res[i] = a[i + d];
            }else{
                res[i] = a[count];
                count++;
            }

        }
        return res;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        int[] result = rotLeft(a, d);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }

}
