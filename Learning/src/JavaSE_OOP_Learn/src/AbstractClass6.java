package JavaSE_OOP_Learn.src;

/*
    假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性:姓名、工号以及工资。
    经理也是员工除了含有员工的属性外，另外还有一个奖金属性
    请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访间。

    分析：
        普通员工类
            成员变量：姓名、工号、工资
            成员方法：工作
        员工类
            成员变量：姓名、工号、工资
        经理类
            成员变量：姓名、工号、工资、奖金


    实现：
        员工类：
        普通员工类：
        经理类：



 */
public class AbstractClass6 {
    public static void main(String[] args) {
        Employee emp = new Programmer();
        emp.setSalary(18000);
        emp.setName("林青霞");
        emp.setId(001);
        System.out.println(emp.getId() + "---" + emp.getSalary() + "---" + emp.getName());
        emp.work();
        System.out.println("--------------");

        emp = new Programmer("林青霞", 001, 18000);
        System.out.println(emp.getId() + "---" + emp.getSalary() + "---" + emp.getName());
        emp.work();
        System.out.println("--------------");

        /*
        这种方式不合适，父类中没有setMoney这种方法
        emp = new Manager();
        emp.setSalary(8000);
        emp.setId(0002);
        emp.setName("alex");
        emp.setBonus(2000);
         */

        //由于子类有特有的内容，所以我们用子类来测试
        Manager m = new Manager();
        m.setSalary(8000);
        m.setId(0002);
        m.setName("alex");
        m.setBonus(2000);
        System.out.println(m.getId() + "---" + m.getSalary() + "---" + m.getName() + "---" + m.getBonus());
        m.work();
        System.out.println("-------------------------");

        //通过构造方法赋值
        m = new Manager("alex", 002, 8000, 2000);
        System.out.println(m.getId() + "---" + m.getSalary() + "---" + m.getName() + "---" + m.getBonus());
    }
}

//定义员工类
abstract class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee() {

    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id  = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void work();
}

//普通员工类
class Programmer extends Employee {
    public Programmer() {

    }

    public Programmer(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void work() {
        System.out.println("按需求写代码");
    }
}

//经理类
class Manager extends Employee {
    private int bonus;

    public Manager() {

    }

    public Manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("和客户谈需求");
    }
}
