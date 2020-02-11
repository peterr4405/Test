package Hacker;

public class Two_Strings {

    static String twoStrings(String s1, String s2) {
        String ans = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s1.indexOf(ch) > -1 && s2.indexOf(ch) > -1) {
                ans = "YES";
                return ans;
            }
        }
        if (ans.equals("")) {
            ans = "NO";
        }
        return ans;

    }

    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hi world";

        String result = twoStrings(s1, s2);
        System.out.println(result);
    }

}
