package exam;

public class Example20 {

    public static void main(String[] args) {
//        题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

        System.out.println(sum(2, 1, 20));
    }

    public static double sum(double i, double j, int count) {

        double sum = i / j;
        
        if (count == 1) {
            return sum;
        }else
        
        return sum + sum((i + j), i, count - 1);
    }

}
