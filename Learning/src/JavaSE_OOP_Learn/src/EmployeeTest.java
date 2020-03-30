/*
    需求：定义一个员工类，自己分析出几个成员，
    然后给出成员变量，构造方法，get/set方法，
    以及一个现实所有成员信息的方法，并测试。
 */
class Empolyee {
    private String name;
    private int age;
    private String sex;
    private String number;
    Empolyee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getNumber() {
        return number;
    }
    public void show() {
        System.out.println(number + "---" + name + "---" + age + "---" + sex);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Empolyee Johnny = new Empolyee();

        Johnny.setNumber("170001");
        Johnny.setName("Johnny");
        Johnny.setAge(17);
        Johnny.setSex("male");

        Johnny.show();
    }
}
