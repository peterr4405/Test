package exam;

public class Example13 {

    public static void main(String[] args) {
//        题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少

        int temp1 = 0, temp2 = 0;
        for (int i = 1; i < 10000; i++) {
            temp1 = (int) Math.sqrt(i + 100);
            temp2 = (int) Math.sqrt(i + 100 + 168);
            if (Math.pow(temp1, 2) == (i + 100) && Math.pow(temp2, 2) == (i + 100 + 168)) {
                System.out.println(i);
            }

        }
    }

}
