package exam;

public class 水仙花數 {

    public static void main(String[] args) {
//    所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
//    153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方

        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    sum = i * i * i + j * j * j + k * k * k;
                    if (sum == i * 100 + j * 10 + k) {
                        System.out.print(sum+" ");
                    }
                }
            }
        }

    }

}
