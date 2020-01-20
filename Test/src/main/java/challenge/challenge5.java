package challenge;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class challenge5 {

    public static void main(String[] args) {
//        計算出使用者輸入日期加上天數，並印出原本日期 和 加上天數日期
//        public Date Computation Date(String date, int dateNum)
//
//        Date使用者輸入的日期
//        dateNum 使用者輸入的天數
    
        Date date = CompuDate("2019-05-10", 32);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }

    public static Date CompuDate(String date, int dateNum) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date calDate = new Date();
        
        try {
            Date startDate = sdf.parse(date);
            Calendar cl = Calendar.getInstance();
            cl.setTime(startDate);
            cl.add(Calendar.DATE, dateNum);
            calDate = cl.getTime();
            
        } catch (Exception e) {
        }
        
        return calDate;
    }
}
