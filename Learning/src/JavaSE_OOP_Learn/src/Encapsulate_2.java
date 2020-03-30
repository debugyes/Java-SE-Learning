/*
    private:
        是一个权限修饰符
        可以修饰成员变量和成员方法
        被其修饰的成员只能在本类中被访问
* */
class Demo2 {
    int num = 10;
    
}

public class Encapsulate_2 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        System.out.println(d.num);

    }
}
