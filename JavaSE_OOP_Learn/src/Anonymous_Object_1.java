/*
    匿名对象：就是没有名字的对象

    匿名对象的应用场景：
        A:调用方法， 仅仅只调用一次的时候
            注意：调用多次的时候，不适合。
            匿名调用的好处：
                匿名对象调用完就是垃圾，可以被垃圾回收器回收
        B:匿名对象可以作为实参传递
* */
class StudentA {
    public void show() {
        System.out.println("hhhhh");
    }
}

class StudentDemoA {
    public void method(StudentA s) {
        s.show();
    }
}

public class Anonymous_Object_1 {
    public static void main(String[] args) {
        //带名字的调用
        StudentA s = new StudentA();
        s.show();//这两次调用show是同一个对象调用两次show方法
        s.show();
        System.out.println("------------------------------------");

        //匿名对象
        //new StudentA();
        //匿名对象调用方法
        new StudentA().show();//这是两个对象分别各调用一次show方法
        new StudentA().show();//这里是重新创建一个新的对象
        System.out.println("-------------------------------------");

        //匿名对象作为实际参数传递
        StudentDemoA sd = new StudentDemoA();
        //StudentA ss = new StudentA();
        //sd.method(ss);//这里的s是一个实际参数
        //匿名对象
        sd.method(new StudentA());
        new StudentDemoA().method(new StudentA());


    }
}
