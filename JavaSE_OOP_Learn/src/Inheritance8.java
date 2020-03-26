/*
    继承中成员方法的关系：
        A:子类中的方法和父类中的方法声明不一样
        B:子类中的方法和父类中的方法声明一样
            通过子类调用方法：
                a:先找子类中，看有没有这个方法
                b:再看父类有没有，如果没有就报错
 */

public class Inheritance8 {
    public static void main(String[] args){
        SonF s = new SonF();

        s.method();
        s.show();
    }
}

class FatherF{
    public void show(){
        System.out.println("show Father");
    }
}

class SonF extends FatherF{
    public void show(){
        System.out.println("show Son");
    }

    public void method(){
        System.out.println("method Son");
    }
}