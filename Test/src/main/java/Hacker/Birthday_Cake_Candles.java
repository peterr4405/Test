package Hacker;

import java.util.Arrays;
import org.hibernate.boot.model.source.spi.PluralAttributeMapKeyManyToAnySource;


public class Birthday_Cake_Candles {
    
     static int birthdayCakeCandles(int[] ar) {
         int count = 1;
         int len = ar.length;
         
         Arrays.sort(ar);
         while(ar[len-1] == ar[len-2]){
             count++;
             len--;
             if(len == 0){
                 break;
             }
         }
         return count;
    }
    
    public static void main(String[] args) {
        
        int[] ar = {3,2,1,3};
        
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
        
    }
    
}
