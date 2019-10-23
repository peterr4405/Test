package exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Example15 {

    public static void main(String[] args) {
//      输入三个整数x,y,z，请把这三个数由小到大输出。

        int[] arr = range(15, 7, 12);

        for(int ans : arr){
            System.out.print(ans+" ");
        }
    }

    public static int [] range(int x, int y, int z) {
        
        int[] ans = {x, y, z};
        Arrays.sort(ans);
        return ans;
    }

}
