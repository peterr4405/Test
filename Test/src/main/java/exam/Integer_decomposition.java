package exam;

import java.util.ArrayList;

public class Integer_decomposition {

    public static void main(String[] args) {

        System.out.println(dec(90));

    }

    public static ArrayList<Integer> dec(int m) {
//      整數分解質因數
        
        ArrayList<Integer> ans = new ArrayList<>();
        int x = 2;
        if (m <= 1) {
            return null;
        } else {
            while (x <= m) {
                while (m % x == 0) {
                    ans.add(x);
                    m /= x;
                }
                x++;
            }
        }
        return ans;
    }

}
