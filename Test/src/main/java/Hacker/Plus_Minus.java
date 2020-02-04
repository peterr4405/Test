package Hacker;

import java.util.Scanner;


public class Plus_Minus {
     // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
       float pos = 0,neg = 0, zero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }else if(arr[i]<0){
                neg++;
            }else{
                zero++;
            }
        }
            float a = pos/arr.length;
            float b = neg/arr.length;
            float c = zero/arr.length;
            System.out.printf("%.6f\n%.6f\n%.6f\n",a,b,c);
            
    }
    

    public static void main(String[] args) {
        
        int [] arr = {-4,3,-9,0,4,1};
        
        plusMinus(arr);


    }
}
