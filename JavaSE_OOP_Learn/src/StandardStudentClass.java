/*
    一个标准代码的最终版。
    学生类：
        成员变量：name，age
        构造方法：
            无参，带两个参
        成员方法：
            getXxx()/set()Xxx
            show() 输出该类的所有成员变量

    给成员变量赋值：
        A：serXxx()方法
        B：构造方法

    输出成员变量值的方法
        A：通过getXxx分别获取后拼接
        B：show方法
    一般都是get和set方法，单个数值操作比较灵活。
 */
class StudentG {
    private int age;
    private String name;

    //构造方法
    public StudentG() {

    }

    public StudentG(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //输出所有的成员变量值
    public void show() {
        System.out.println(name + "---" + age);
    }
}
public class StandardStudentClass {
    public static void main(String[] args) {
        //方式1给成员变量赋值
        //无参构造+setXxx()
        StudentG s1 = new StudentG();
        s1.setName("alex");
        s1.setAge(17);

        //方式2给成员变量赋值
        StudentG s2 = new StudentG("alex", 17);
        System.out.println(s2.getName() + "---" + s2.getAge());

        //输出值
        s1.show();
        System.out.println(s1.getName() + "---" + s1.getAge());

    }
}
