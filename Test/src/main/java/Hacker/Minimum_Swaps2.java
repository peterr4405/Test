package Hacker;

import java.util.Arrays;


public class Minimum_Swaps2 {
    
    static int minimumSwaps(int[] arr) {
        //先用一個最後的結果來做比較，如果值不對就表示她需要進行排序
        int count = 0,tmp=0;
        int[] ar = Arrays.copyOf(arr,arr.length);
        Arrays.sort(ar);
        
        for(int i =0;i<arr.length;i++){
            if(arr[i] != ar[i]){
                tmp = ar[i];
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] == tmp){
                    arr[j] = arr[i];
                    arr[i] = tmp;
                    count++;
                    break;
                }
            }
          
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {4,3,1,2};
        
        int res = minimumSwaps(arr);
        System.out.println(res);
        
    }
    
}
