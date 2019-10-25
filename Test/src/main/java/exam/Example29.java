package exam;


public class Example29 {
    
    public static void main(String[] args) {
//        题目：求一个3*3矩阵对角线元素之和

        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int sum =0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i == j || (i+j)==2){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    
}
