/*
    数据类型：java是一种强类型的语言，针对每一种数据都定义了明确的数据类型

    数据类型分类：
        A:基本数据类型
        B：引用数据类型（类，接口，数值）
    基本数据类型：4类8种
        A:整数
            byte    1字节       （1字节8位）
            short   2字节
            int     4字节
            long    8字节
        B:浮点数
            float   4字节
            double  8字节
        C:字符
            char    2字节
        D:布尔
            boolean

     注意：
        整数默认int类型
        浮点数默认double类型
        long后缀最好用L标记
        float后面最好用F标记
* */
public class Data_Type {
    public static void main(String[] args){
        //定义变量的格式：
        //数据类型 变量名 = 初始化值

        //定义一个字节
        byte b = 10;
        System.out.println(10);
        System.out.println(b);

        //定义一个短整型变量
        short s = 100;
        System.out.println(100);
        System.out.println(s);

        //定义一个整型变量
        int i = 1000;
        System.out.println(1000);
        System.out.println(i);
        //超过int的范围
        //int j = 1000000000000000000000000000000;
        //用long就可以，但常量后面要加L
        long j = 1000000000000000000L;
        //long j = 100L;

        //定义浮点数
        float f = 12.325F;//必须要加F后缀，不然会报错损失精度，因为浮点数默认double类型
        System.out.println(f);

        double d = 12.343;
        System.out.println(d);

        //定义字符变量
        char ch = 'a';
        System.out.println(ch);

        //定义bool变量
        boolean flag = true;
        System.out.println(flag);
    }

}
