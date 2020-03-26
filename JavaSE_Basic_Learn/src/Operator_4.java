/*
    面试题：
        short s = 1, s = s+1;   Error
        short s = 1, s += 1;    没问题
            因为拓展的赋值运算符隐含了强制类型转换。
            s+=1;
            不等价于s = s+1;
            而是等价于 s = (s的数据类型)(s+1)

* */
public class Operator_4 {
    public static void  main(String[] args){
        /*
        Error
        short s = 1;//byte、short、char参与运算转换成int
        s = s+1;
        System.out.println(s);
        */

        //没问题
        short s = 1;
        s += 1;
        System.out.println(s);

    }
}
