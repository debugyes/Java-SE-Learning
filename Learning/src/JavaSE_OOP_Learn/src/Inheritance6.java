/*
    继承中构造方法的关系
        A: 子类中的所有构造方法默认都会访问父类中空参数的构造方法
        B: 为什么呢？
            因为子类会继承父类中的数据，可能还会使用父类的数据
            所以，子类初始化之前，一定要先完成父类数据的初始化
        C: 注意：子类每一个构造方法的第一条语句默认都是：super(空)
 */

public class Inheritance6 {
    public static void main(String[] args){
        SonD s = new SonD();
        System.out.println("-------------------------------");
        SonD s2 = new SonD("megumi");
    }
}

class FatherD{
    public FatherD(){
        System.out.println("Father的无参构造方法");
    }

    public FatherD(String name){
        System.out.println("Father的带参构造方法");
    }
}

class SonD extends FatherD{
    public SonD(){
        super();
        System.out.println("Son的无参构造方法");
    }

    public SonD(String name){
        super();
        System.out.println("Son的带参构造方法");
    }
}

