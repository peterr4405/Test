package exam;

public class Example11 {

    public static void main(String[] args) {
        //    题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {

                    if (i != j && i != k && j != k) {
                        System.out.printf("%d%d%d\n", i, j, k);

                    }
                }
            }
        }

    }

}
