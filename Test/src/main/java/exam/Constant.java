package exam;

import java.util.ArrayList;

public class Constant {

    public static void main(String[] args) {

        System.out.println(constant(101, 200));

    }

    public static ArrayList<Integer> constant(int min, int max) {
        //計算兩數間所有質數
        //質數只會被1和自己整除，m用來存放餘數，n則是存放因子的數量當因子的數量為2，則表示他是質數
        ArrayList<Integer> ans = new ArrayList<>();
        int m = 0, n = 0;
        for (; min <= max; min++) {
            for (int i = 1; i <= min; i++) {
                m = min % i;
                if (m == 0) {
                    n += 1;
                }
            }
            if (n == 2) {
                ans.add(min);
            }
            n=0;
        }
        return ans;

    }
}
