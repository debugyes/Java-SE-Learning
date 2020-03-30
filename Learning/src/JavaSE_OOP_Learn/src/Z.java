import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
    看程序写结果：
        A:成员变量的问题
            int x = 10;//成员变量是基本类型
            Student s =new Student();//成员变量是个引用类型

        B:一个类的初始化过程
            成员变量的初始化
                默认初始化
                显示初始化
                构造方法初始化
        C:子父类的初始化（分层初始化）
            先进行父类初始化，然后进行子类初始化。

    执行顺序：
    1.执行Z();,发现Z继承x（其实是因为构造方法第一行默认是super()）
    2.先初始化x，
        初始化Y b = new Y()；
        去调用Y的构造方法
        输出Y
    3.调用X()构造方法，输出X
    4.X初始化结束，回到Z类
    5.执行Y y = new Y(); ，去调用Y（）构造方法，输出Y
    6.调用Z()构造方法，输出Z

    在执行构造方法中除super()以外的第一条语句之前，要进行成员变量的初始化（如果有成员变量的话）

    结果：YXYZ

    问题：
        子类中构造方法默认有一个super()
        而是按照分层初始化进行的
        它表示要先初始化父类数据，再初始化子类数据

 */

class X{
    Y b = new Y();

    X(){
        System.out.println("X");
    }
}

class Y{
    Y(){
        System.out.println("Y");
    }
}

public class Z extends X{
    Y y = new Y();
    Z(){
        super();
        System.out.println("Z");
    }

    public static void main(String[] args){
        new Z();
    }
}

