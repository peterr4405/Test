package Hacker;

import java.util.Arrays;

public class Mini_Max_Sum {

    static void miniMaxSum(int[] arr) {
        long min = 0, max = 0;
        Arrays.sort(arr);
        min  = arr[0];
        max = arr[arr.length-1];
        long sum  = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.printf("%d %d",sum-max,sum-min);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = {3,2,56,1,4};
        for (int i = 1; i <= 5; i++) {
            arr[i - 1] = i;
        }
        miniMaxSum(arr2);
    }

}
