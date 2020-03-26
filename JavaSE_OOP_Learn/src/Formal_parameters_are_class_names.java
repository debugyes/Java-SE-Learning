/*
    形式参数的问题：
        基本类型：形式参数的改变不影响实际参数
        引用类型：形式参数的改变直接影响实际参数(类、接口、数组)
* */

//形式参数是基本类型
class Demo {
    public int sum(int a, int b) {
        return a+b;
    }
}

//形式参数是引用类型
class Student2 {            //类是一个类型
    public void show() {
        System.out.println("hhh");
    }
}

class StudentDemo {
    //如果看到了一个方法的形式参数是一个类类型（引用类型），这里其实需要的是该类的对象
    public void method(Student2 s) {//调用的时候，把main方法中的s的地址传递到了这里Student s = new Student();
        s.show();
    }
}
public class Formal_parameters_are_class_names {
    public static void main(String[] args) {
        //形式参数是基本类型的调用
        Demo d = new Demo();
        int result = d.sum(3, 4);
        System.out.println(result);
        System.out.println("------------------");


        //形式参数是引用类型的调用
        //需求：要调用StudentDemo类中的method方法
        StudentDemo sd = new StudentDemo();
        //创建学生对象
        Student2 s = new Student2();
        sd.method(s);//把s的地址给到了这里
    }
}
