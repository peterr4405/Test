package exam;


public class Example23 {
    
    public static void main(String[] args) {
//        题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问
//        第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个
//        人多大？

        int age = 10;
        int count = 5;
        
        for(;count>1;count--){
            age += 2;
        }
            System.out.printf("第5個人年齡為%d歲\n",age);
    }
    
}
