package JavaSE_OOP_Learn.src;

/*
    学生案例：
    具体事务：基础班学院，就业班学员
    共性：姓名，年龄，班级，学习，吃饭

    分析：
        基础班学院
            成员变量：姓名，年龄，班级
            成员方法：学习，吃饭
        就业班学员
            成员变量：姓名，年龄，班级
            成员方法：学习，吃饭

        学员类
            成员变量：姓名，年龄，班级
            成员方法：学习，吃饭

    实现：
        学员类：
            基础班学院
            就业班学员
 */
public class AbstractClass5 {
    public static void main(String[] args) {
        Student s = new BasicStudent();
        s.setAge(18);
        s.setName("megumi");
        s.setGrade(3);
        System.out.println(s.getName() + "---" + s.getGrade() + "---" + s.getAge());
        s.study();
        s.eat();
        System.out.println("-------------------------------");

        s = new WorkStudent("alex", 18, 3);
        System.out.println(s.getName() + "---" + s.getGrade() + "---" + s.getAge());
        s.study();
        s.eat();
    }
}

abstract class Student {
    private String name;
    private int age;
    private int grade;

    public Student() {

    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    abstract void study();

    public void eat() {
        System.out.println("学习累了要吃饭");
    }
}

class BasicStudent extends Student {
    public BasicStudent() {

    }

    public BasicStudent(String name, int age, int grade) {
        super(name, age, grade);
    }

    public void study() {
        System.out.println("基础班学员学习的是JavaSE");
    }
}

class WorkStudent extends Student {
    public WorkStudent() {

    }

    public WorkStudent(String name, int age, int grade) {
        super(name, age, grade);
    }

    public void study() {
        System.out.println("就业班学员学习的是JavaSE");
    }
}


