package exam;



public class rabbit {
    
    public static void main(String[] args) {
        System.out.println(rabbitCount(2));
    }
    
    public static int rabbitCount(int month){
        //非波那契經典題目
        if(month ==1 || month == 2){
            return 1;
        }
        return rabbitCount(month-1)+rabbitCount(month-2);
    }
    
}
