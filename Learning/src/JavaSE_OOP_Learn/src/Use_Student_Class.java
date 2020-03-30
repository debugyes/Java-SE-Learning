/*
    在一个java文件中写两个类，一个基本的类 ，一个测试类
    注意：文件名和测试类名一致

    如何使用：
        创建对象使用。

    如何创建对象
        格式：类名 对象名 = new 类名();

    如何使用成员变量：
        对象名.变量名
    如何使用成员方法：
        对象名.方法名(...)
* */

//学生类
class student {
    String name;//null
    int age;//0
    String address;//null

    public void study() {
        System.out.println("学习");
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

//学生测试类
public class Use_Student_Class {
    public static void main(String[] args) {
        student alex = new student();

        //输出成员变量值
        System.out.println(alex.name);
        System.out.println(alex.address);
        System.out.println(alex.age);

        //改进写法
        System.out.println(alex.name + "----" + alex.age + "----" + alex.address);

        //给成员变量赋值
        alex.name = "alex iota";
        alex.age = 27;
        alex.address = "Nanjing";
        //赋值后的输出
        System.out.println(alex.name + "----" + alex.age + "----" + alex.address);

        alex.study();
        alex.eat();
        alex.eat();

    }
}
