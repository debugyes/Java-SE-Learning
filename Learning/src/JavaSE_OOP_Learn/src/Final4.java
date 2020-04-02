package JavaSE_OOP_Learn.src;
/*
    final修饰变量的初始化时机
        A:被final修饰的变量只能赋值一次
        B:在构造方法完毕前。（非静态变量）
* */

public class Final4 {
    public static void main(String[] args) {
        Init i = new Init();
        System.out.println(i.num);
        System.out.println(i.num2);
    }
}

class Init {
    /*
    int num = 10;
    final int num2 = 20;
     */

    final int num2;
    int num;

    {
        num2 = 100;
    }

    public Init() {
        num = 100;
        //num2 = 200;
    }
}
