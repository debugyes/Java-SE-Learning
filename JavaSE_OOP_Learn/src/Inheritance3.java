/*
    继承的注意事项：
        A:子类只能继承父类所有非私有的成员(成员方法和成员变量)
        B:其实这也体现了继承的另一个弊端，打破了封装性
        C:子类不能继承父类的构造方法，但可以通过super关键字去访问父类构造方法。
        D:不要为了部分功能而去继承

    什么时候采用继承
        继承其实体现的是一种关系：is a。
        采用假设法

 */
public class Inheritance3 {
    public static void main(String[] args){
        SonA s = new SonA();
        //s.method();
        s.show();
        s.function();
    }
}

class FatherA{
    private int num = 10;
    public int num2 = 100;

    private void method() {
        System.out.println(num);
        System.out.println(num2);
    }

    public void show(){
        System.out.println(num);
        System.out.println(num2);
    }
}

class SonA extends FatherA{
    public void function(){
        //System.out.println(num);
        System.out.println(num2);
    }
}
