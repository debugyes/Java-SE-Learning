package JavaSE_OOP_Learn.src;

public class Polymorphism2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sleep();

        Cat c2 = new Cat();
        c2.eat();
        c2.sleep();

        Cat c3 = new Cat();
        c3.eat();
        c3.sleep();
        System.out.println("----------------------------");

        //调用方法很麻烦，仅仅是对象名不一样，方法都一样
        //准备用方法改进
        //调用猫的功能
        AnimalTool.useCat(c);
        AnimalTool.useCat(c2);
        AnimalTool.useCat(c3);
        System.out.println("----------------------------");

        Dog d = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        //调用狗的功能
        AnimalTool.useDog(d);
        AnimalTool.useDog(d2);
        AnimalTool.useDog(d3);
        System.out.println("----------------------------");

        //宠物猪
        //定义一个宠物类，他要继承animal，提供两个方法，并在该类中添加方法调用
        Pig p = new Pig();
        Pig p2 = new Pig();
        Pig p3 = new Pig();
        AnimalTool.usePig(p);
        AnimalTool.usePig(p2);
        AnimalTool.usePig(p3);
        System.out.println("----------------------------");

        //宠物狼、宠物老虎、宠物豹子
        //定义对应的类，继承自动物，提供对应的方法重写，并添加方法调用




    }



}

class Animal{
    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }
}

class AnimalTool {
    private AnimalTool(){}

    public static void useCat(Cat c) {
        c.eat();
        c.sleep();
    }

    public static void useDog(Dog d) {
        d.eat();
        d.sleep();
    }

    public static void usePig(Pig p){
        p.eat();
        p.sleep();
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void sleep(){
        System.out.println("狗站着睡觉");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void sleep(){
        System.out.println("猫趴着睡觉");
    }
}

class Pig extends Animal{
    public void eat(){
        System.out.println("猪吃白菜");
    }

    public void sleep(){
        System.out.println("猪侧着睡觉");
    }
}



