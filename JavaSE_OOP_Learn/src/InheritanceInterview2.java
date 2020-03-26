/*
    面试题2：看程序写结果
        A:一个类的静态代码块，构造代码块，构造方法的执行流程
            静态代码块->构造代码块->构造方法
        B:静态的内容是跟随类的加载而加载
            静态代码块的内容会优先执行
        C:子类初始化之前先会父类的初始化


    1.加载父静态代码块
    2.加载子静态代码块
    3.加载父构造代码块（构造代码块只有在构造方法调用的时候才会在构造方法之前执行）
    4.加载父构造方法
    5.加载子构造代码块
    6.加载子构造方法

    结果：
    静态代码块Fu
    静态代码块Zi
    构造代码块FU
    构造方法Fu
    构造代码块Zi
    构造方法Zi

 */
public class InheritanceInterview2 {
    public static void main(String[] args){
        ZiA z = new ZiA();
    }
}

class FuA{
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块FU");
    }

    public FuA(){
        System.out.println("构造方法Fu");
    }
}

class ZiA extends FuA{
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public ZiA(){
        System.out.println("构造方法Zi");
    }
}
