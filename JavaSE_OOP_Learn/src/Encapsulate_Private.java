/*
    封装和private的应用：
        A:把成员变量用private修饰
        B:提高对应的getXxx()和setXxx()方法
* */
class StudentPrivate {
    //姓名
    private String name;
    //年龄
    private int age;

    //姓名赋值
    public void setName(String n) {
        name = n;
    }
    //年龄赋值
    public void setAge(int a) {
        age = a;
    }

    //姓名获取值
    public String getName() {
        return name;
    }

    //年龄获取值
    public int getAge() {
        return age;
    }
}

public class Encapsulate_Private {
    public static void main(String[] args) {
        StudentPrivate s = new StudentPrivate();

        //使用成员变量
        //System.out.println(s.name + "-----------" + s.age);
        //错误：被private修饰后，外界不能访问
        System.out.println(s.getAge() + "-------------" + s.getAge());

        //通过方法赋值
        s.setAge(27);
        s.setName("alex");
    }
}
