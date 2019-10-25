package exam;

public class Example33 {

    public static void main(String[] args) {
//        题目：打印出杨辉三角形（要求打印出10行如下图）

        int x = 10;
        int num[][] = new int[x][x];

        for (int i = 0; i < x; i++) {

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    num[i][j] = 1;
                } else {
                    num[i][j] = num[i - 1][j - 1] + num[i - 1][j];
                }
            }
        }
        
        for (int k = 0; k < x; k++) {
            for (int z = k; z < x; z++) {
                System.out.print(" ");
            }
            for (int d = x - k; d <= x; d++) {
                System.out.print(num[k][x - d] + " ");
            }
            System.out.println();
        }

    }

}
