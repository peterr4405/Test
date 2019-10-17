package exam;


public class Example12 {
    
    public static void main(String[] args) {
//题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万
//元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；20万到40万之间时，高于20万元的部
//分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可
//提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
        System.out.println(Bouns(450000));

    }
    
    public static double Bouns(double money){
    double  firBouns = 100000*0.1,
            secBouns = 100000*0.075,
            thirBouns = 200000*0.05 ,
            fouBouns = 200000*0.03 ,
            fivBouns = 400000*0.015;
    
       if(money <=100000.0){
           money *= 0.1; 
       }
       else if(money<=200000){
           money = firBouns+(money-100000)*0.075;
    }else if(money <=400000){
        money =firBouns+secBouns+(money-200000) * 0.05;
    }else if(money <=600000){
        money =firBouns+secBouns+ thirBouns+ (money-400000) * 0.03;
    }else if(money <=1000000){
        money =firBouns+secBouns+ thirBouns+ fouBouns+(money-600000) * 0.015;
    }else {
        money =firBouns+secBouns+ thirBouns+ fouBouns+ fivBouns +(money-1000000) * 0.01;
    }
       return money;
    
    }
    
}
