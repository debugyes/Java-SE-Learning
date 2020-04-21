package JavaSE_OOP_Learn.src;

/*
    猫狗案例
        具体实物：猫，狗
        共性：姓名，年龄，吃饭

    分析：从具体到抽象
        猫：
            成员变量：姓名，年龄，
            构造方法：无参，带参
            成员方法：吃饭（猫吃鱼）
        狗：
            成员变量：姓名，年龄，
            构造方法：无参，带参
            成员方法：吃饭（狗吃肉）

        因为有共性的内容，所以就提取了一个父类。动物
        但是又犹豫吃饭的内容不一样，所以吃饭的方法是抽象的，
        而方法是抽象的类，类就必须定义为抽象类

        抽象类：
            成员变量：姓名，年龄，
            构造方法：无参，带参
            成员方法：吃饭（）

    实现：从抽象到具体
        动物类：
            成员变量：姓名，年龄，
            构造方法：无参，带参
            成员方法：吃饭（）
        狗类：
            继承自动物类
            重写吃饭
        猫类：
            继承自动物类
            重写吃饭

 */

public class AbstractClass3 {
    public static void main(String[] args) {
        //测试狗类
        //方式1:
        DogC d = new DogC();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName() + "---" + d.getAge());
        //测试2:
        DogC d2 = new DogC("旺财", 3);
        System.out.println(d.getName() + "---" + d.getAge());
        d2.eat();
        System.out.println("-----------------------------------");

        AnimalC a = new DogC();
        a.setAge(3);
        a.setName("旺财");
        System.out.println(a.getAge() + "---" + a.getName());
        a.eat();

        AnimalC a2 = new DogC("旺财", 3);
        System.out.println(a2.getAge() + "---" + a2.getName());
        a2.eat();


        //测试猫类

    }
}

abstract class AnimalC {
    private String name;
    private int age;

    public AnimalC() {

    }

    public AnimalC(String name, int age) {
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

    public abstract void eat();
}

//定义具体狗类
class DogC extends AnimalC {
    public DogC() {

    }

    public DogC(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("狗吃肉");
    }
}

//定义猫类
class CatC extends AnimalC {
    public CatC() {

    }

    public CatC(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }
}

