package Hacker;


public class Counting_Valleys {
    
    static int countingValleys(int n, String s) {

        int sea = 0,val=0;
        for(char c : s.toCharArray()){
            if(c == 'U') sea++;
            if(c == 'D') sea--;
            if( c == 'U' && sea == 0){
                val++;
            }
        }
        return val;

    }
    
    
    public static void main(String[] args) {
        
        int n = 8;
        String s = "UDDDUDUU";

        int result = countingValleys(n, s);
        System.out.println(result);
    }
    
}
