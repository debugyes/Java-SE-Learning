package JavaSE_OOP_Learn.src;

/*
    抽象类的概述：
        动物不应该定义为具体的东西，而且动物中的吃，睡等也不应该是具体的
        我们把一个不是具体的功能成为抽象的功能，而一个类中如果有抽象的功能，该类必须是抽象类

   抽象类的特点：
        A:抽象类和抽象方法必须使用abstract关键字修饰
        B:抽象类中不一定有抽象方法，但是有抽象方法的类必须必须定义为抽象类
        C:抽象类不能实例化
            因为它不是具体的
            抽象类有构造方法，构造方法用于子类访问父类数据的初始化
        D:抽象类的子类
            a:如果不想重写抽象方法，该子类是一个抽象类
            b:重写抽象方法，该子类是一个具体的类

 */
public class AbstractClass {
    public static void main(String[] args) {
        //创建对象
        //AnimalA是抽象的，无法实例化
        //AnimalA a = new AnimalA();

        AnimalA a = new CatA();
        a.eat();
    }
}

abstract class AnimalA {
    //public abstract void eat(){}//空方法体,这个会报错，抽象方法不能有主体
    public abstract void eat();
}

abstract class DogA extends AnimalA {

}

class CatA extends AnimalA {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
