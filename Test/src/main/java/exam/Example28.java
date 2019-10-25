package exam;

import java.util.ArrayList;
import java.util.Arrays;



public class Example28 {
    
    public static void main(String[] args) {
//        题目：对10个数进行排序
            
        int [] n = {10,18,5,4,17,49,52,3};

            Arrays.sort(n);
            
            for(int a : n){
                System.out.print(a+" ");
            }
            System.out.println();
    }
    

    
}
