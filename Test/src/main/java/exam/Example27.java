package exam;

public class Example27 {

    public static void main(String[] args) {
//        题目：求100之内的素数 

        int n = 0;
        for (int i = 1; i <= 100; i++) {

            for (int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    n++;
                }
            }
            if (n == 2) {
                System.out.print(i + " ");
            }
            n = 0;
        }

    }

}
