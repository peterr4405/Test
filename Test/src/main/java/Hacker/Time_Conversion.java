package Hacker;


public class Time_Conversion {
    
       static String timeConversion(String s) {
           String result = "";
           int  month = Integer.parseInt(s.substring(0,2));
           
          if(s.contains("PM")){
              if(s.substring(0,2).equals("12")){
                  result = s.substring(0,8);
              }else
              month +=12;
               result = String.valueOf(month).concat(s.substring(2,8));
          }else{
              if(s.substring(0,2).equals("12")){
                  result = "00".concat(s.substring(2,8));
              }else
              result = s.substring(0,8);
          }
          return result;
    }
    
    public static void main(String[] args) {
        
        String s = "12:05:45AM";
        String result = timeConversion(s);
        System.out.println(result);
    }
    
}
