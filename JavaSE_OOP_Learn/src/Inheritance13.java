/*
    è����������

    ���ҵ���������Ȼ���־���������й��ԣ�����ȡ��һ������

    è��
        ��Ա���������������䣬��ɫ
        ���췽�����޲Σ�����
        ��Ա������
            getXxx()/setXxx
            eat()
            playGames()
    ����
        ��Ա���������������䣬��ɫ
        ���췽�����޲Σ�����
        ��Ա������
            getXxx()/setXxx
            eat()
            guard()


    ���ԣ�
        ��Ա���������������䣬��ɫ
        ���췽�����޲Σ�����
        ��Ա������
            getXxx()/setXxx
            eat()

    �ѹ��Զ��嵽һ�����У����������ֽУ�����
    �����ࣺ
        ��Ա���������������䣬��ɫ
        ���췽�����޲Σ�����
        ��Ա������
            getXxx()/setXxx
            eat()
    è��
        ���췽�����޲Σ�����
        ��Ա������playGame()
    ����
        ���췽�����޲Σ�����
        ��Ա������guard()

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

        Cat c2 = new Cat(27, "����", "��");
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
        System.out.println("�Է�");
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
