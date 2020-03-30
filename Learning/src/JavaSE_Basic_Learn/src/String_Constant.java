/*
    常量：在程序执行过程中，其值不发生改变的量

    分类：
        A：字面值常量
        B：自定义常量

    字面值常量
        A:字符串常量：用双引号括起来
              举例"hello"
        B：整数常量：所有的整数
        C：小数常量
        D:字符常量：用单引号括起来的内容
            举例：'a'  'A'
            错误：'ab'
         E：布尔常量：true和false
         D：空常量
            举例：null
* */
public class String_Constant {
    public static void  main(String[] args){
        //字符串常量的输出
        System.out.println("hello");

        //整数常量的输出
        System.out.println(100);

        //小数常量的输出
        System.out.println('a');
        System.out.println('A');
        System.out.println('0');
        //Error:System.out.println('ab');

        //bool常量的输出
        System.out.println(true);
        System.out.println(false);
    }
}
