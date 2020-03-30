/*
    定义一个学生类：
        成员变量：name,age
        成员方法：show()方法

    在这个案例中，发现了一个问题：
        通过对象去给成员变量赋值，可以赋值一些非法的数据。
        这是不合理的。
        应该是这个样子的：在赋值之前，先对数据进行判断。
        判断在哪里做比较合适呢？
        StudentDemo类是一个测试类，测试类一般只创建对象，调用方法，不做其他事情。
        所以这个判断应该定义在Student类中。
        而我们在成员变量的位置可不可以进行数据判断呢？
        是不可以的，因为做数据校验必须要依靠一些逻辑语句。
        逻辑语句是应该定义在方法中的，所以我们最终决定在Student类中提供一个方法
        来对数据进行校验。

    按照我们之前的分析，我们给出了一个方法进行校验。
    但是呢，它偏偏不调用方法来赋值，而是直接复制了
    这样我们的方法就没有起到作用。
    就应该要求必须使用方法不能直接调用成员变量赋值。
    怎么去强制要求不能直接使用成员变量？
        针对这种情况，Java提供了一个关键字private



    private:私有的，可以修饰成员变量和成员方法
        注意：被private修饰的成员只能在本类中访问

    这就是封装的思想。
    封装：是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。

    封装的好处：
        A:隐藏实现细节，提供公共的访问方式。
        B:提高了代码的复用性。
        C:提高安全性。
    封装原则：
        A:把不需要对外提供的内容都隐藏起来。
        B:把属性隐藏，提供公共方法对其访问。
* */
class StudentB{
    //姓名
    String name;
    //年龄
    private int age;

    //写一个方法对数据进行校验
    /*
        返回值类型：void
        参数列表：int a
    * */
    public void assignmentAge(int a){
        if (a < 0 || a > 200) {
            System.out.println("年龄有问题！");
        } else {
            age = a;
        }

    }
    //show()方法，现实所有成员变量值
    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }
}

public class Encapsulate_1 {
    public static void main(String[] args) {
        //创建对象
        StudentB s = new StudentB();
        s.show();
        System.out.println("----------------------------");

        //给成员变量复制
        //s.name = "alex";
        //s.age = 17;
        //s.show();
        //System.out.println("----------------------------");

        //给age复制
        //s.age = -27;//这个数据是不合理的
        //s.show();
        //System.out.println("---------------------------");

        //通过方法给值
        s.assignmentAge(-17);
        s.show();
        System.out.println("---------------------------");
    }
}
