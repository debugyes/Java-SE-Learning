package JavaSE_OOP_Learn.src;

/*
    接口成员特点
        成员变量：只能是常量，并且是静态的。
                    默认修饰符：public static final
        构造方法：没有构造方法
        成员方法：只能是抽象方法
                默认修饰符public abstract
                建议手动给出

    所有的类默认继承自一个类：Object
    Object类是类层次结构的根类。每个类都使用Object作为超类


 */
interface Inter {
    public int num = 10;
    public final int num2 = 20;
    //默认格式
    public static final int num3 = 30;

    /*
    无构造方法
    public Inter() {

    }
     */

    //接口方法不能带主体
    /*
    public void show() {

    }
     */

    //public abstract void show();//默认public
    public void show();//默认抽象
}

//接口名+impl这种格式是接口的实现格式
//以下两种写法等价
class InterImpl extends Object implements Inter {
    //这个类默认的super不是访问接口的构造，而是Object类的无参构造

    public void show() {//必须带上public

    }
}
/*
class InterImpl  implements Inter {

}
 */


public class Interface_2 {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
        //i.num = 100;//error
        //i.num2 = 200;//error
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
    }
}


