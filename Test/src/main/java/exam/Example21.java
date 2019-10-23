package exam;

public class Example21 {

    public static void main(String[] args) {
//        题目：求1+2!+3!+...+20!的和

        System.out.println(sum(20));
    }

    public static int sum(int max) {

        int total = max;

        for (int i = max - 1; i >= 1; i--) {
            total *= i;
        }

        if (max == 1) {
            return total;
        }

        return total + sum(max - 1);

    }

}
