package exam;


public class Example48 {
    
    public static void main(String[] args) {
//        题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字
//        都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。

        System.out.println(encode(3217));

    }

public static String encode(int num){

        int result = 0,temp=0;
        int dig = num%10;
        int ten = num/10 %10;
        int hun = num/100 %10;
        int thou = num/1000;
        
        dig = cal(dig);
        ten = cal(ten);
        hun = cal(hun);
        thou = cal(thou);
        
        result = dig*1000+ten*100+hun*10+thou;
       String ans = Integer.toString(result);
       if(result<1000){
           return "0"+ans;
       }
        return ans;
}

public static int cal(int n){
    int s = n;
    s = (n+5)%10;
    return s;
}
    
}
