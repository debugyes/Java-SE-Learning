/*
    +是一个运算符。用来做加法运算

    一般来说，在运算的时候，要求参与运算的数据类型必须一致

    注意：
        boolean类型不能转换为其他数据类型

    默认转换（从小到大的转换）：
    A:byte，short，char-int-long-float-double
    B：byte,short,char相互之间不转换，他们参与运算首先转换为int类型
    C：如果有long或float或double参与运算，结果必为long或float或double
* */

public class Plus_Operator {
    public static void main(String[] args){
        //直接输出的方式做加法
        System.out.println(3+4);

        //两个int类型做+法
        int x = 3;
        int y = 4;

        int z = x+y;
        System.out.println(z);

        //定义一个byte类型，一个int类型，做加法
        byte a = 3;
        int b = 4;
        System.out.println(a+b);

        //可能损失精度
        //byte c = a+b;
        int c = a+b;
        System.out.println(c);


    }
}
