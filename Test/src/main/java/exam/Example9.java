package exam;

import java.util.HashSet;
import java.util.Iterator;

public class Example9 {

    public static void main(String[] args) {
//        题目：一個数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。 

        System.out.println(Prime(1000));

    }

    public static int Prime(int num) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        int x = 2, sum = 0, cal = num;

        if (cal == 1) {
            return 1;
        }

        while (x < cal) {
            if (cal % x == 0) {
                set.add(x);
            }
            x++;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sum += (int) it.next();
        }

        if (num == sum) {
            System.out.print(sum+" ");
            return Prime(num - 1);
        }

        return Prime(num - 1);
    }

}
