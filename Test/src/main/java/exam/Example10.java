package exam;


public class Example10 {
    static boolean firstTime = true;
    
    public static void main(String[] args) {
//        题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？ 

        System.out.printf("共%.6f米\n",totalH(100, 10));

    }
    
    public static double totalH(double maxH,double count){
//        除了第一次和最後一次落下時不會有反彈高度其他次落下會有反彈高度，所以需*2
        
        
        double sum = maxH;
        if(count == 0){
            System.out.printf("第10次反彈: %.6f高\n",maxH);
            return sum;
        }
        if(firstTime == true){
            sum = maxH/2;
            firstTime = false;
        }
        
    return sum*2 + totalH(maxH/2, count-1);
    
    
    } 
    
}
