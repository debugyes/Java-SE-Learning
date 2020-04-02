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
 */
class Fu{
    public void show(){
        System.out.println("show fu");
    }
}

class Zi extends Fu{
    public void show(){
        System.out.println("show zi");
    }
}

public class Polymorphisn1 {
    public static void main(String[] args) {
        //要有父类引用指向子类对象
        //父 f = new 子();
        Fu f = new Zi();
    }
}
