package JavaSE_OOP_Learn.src;
/*
    不同地方饮食文化不同的案例
 */
public class Polymorphism6 {
    public static void main(String[] args) {
        Person p = new SouthPerson();
        p.eat();

        SouthPerson sp = (SouthPerson) p;
        sp.eat();
        sp.sell();

        p = new NorthPerson();
        p.eat();
        NorthPerson np = (NorthPerson) p;
        np.eat();
        np.research();
    }
}

class Person {
    public void eat() {
        System.out.println("吃饭");
    }
}

class SouthPerson extends Person {
    public void eat() {
        System.out.println("炒菜，吃米饭");
    }

    public void sell() {
        System.out.println("经商");
    }
}

class NorthPerson extends Person {
    public void eat() {
        System.out.println("炖菜，吃馒头");
    }

    public void research() {
        System.out.println("研究");
    }
}
