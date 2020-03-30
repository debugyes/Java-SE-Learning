/*
    猫狗案例讲解

    先找到具体的事物，然后发现具体的事物有共性，才提取出一个父类

    猫：
        成员变量：姓名，年龄，颜色
        构造方法：无参，带参
        成员方法：
            getXxx()/setXxx
            eat()
            playGames()
    狗：
        成员变量：姓名，年龄，颜色
        构造方法：无参，带参
        成员方法：
            getXxx()/setXxx
            eat()
            guard()


    共性：
        成员变量：姓名，年龄，颜色
        构造方法：无参，带参
        成员方法：
            getXxx()/setXxx
            eat()

    把共性定义到一个类中，这个类的名字叫：动物
    动物类：
        成员变量：姓名，年龄，颜色
        构造方法：无参，带参
        成员方法：
            getXxx()/setXxx
            eat()
    猫：
        构造方法：无参，带参
        成员方法：playGame()
    狗：
        构造方法：无参，带参
        成员方法：guard()

 */
public class Inheritance13 {
    public static void main(String[] args){
        Cat c1 = new Cat();
        c1.setName("Tom");
        c1.setColor("gray");
        c1.setAge(3);
        System.out.println(c1.getAge() + "---" + c1.getColor() + "---" + c1.getName());
        c1.eat();
        c1.playGame();
        System.out.println("---------------");

        Cat c2 = new Cat(27, "杰瑞", "金");
        System.out.println(c2.getAge() + "---" + c2.getColor() + "---" + c2.getName());
        c2.eat();
        c2.playGame();
    }
}

class Animal{
    private int age;
    private String name;
    private String color;

    public Animal(){

    }

    public Animal(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}

class Cat extends Animal{
    public Cat(){}

    public Cat(int age, String name, String color){
        super(age, name, color);
    }

    public void playGame(){
        System.out.println("paly ball");
    }
}

class Dog extends Animal{
    public Dog(){

    }

    public Dog(int age, String name, String color){
        super(age, name, color);
    }

    public void guard(){
        System.out.println("gurad");
    }
}
