package Hacker;



public class Array_Manipulation {

    static long arrayManipulation(int n, int[][] queries) {
//        此方法會超過時間
        long[] cal = new long [n+1];
        long max = 0;
        
        
        for(int i = 0;i<queries.length;i++){
           for(int j = queries[i][0];j<=queries[i][1];j++){
               cal[j] += queries[i][2];
               if(max < cal[j]){
                   max = cal[j];
               }
           }
        }

        
        
        return max;
    }
    
     static long arrayManipulation2(int n, int[][] queries) {
                    //為了節省時間，我只對於位置做上記號(從起始給予值而超過的地方扣回來)，然後用一個暫時容器去做最大值的判斷
        long[] cal = new long [n+2];
        long max = 0,tmp= 0;
        for(int i =0;i<queries.length;i++){
            
            int begin = queries[i][0];
            int end = queries[i][1];
            int val = queries[i][2];
            
            cal[begin] += val;
            cal[end+1] -=val;
           
        }
        for(int j = 0;j<cal.length;j++){
            tmp += cal[j];
            
            if(max < tmp){
                max = tmp;
            }
        }
        
        return max;
        
    }

    public static void main(String[] args) {
                
        int n = 5;

        int[][] queries = {
            {1,2,100},
            {2,5,100},
            {3,4,100}
        };
        
        int[][] q = {{2,6,8},
            {3,5,7},
            {1,8,1},
            {5,9,15}
    };

        
        long result = arrayManipulation2(10, q);
        System.out.println(result);
    }

}
