package exam;

public class Example43 {

    public static void main(String[] args) {
//        题目：求0—7所能组成的奇数个数。 

//         如果個位數為奇數，那前面不論是甚麼數都為奇數-> 1 3 5 7
//         兩位數的話，開頭不能為0，所以是1-7 7個數
        int sum = 0;

        for (int i = 1; i <= 8; i++) {
            if(i == 1){
                sum += 4;
            }else if(i == 2){
                sum *= 7;
            }else{
                sum *= 8;
            }            
        }
        System.out.println("8位數的奇數的總數為"+sum);
    }

}
