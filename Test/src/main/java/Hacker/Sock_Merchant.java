package Hacker;



public class Sock_Merchant {

    static int sockMerchant(int n, int[] ar) {
        int couple = 0, left = 0;
        //left為指標 如果第一次匹對沒相符就將比對的第一個物件放入指標中，當發現匹對物件以後指標歸0
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < 0) {
                continue;
            }
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    couple += 1;
                    ar[i] = -1;
                    ar[j] = -1;
                    left = 0;
                    break;
                } else if (left == ar[j]) {
                    couple += 1;
                    left = 0;
                    ar[j] = -1;

                } else if(left ==0){
                    left = ar[i];
                }
            }
        }
        return couple;

    }

    public static void main(String[] args) {

        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] ar1 = {1,1,3,1,2,1,3,3,3,3};
        int result = sockMerchant(10, ar1);
        System.out.println(result);
    }

}
