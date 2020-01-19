package challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class challenge3 {

    public static void main(String[] args) {
//        猜數字遊戲 0A0B
//          假設乙要猜甲的數字，以下是他們的對話內容：
//          乙：1234
//          甲：0A0B (此時我們可以確定這個4位數字絕對不會是1、2、3、4所組成。)
//          乙：5678 (因此繼續猜5678)
//          甲：0A3B
//          乙：7865
//          甲：3A0B
//          乙：7860
//          甲：4A0B
//          直到甲方說出4A0B才算乙方真的猜中甲方的數字！
        play();

    }

    public static void play() {
        boolean correct = false;

        //創建4個不重複的數字當答案
        List tmp = new ArrayList();
        StringBuilder sb = new StringBuilder();

        while (tmp.size() < 4) {

            if (tmp.isEmpty()) {
                tmp.add(new Random().nextInt(9) + 1);
            }
            int num = new Random().nextInt(10);
            if (!tmp.contains(num)) {
                tmp.add(num);
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            sb.append(tmp.get(i));
        }
        String ans = sb.toString();

        while (!correct) {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入數字");
            String s = sc.next();
            correct = check(ans, s);
        }

    }

    public static boolean check(String ans, String s) {

        int A = 0, B = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == ans.charAt(i)) {
                    A++;
                    break;
                } else if (s.charAt(i) == ans.charAt(j)) {
                    B++;
                    break;
                }
            }

        }
        System.out.printf("A: %d B: %d\n", A, B);
        if (A == 4) {
            return true;
        }
        return false;
    }

}
