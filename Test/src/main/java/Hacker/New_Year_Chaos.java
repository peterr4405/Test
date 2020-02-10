package Hacker;

public class New_Year_Chaos {

    static void minimumBribes(int[] q) {
        int n = q.length;
        if (n < 2) {
            System.out.println(0);
            return;
        }
        int min1 = q[n - 1];
        int min2 = q[n - 2];
        int moves = 0;
        if (min2 > min1) {
            moves++;
        } else {
            min1 = q[n - 2];
            min2 = q[n - 1];
        }

        for (int i = n - 3; i >= 0; i--) {
            //最多賄賂2人 所以當數字超過2，就表示不存在 陣列是從0開始計算，而號碼是從1開始計算，所以要-1
            int gap = q[i] - i - 1;
            if (gap > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (q[i] > min2) {
                moves += 2;
            } else if (q[i] > min1) {
                moves++;
                min2 = q[i];
            } else if (q[i] < min1) {
                min2 = min1;
                min1 = q[i];
            }
        }
        System.out.println(moves);
    }

    public static void main(String[] args) {

        int[] q = {2,1,5,3,4};


        minimumBribes(q);

    }

}
