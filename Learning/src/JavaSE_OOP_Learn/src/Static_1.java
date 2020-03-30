/*
    定义一个人类
    
    姓名和年龄都是变化的，这个我都能接收，因为每个人的姓名和年龄都是不同的
    但是，我们现在选取的几个人都是中国人，他们的国籍都是一样的。
    一样的国籍，我每次创建对象，在堆内存都要开辟这样空间
    我就觉得有点浪费了。怎么办呢
    
    针对多个对象有共同的这样的成员变量值的时候
    Java就提供了一个关键字来修饰：static
* */
class Person {
    String name;
    //String country;
    int age;
    static String country;

    public Person() {
        
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void show() {
        System.out.println(name + "---" + age + "---" + country);
    }
}

public class Static_1 {
    public static void main(String[] args) {
        Person p1 = new Person("alex", 16, "中国");
        p1.show();

        //Person p2 = new Person("Johnny", 17, "中国");
        Person p2 = new Person("Johnny", 17);
        p2.show();

        //Person p3 = new Person("David", 23, "中国");
        Person p3 = new Person("David", 23);
        p3.show();

        System.out.println("---------------------");
        p3.country = "美国";
        p1.show();
        p2.show();
        p3.show();
    }
}
