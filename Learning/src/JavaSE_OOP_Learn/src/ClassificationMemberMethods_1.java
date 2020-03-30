/*
    类的组成：成员变量，成员方法
    今天我们又加入了一个新的成员：构造方法。
    以后再提类的组成：
        成员变量
        构造方法
        成员方法
            根据返回值类型：
                void类型
                非void类型
            形式参数：
                空参方法
                非空参方法
 */
class StudentF {
    //无返回值无参数
    public void show() {
        System.out.println("show");
    }
    //无返回值有参
    public void method(String name) {
        System.out.println(name);
    }
    //有返回值无参
    public String getString() {
        return "helloworld";
    }
    //有返回值有参
    public String function(String s1, String s2) {
        return s1+s2;
    }
}
public class ClassificationMemberMethods_1 {
    public static void main(String[] args) {
        StudentF s = new StudentF();

        //调用无参无返回方法
        s.show();
        //调用无参有返回值方法
        String result = s.getString();
        System.out.println(result);

        //调用带参无返回值的方法
        s.method("alex");

        //调用带参带返回值的方法
        String result2 = s.function("hello", "World");
        System.out.println(result2);

    }
}
