/*
    static的特点：（它可以修饰成员变量和方法）
        A：随着类的加载而加载
            回想main方法
        B：优先于对象存在
        C：被类的所有对象共享
            举例：一个班级的学生共用一个班级编号
            其实这个特点也是在告诉我们什么时候使用静态？
                如果某个成员变量是被所有对象共享的，那么它就应该定义为静态的
            举例：饮水机（用静态修饰）
                 水杯（不能用静态修饰）
        D：可以通过类名调用
            其实它本身也可以通过对象名调用。
            推荐使用类名调用。
            静态修饰的内容一般我们称其为：与类相关的类成员。


 */

class Person2 {
    //非静态变量
    int num = 10;

    //静态变量
    static int num2 = 20;
}

public class Static_2 {
    public static void main(String[] args) {
        Person2 s = new Person2();
        System.out.println(s.num);

        //通过类名调用
        System.out.println(Person2.num2);
        //通过对象调用
        System.out.println(s.num2);

    }
}
