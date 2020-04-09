package JavaSE_OOP_Learn.src;
/*
    多态的弊端：
        不能使用子类的特有功能。
        解决方法
            A：创建子类对象调用方法(可以，凡是不合理，且太占内存)
            B: 向下转型：把父类对象赋值给子类引用(要加强制转换)

    对象间的转型问题：
        向上转型：
            Fu f = new Fu();
        向下转型：
            Zi z = (Zi) f; //要求该f必须是能够转换为Zi的

 */

public class Polymorphism3 {
    public static void main(String[] args) {
        //测试
        Fu2 f = new Zi2();
        f.show();
        //f.method();

        //创建子类对象
        Zi2 z = new Zi2();
        z.method();
        System.out.println("-------------------------");

        //把父类对象赋值给子类引用
        Zi2 z2 = (Zi2)f;
        z2.show();
        z2.method();

    }
}

class Fu2{
    public void show() {
        System.out.println("show fu");
    }
}

class Zi2 extends Fu2{
    public void show() {
        System.out.println("show zi");
    }

    public void method() {
        System.out.println("method zi");
    }
}


