package exam;

import java.util.Scanner;


public class Example7 {
    
    public static void main(String[] args) {
//        输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数

    int abcCount =0,spaCount = 0, numCount = 0, othCount =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一串字串");
        String str = sc.nextLine();
        char [] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                abcCount++;
            }else if(Character.isDigit(ch[i])){
                numCount++;
            }else if(Character.isSpaceChar(ch[i])){
                spaCount++;
            }else{
                othCount++;
            }       
        }
        System.out.printf("中英文字母有%d個，數字有%d個，空格有%d個,其他符號有%d個",abcCount,numCount,spaCount,othCount);
        
    }

}
