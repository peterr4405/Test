package exam;

public class Example31 {

    public static void main(String[] args) {
//        题目：将一个数组逆序输出。

        int[] arr = {3, 4, 9, 12, 15, 21, 73};
        int box;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    box = arr[i];
                    arr[i] = arr[j];
                    arr[j] = box;
                }
            }
            System.out.print(arr[i]+" ");
        }

    }

}
