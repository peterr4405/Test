
package challenge;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class challenge2 {
    
    public static void main(String[] args) {
//        成績分類 : 產生20個亂數，再做分類
//        90-100→甲
//        80-90→乙

           List<Integer> 甲 = new ArrayList<>();
           List<Integer> 乙 = new ArrayList<>();
           List<Integer> 丙 = new ArrayList<>();
           List<Integer> 丁 = new ArrayList<>();
           List<Integer> 戊 = new ArrayList<>();
           List<Integer> 己 = new ArrayList<>();
           List<Integer> 庚 = new ArrayList<>();
           List<Integer> 辛 = new ArrayList<>();
           List<Integer> 壬 = new ArrayList<>();
           List<Integer> 揆 = new ArrayList<>();
           
            for(int i=1;i<=20;i++){
                int x = new Random().nextInt(100)+1;
                if(x >=90){
                    甲.add(x);
                }else if(x>=80){
                    乙.add(x);
                }else if(x>=70){
                    丙.add(x);
                }else if(x>=60){
                    丁.add(x);
                }else if(x>=50){
                    戊.add(x);
                }else if(x>=40){
                    己.add(x);
                }else if(x>=30){
                    庚.add(x);
                }else if(x>=20){
                    辛.add(x);
                }else if(x>=10){
                    壬.add(x);
                }else{
                    揆.add(x);
                }
                
            }
            System.out.printf("甲:%s \n乙:%s \n丙:%s \n丁:%s \n戊:%s \n己:%s \n庚:%s \n辛:%s \n壬:%s \n揆:%s \n",甲,乙,丙,丁,戊,己,庚,辛,壬,揆);
            
  
    }
            
            
    }
    

