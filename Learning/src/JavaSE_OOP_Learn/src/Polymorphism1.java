package JavaSE_OOP_Learn.src;

/*
    多态：同一个对象(事物),在不同时刻体现出来的不同状态
    从右向左念
    举例：
        猫是猫，猫是动物
        水（液态，固态，气态）

    多态的前提：
        A:要有继承关系
        B:要有方法重写
            其实没有也是可以的，但是如果没有这个就无意义
            动物 d = new 猫();
            d.show();
            动物 d = new 狗();
            d.show();
        C:要有父类引用指向子类对象
            父 f = new 子()；
    多态中的成员访问特点：
        A:成员变量
            编译看左边，运行看左边
        B:构造方法
            创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
        C:成员方法
            编译看左边，运行看右边
        D:静态方法
            编译看左边，运行看左边
            （静态和类相关，算不上重写，所以，访问的还是左边的）

        由于成员方法存在方法重写，所以它运行看右边。

 */
class Fu {
    public int num = 100;

    public void show() {
        System.out.println("show fu");
    }

    public static void function() {
        System.out.println("function fu");
    }
}

class Zi extends Fu{
    public int num2 = 200;
    public int num = 1000;

    public void show(){
        System.out.println("show Zi");
    }

    public void method(){
        System.out.println("method Zi");
    }

    public static void function(){
        System.out.println("function Zi");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        //要有父类引用指向子类对象
        //父 f = new 子();
        Fu f = new Zi();
        System.out.println(f.num);
        //System.out.println(f.num2);

        f.show();
        //f.method();
        f.function();

    }
}