/*
    final可以修饰类，方法，变量

    特点：
        final修饰类，该类不能被继承
        final修饰方法，该方法不能被重写
        final修饰变量，该变量不能被重写赋值，因为这个变量其实就是常量

    常量：
        A:字面值常量
            "hello" 10 true
        B:自定义常量
            final int x = 10
 */
public class Final2 {

}

class Fu3{
    public int num = 10;
    public final int num2 = 20;
    /*
    public final void show(){

    }
     */

}

class Zi3 extends Fu3{
    public void show(){
        System.out.println(num);
        num = 20;
        System.out.println(num2);
        //num2 = 10;
    }
}