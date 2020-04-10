package JavaSE_OOP_Learn.src;

/*
    ClassCatException:类型转换异常
    一般在多态的向下转型中容易出现
 */
public class Polymorphism4 {
    public static void main(String[] args) {
        //内存中是狗
        Animal2 a = new Dog2();
        Dog2 d = (Dog2)a;

        //内存里是猫
        a = new Cat2();
        Cat2 c = (Cat2) a;

        //内存里是猫
        //Dog dd = (Dog) a;

    }
}

class Animal2 {
    public void eat(){}
}

class Dog2 extends Animal2 {
    public void eat(){}

    public void guard(){}
}

class Cat2 extends Animal2 {
    public void eat(){}

    public void playGame(){}
}


