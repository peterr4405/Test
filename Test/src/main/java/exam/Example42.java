package exam;

import java.util.Random;



public class Example42 {
    
    public static void main(String[] args) {
//        题目：809*??=800*??+9*??+1
//        其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
            int n = 809, sum=0 , i=1;
            
            for(;i<100;i++){
                if(i*8<100 && i*9 > 99){
                    sum = 800*i+9*i+1;
                    break;
                }
            }
            System.out.println(i);
            System.out.println(sum);
            
    }
    
}
