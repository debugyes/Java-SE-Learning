package JavaSE_OOP_Learn.src;

/*
    多态练习：猫狗案例多态版
 */
public class Polymorphism5 {
    public static void main(String[] args) {
        //定义成猫
        Animal3 a = new Dog3();
        a.eat();
        System.out.println("--------------------");

        //还原成狗
        Dog3 d = (Dog3) a;
        d.eat();
        d.guard();
        System.out.println("--------------------");

        //变成猫
        a = new Cat3();
        a.eat();
        System.out.println("--------------------");

        //还原成猫
        Cat3 c = (Cat3) a;
        c.eat();
        c.playGame();

        //演示错误的内容
        //Dog3 dd = new Animal3();
        //Dog3 ddd = new cat();
        //Dog3 ddd = (Dog3)a;
    }
}

class Animal3 {
    public void eat(){
        System.out.println("吃饭");
    }
}

class Dog3 extends Animal3 {
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void guard(){
        System.out.println("狗看门");
    }
}

class Cat3 extends Animal3 {
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}