/*
    如果父类没有无参构造方法，那么子类的构造方法会出现什么现象呢？如何解决呢？

    A:在父类中加一个无参构造方法
    B:通过使用super关键字去显示的调用父类的带参构造方法
    C:子类通过this去调用本类的无参构造
        子类中一定要有一个去访问了父类的构造方法，否则父类数据就没有初始划。


    注意事项：
        this(...)或者super(...)必须出现在第一条语句的位置
        如果不是放在第一条语句上，就可能对父类的数据进行多次初始化
*/
public class Inheritance7 {
    public static void main(String[] args){

    }
}

class FatherE{
    /*
    public FatherE(){
        System.out.println("Father的无参构造方法");
    }

     */
    public FatherE(String name){
        System.out.println("Father的带参构造方法");
    }
}

class SonE extends FatherE{
    public SonE(){
        super("Megumi");
        System.out.println("Son的无参构造方法");
    }

    public SonE(String name){
        //super("Megumi");
        this();
        System.out.println("Son的带参构造方法");
    }
}
