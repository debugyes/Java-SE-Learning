/*
    我们一直在使用构造方法，但是，我们却没有定义构造方法，用的是哪里来的呢？

    构造方法的注意事项：
        A：如果我们没有给出构造方法，系统将自动提供一个无参构造方法。
        B：如果我们给出了构造方法，系统将不再提供默认的无参构造方法。
            注意：如果这个时候还要使用无参构造方法，就必须自己给出，建议永远自己给出无参构造方法。

    给成员变量赋值有两种方式：
        A：setXxx();
        B：构造方法
 */
class StudentE {
    private String name;
    private int age;

    public StudentE() {
        System.out.println("这是无参构造方法");
        //不传参的构造方法给成员变量赋默认值。
    }

    //构造方法的重载格式
    public StudentE(String name) {
        System.out.println("这是一个带String类型的构造方法");
        this.name = name;
    }

    public StudentE(int age) {
        this.age = age;
    }

    public StudentE(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "----" + age);//null----0
    }
}
public class Construction_2 {
    public static void main(String[] args) {
        //创建对象
        StudentE s = new StudentE();
        s.show();


        //创建对象2
        StudentE s2 = new StudentE("alex");
        s2.show();

        StudentE s3 = new StudentE(13);
        s3.show();

        StudentE s4 = new StudentE("alex", 27);
        s4.show();
    }
}
