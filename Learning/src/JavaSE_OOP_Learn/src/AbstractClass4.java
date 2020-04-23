package JavaSE_OOP_Learn.src;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

/*
    老师安利
        具体事物：基础班老师，就业班老师
        共性：姓名，年龄，讲课

    分析：
        基础班老师：
            姓名，年龄，讲课
        就业班老师：
            姓名，年龄，讲课

    实现：
        老师类
            基础班老师
            就业班老师

 */
public class AbstractClass4 {
    public static void main(String[] args) {
        Teacher t = new BasicTeacher();
        t.setName("megumi");
        t.setAge(18);
        System.out.println(t.getAge() + "---" + t.getName());
        t.teach();
        System.out.println("-----------------------------------");

        t = new BasicTeacher("megumi", 18);
        System.out.println(t.getAge() + "---" + t.getName());
        t.teach();



        //就业班老师
        t = new WorkTeacher();
        t.setAge(27);
        t.setName("林青霞");
        System.out.println(t.getAge() + "---" + t.getName());
        t.teach();
        System.out.println("-----------------------------------");

        t = new WorkTeacher("林青霞", 27);
        System.out.println(t.getAge() + "---" + t.getName());
        t.teach();
    }
}

//定义定义抽象的老师类
abstract class Teacher {
    private String name;
    private int age;

    public Teacher() {

    }

    public Teacher(String name, int age) {
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

    public abstract void teach();
}

//基础班老师
class BasicTeacher extends Teacher{
    public BasicTeacher() {

    }

    public BasicTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("基础班老师讲解javaSE");
    }

}

//就业班老师
class WorkTeacher extends Teacher {
    public WorkTeacher() {

    }

    public WorkTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("就业班老师讲解javaSE");
    }

}

