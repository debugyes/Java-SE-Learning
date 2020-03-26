/*
    面试题：
        请实现两个整数变量的交换
* */
public class Place_Operator_3 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b:"+b);

        //方式1：使用第三方变量
        /*
        int t;
        int c;
        c = a;
        a = b;
        b = c;
        */
        //方式2：用异或实现
        /*
        a = a^b;
        b = a^b;//(a^b)^b = a
        a = a^b;//a^(b^a) = b
        System.out.println("a:"+a+",b:"+b);
        */
        //方式3：用变量相加
        /*
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a:"+a+",b:"+b);
        */
        //方式4：一句话搞定
        b = (a+b)-(a=b);//b=30-20=10, a = 20
        System.out.println("a:"+a+",b:"+b);
    }
}
