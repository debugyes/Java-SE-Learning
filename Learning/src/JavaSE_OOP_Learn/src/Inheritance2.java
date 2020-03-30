/*
    Java中继承的特点：
        A:Java中只支持单继承，不支持多继承
            有些语言是支持多继承的，格式：extends 类1，类2，...
        B:Java支持多层继承

 */
public class Inheritance2 {
    public static void main(String[] args) {
        Son s = new Son();

        s.method();//使用父亲的
        s.show();//使用爷爷的
    }
}

class GrandFather{
    public void show() {
        System.out.println("我是爷爷");
    }
}

class Father extends GrandFather{
    public void method() {
        System.out.println("我是爸爸");
    }
}

class Son extends Father{

}
