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
 */
public class Inheritance11 {
    public static void main(String[] args){
        //创建学生对象并测试
        //方式1
        StudentK s1 = new StudentK();
        s1.setAge(18);
        s1.setName("megumi");
        System.out.println(s1.getAge() + "----" + s1.getName());

        //方式2
        StudentK s2 = new StudentK("megumi", 18);
        System.out.println(s1.getAge() + "----" + s1.getName());
    }
}

class StudentK{
    private String name;
    private int age;

    public StudentK(){

    }

    public StudentK(String name, int age) {
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

class TeacherK{
    private String name;
    private int age;

    public TeacherK(){

    }

    public TeacherK(String name, int age) {
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


