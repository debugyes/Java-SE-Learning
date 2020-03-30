/*
    面试题：final修饰局部变量的问题
    基本类型：基本类型的值不能改变
    引用类型：引用类型的地址值不能发生改变，但是，该对象的堆内存的值是可以改变的
 */
public class final3 {
    public static void main(String[] args){
        //局部变量是基本数据类型
        int x = 10;
        x = 100;
        System.out.println(x);
        final int y = 10;
        //y = 100;
        System.out.println(y);

        System.out.println("------------------");

        //局部变量是基本数据类型
        StudentM s = new StudentM();
        System.out.println(s.age);
        s.age = 100;
        System.out.println(s.age);

        final StudentM s2 = new StudentM();
        System.out.println(s2.age);
        s2.age = 100;
        System.out.println(s2.age);
        //重新分配内存空间，出错
        //s2 = new StudentM();
    }
}

class StudentM{
    int age = 10;

}
