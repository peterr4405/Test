package Hacker;



public class Repeated_String {

    static long repeatedString(String s, long n) {
        //為了避免資料超過int的最大上限，先用long處理，等之後計算餘數的時候再強轉int

        long result = 0,count,res ;
        int len = s.length();
        count =  n / len;
        res = (int) n % len;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                result++;
            }
        }
        result *= count;

        for (char c : s.substring(0,(int)res).toCharArray()) {
            if(c == 'a')
            result++;
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "a";
        long n = 1000000000000L;

        long result = repeatedString(s, n);
        System.out.println(result);
    }

}
