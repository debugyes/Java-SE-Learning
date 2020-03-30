/*
    运算符：就是对常量和变量进行操作的符号。

    分类：算术运算符、赋值运算符、比较运算符、逻辑运算符、位运算符、三目运算符

    算数运算符：+、-、*、/、%、++、--

    注意事项：
        A：整数相除只能得到整数。如果想得到小数，必须把数据变化为浮点数类型
        B：/获取的是除法操作的商，%获取的是除法操作的余数

    ++, --运算符的使用：
        作用：对变量进行自增或自减。
        使用：单独使用：放在操作数的前面和后面效果一样。（比较常见）
              参与运算使用：放在操作数的前面，先自增或者自减，再参加运算
                            放在操作数的后面，先参加运算，再自增或自减

* */
public class Operator {
    public static void main(String[] args){
        //定义变量
        int x = 3;//把3赋值给int类型的变量x
        int y = 4;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);//整数相除只能得到整数

        //就想得到小数该怎么办
        //只要把操作的数据中任意的一个数据变为浮点数
        System.out.println(x*1.0/y);


        //%的应用
        System.out.println(x%y);

        //++、--运算符的使用

        //System.out.println("x="+x);
        //System.out.println("y="+y);
        System.out.println("x:"+x+",y:"+y);

        //单独使用
        x++;
        y--;
        System.out.println("x:"+x+",y:"+y);
        //参与运算使用
        int a = 3;
        int b = 4;

        int c = a++;
        int d = b--;
        /*
        int c = ++a;
        int d = --b;
         */
        System.out.println("a:"+a);//4,3
        System.out.println("b:"+b);//3,4
        System.out.println("c:"+c);//3,4
        System.out.println("d:"+d);//4,3

    }
}