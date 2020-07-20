package JavaSE_OOP_Learn.src;

/*
    接口的特点：
        A：接口用关键字interface表示(无class)
            格式：interface 接口名{}
        B：类实现接口用implements表示
            class 类名 implements 接口名{}
        C：接口不能实例化
            那么，接口如何实例化呢
            按照多态的方式来实例化。
        D：接口的子类
            a:可以是抽象类。但是意义不大
            b:可以是具体类。但要重写接口中的所有抽象方法。（推荐）



   由此可见：
        A：具体类多态（几乎没有）
        B：抽象类多态（常用）
        C：接口多态（最常用）
 */

//定义动物培训接口
interface AnimalTraining{
    public abstract void jump();
}

//抽象类实现接口
abstract class Dog1 implements AnimalTraining{

}

class Cat1 implements AnimalTraining{
    public void jump(){

    }
}

//具体实现接口
public class Interface_1 {
    public static void main(String[] args) {
        AnimalTraining at = new Cat1();
        at.jump();
    }
}
