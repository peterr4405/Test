package exam;

public class Example8 {
//    题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
//    几个数相加有键盘控制。

    public static void main(String[] args) {
        System.out.println(sum(2, 4));

    }

    public static int sum(int num, int len) {
        int x = 0, length = len;
        if (len == 0) {
            return x;
        }
        while (length >= 1) {
            length--;
            x += (int) Math.pow(10, length) * num;
        }
        return x + sum(num, len - 1);
    }

}
