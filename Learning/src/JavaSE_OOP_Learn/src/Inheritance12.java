package JavaSE_OOP_Learn.src;

/*
    老师和学生案例

    学生：
        成员变量：姓名，年龄
        构造方法：无参
        成员方法：getXxx()/setXxx()
    老师：
        成员变量：姓名，年龄
        构造方法：无参
        成员方法：getXxx()/setXxx()

    看上面两个类的成员，发现了很多相同的东西，所以我们就考虑抽取一个共性的类：
    人：
        成员变量：姓名，年龄
        构造方法：无参
        成员方法：getXxx()/setXxx()

    老师继承 人
    学生继承 人
 */
public class Inheritance12 {
    public static void main(String[] args){
        //方式1
        StudentL s = new StudentL();
        s.setAge(18);
        s.setName("megumi");
        System.out.println(s.getAge() + "---" + s.getName());

        //方式2
        StudentL s2 = new StudentL("megumi", 18);
        System.out.println(s2.getAge() + "---" + s2.getName());


        TeacherL t = new TeacherL("alex", 20);
        System.out.println(t.getAge() + "---" + t.getName());
        System.out.println(s2.getAge() + "---" + s2.getName());
    }
}

class PersonA{
    private String name;
    private int age;

    public PersonA(){

    }

    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class StudentL extends PersonA{
    public StudentL(){

    }
    public StudentL(String name, int age){
        super(name, age);
    }
}

class TeacherL extends PersonA{
    public TeacherL(){

    }

    public TeacherL(String name, int age){
        super(name, age);
    }
}