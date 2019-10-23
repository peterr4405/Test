package exam;

public class Example22 {
    
    public static void main(String[] args) {
//        题目：利用递归方法求5!。

        System.out.println(sum(5));
    }
    
    public static int sum(int max) {
        
        int total = max;
        
        for (int i = max - 1; i >= 1; i--) {
            total *= i;
        }
        
        if (max == 1) {
            return total;
        }
        
        return total + sum(max - 1);
        
    }
}
