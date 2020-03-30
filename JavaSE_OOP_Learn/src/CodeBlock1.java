/*
    代码块：在Java中，使用{}括起来的代码被称为代码块
    根据其位置和声明的不同，可以分为
        局部代码块:方法定义中,用于限定变量生命周期，及早释放，提高内存利用率
        构造代码块:在类中的成员位置,用{}括起来的代码，每次调用构造方法执行前，都会先执行构造代码块
            作用：可以把多个构造方法中的共同代码放到一起。对对象进行初始化。
        静态代码块:在类中的成员位置,用{}括起来的代码，用static修饰.
            作用：一般是对类进行初始化。

    面试题：
        静态代码块，构造代码块，构造方法的执行顺序
        静态代码块->构造代码块->构造方法

        静态代码块：只执行一次
        构造代码块:每次调用构造方法都执行
 */
public class CodeBlock1 {
    public static void main(String[] args) {
        {
            int x = 10;
            System.out.println(x);
        }

        {
            int y = 20;
            System.out.println(y);
        }
        System.out.println("-----------------------------");

        Code c = new Code();
        System.out.println("------------------------------");

        Code c2 = new Code();
        System.out.println("------------------------------");


    }
}

class Code{
    //静态代码块
    static {
        int a = 1000;
        System.out.println(a);
    }

    //构造代码块
    {
        int x = 100;
        System.out.println(x);
    }

    //构造代码块
    {
        int y = 100;
        System.out.println(y);
    }

    //构造方法
    public Code() {
        System.out.println("Code");
    }

    //构造方法
    public Code(int a) {
        System.out.println("Code");
    }

    static {
        int b = 1000;
        System.out.println(b);
    }

}