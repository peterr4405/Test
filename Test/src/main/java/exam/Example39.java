package exam;

public class Example39 {

    public static void main(String[] args) {
//        题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数
//        1/1+1/3+...+1/n(利用指针函数) 

        System.out.println(cal(8));
    }

    public static float cal(float n) {
        float sum = 0;
        if (n % 2 == 0) {
            while (n >= 2) {
                sum += (1/n);
                n -= 2;
            }
        } else {
            while (n >= 1) {
                sum += (1 / n);
                n -= 2;
            }
        }

        return sum;
    }
}
