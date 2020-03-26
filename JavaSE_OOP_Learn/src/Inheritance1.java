/*
    继承概述：
        把多个类中相同的部分给提取出来定义到一个类中。

    如何实现继承呢？
        java提供了关键字：extends

    格式：
        class 子类名 extends 父类{}

    好处：
        A：提高了代码的复用性
        B: 提高了代码的维护性
        C: 让类与类产生的关系，是多态的前提

    类与类产生了关系，其实也是继承的一个弊端
        类的耦合性增强了。

    开发的原则：低耦合，高内聚
    耦合：类与类的关系
    内聚：就是自己完成某件事的能力
 */
public class Inheritance1 {
    public static void main(String[] args) {
        StudentI s = new StudentI();
        s.eat();
        s.sleep();

        TeacherI t = new TeacherI();
        t.eat();
        t.sleep();
    }
}

//使用继承前
/*
class StudentI{
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class TeacherI{
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
 */

//使用继承后
class PersonI{
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class StudentI extends PersonI{

}

class TeacherI extends PersonI{

}