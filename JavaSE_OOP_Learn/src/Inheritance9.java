/*
    方法重写：子类中出现了和父类方法声明一摸一样的方法。（返回值、方法名、参数列表都一样）


    方法重载:
        本类中出现的方法名一样，参数列表不同的方法，与返回值无关

    子类对象调用方法的时候：
        先找子类本身，再找父类

    方法重写的应用：
        当子类需要父类的功能，而功能主体子类有自己特有的内容时，可以重写父类中的方法。
        这样，即沿袭了父类的功能，又定义了子类特有的内容

    案例：
        A:定义一个手机类
        B:通过研究，发明一个新手机，这个手机的作用后，可以听天气预报。

    但是，我们又发现新手机应该是手机，所以它应该继承自手机
    其实这个时候的设计，并不是最好的。
    因为手机打电话功能，是手机本身就具备的最基本功能
    所以我的新手机是不用再提供这个功能的。
    所以，打电话这个功能就没有了，这个不好
    最终还是加上这个功能，由于它继承了手机类，所以，我们就直接使用父类的功能即可（通过super关键字调用）

 */
public class Inheritance9 {
    public static void main(String[] args){
        NewPhone np = new NewPhone();
        np.call("megumi");
    }
}

class PhoneA{
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
}

class NewPhone extends PhoneA{
    public void call(String name) {
    //  System.out.println("给" + name + "打电话");
        super.call(name);
        System.out.println("可以听天气预报了");
    }
}
