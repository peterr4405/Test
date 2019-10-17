package exam;

public class Example6 {

    public static void main(String[] args) {
//        输入两個正整数m和n，求其最大公因数和最小公倍数。

        System.out.println(gcd(15, 18));
        System.out.println(lcm(16, 40));
    }

    public static int gcd(int m, int n) {
        //最大公因數
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        if (m % n == 0) {
            return n;

        } else {
            m %= n;
            return gcd(m, n);
        }

    }

    public static int lcm(int m, int n) {
        int x = 1;
//最小公倍數
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        int lcm = m;
        while (lcm % n != 0) {
            lcm = m * x;
            x++;
        }
        return lcm;

    }

}
