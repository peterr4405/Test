package exam;

import java.util.ArrayList;
import java.util.List;

public class 鴻揚考題 {

    public static void main(String[] args) {

        /*        第一隻的母蜂不會死亡，母蜂可以生一隻公蜂，公蜂可以生一隻母蜂一隻公蜂，並且生完後就死亡，計算出N年後，有多少隻蜜蜂。
        
 	公蜂	母蜂
N=0	0	1
N=1	1	1
N=2	2	2
N=3	4	3
N=4	7	5
N=5	12	8
        公蜂數量(mt) = 上一代數量
        母蜂數量(ft) = 上一代公蜂數量+1
        
         */
        int[] count = Bee(5);
        for (int c : count) {
            System.out.print(c + "\t");
        }

    }

    public static int[] Bee(int N) {

        int f = 1, m = 0, ft = 0, mt = 0;
        int[] ans = new int[2];
        while (N > 0) {
            ft = m + 1;
            mt = m + f;
            f = ft;
            m = mt;
            N--;
        }
        ans[0] = m;
        ans[1] = f;

        return ans;
    }

}
