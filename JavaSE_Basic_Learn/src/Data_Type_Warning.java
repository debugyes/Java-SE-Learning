/*
    使用变量的时候需要注意的问题：
        A：作用域
                变量定义在哪个大括号内，它就在这个大括号内有效。
                并且，在同一个大括号内不能同时定义同名的变量
        B：初始化值
                没有初始化值的变量不能直接使用。
                只要在使用之前给值就行，不一定非要在定义的时候立即给值。
                推荐在定义的时候给值。

                定义变量的格式：
                    a:数据类型  变量名 = 初始化值；
                    b：数据类型 变量名；
                        变量名 = 初始化；
        C：在一行上定义多个变量
            可以定义多个，但是不建议
* */
public class Data_Type_Warning {
    public static void main(String [] args){
        //定义变量
        int x = 100;
        //int x = 200;  Error，不能有同名的变量

        //定义变量必须给值
        //int y;
        //System.out.println(y);

        int z;
        z = 100;
        System.out.println(z);

        //在一行上定义多个变量;不建议
        //int a = 10; int b = 20; int c = 30;
        //上面的写法可以，但是不建议
        int a = 10;
        int b = 20;
        int c = 30;

        //不建议一行定义多个变量
        //int d, e;
    }
}
