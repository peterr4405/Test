package Hacker;

public class Jumping_on_the_Clouds {

    static int jumpingOnClouds(int[] c) {
        int count = 0, len = c.length - 1;
        //先判斷第二格能不能走，如果可以就走兩格，不能就走一格，最後再附加一個判斷如果只剩下一格就走一格
        for (int i = 0; i < c.length;) {

            if (len - i < 2) {
                count++;
                break;
            }

            if (c[i + 2] == 0) {
                i += 2;
                count++;
                if (i == len) {
                    break;
                }
            } else {
                i++;
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {

        int[] c = {0, 0, 0, 1, 0, 0};
        int result = jumpingOnClouds(c);

        System.out.println(result);
    }

}
