/*
    成员变量和局部变量的区别
        A:在类中的位置不同
            成员变量：在类中方法外
            局部变量：在方法定义中或方法声明上
        B:在内存中的位置不同
            成员变量：在堆内存中
            局部变量：在栈内存中
        C:生命周期不同
            成员变量：随着对象的创建而存在，随着对象的消失而消失
            局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
        D:初始化值不同
            成员变量：有默认初始化值
            局部变量：没有默认初始化值，必须定义赋值，然后才能使用

       注意事项：
        局部变量名称可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则。
* */

class VariableDemo{
    //成员变量
    //int num = 10;
    int num = 0;
    public void show() {
        //int num2 = 20;//局部变量
        //int num2; //没有默认值，可能尚未初始化变量num2
        int num2 = 20;
        System.out.println(num2);

        int num = 100;
        System.out.println(num);
    }
}
public class Variable {
    public static void main(String[] args) {
        VariableDemo v = new VariableDemo();
        System.out.println(v.num);//无法访问show方法中的n局部变量um

        v.show();
    }
}
