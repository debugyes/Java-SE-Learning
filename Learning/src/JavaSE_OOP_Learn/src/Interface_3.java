package JavaSE_OOP_Learn.src;

/*
    类与类：
        继承关系:只能单继承，可以多层继承。
    类与接口：
        实现关系：可以单实现，也可以多实现。
        并且还可以在继承一个类的同时实现多个接口
    接口与接口：
        继承关系：可以单继承，也可以多继承。

 */

interface Father1{
    public abstract void show();

}

interface Mother1{
    public abstract void show2();
}

interface Sister extends Father1, Mother1{
    //如果继承Sister的话需要重写Father和Mother中的抽象方法
}

//多实现
//class Son extends Object implements Father1, Mother1
class Son implements Father1, Mother1{
    public void show() {
        System.out.println("show son");
    }
    public void show2() {
        System.out.println("show son");
    }
}


public class Interface_3 {
    public static void main(String[] args) {
        Father1 f = new Son();
        f.show();
        //f.show2();//error
        Mother1 m = new Son();
        //m.show2();//error
    }
}
