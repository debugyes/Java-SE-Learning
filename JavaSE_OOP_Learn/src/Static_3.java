/*
    static关键字注意事项
        A：在静态方法中是没有this关键字的
            因为静态是随着类的加载而加载，this是最着对象的创建而存在。
            静态比对象先存在，所以无法访问(后来的能访问先来的，先来的不能访问后来的，因为还没创建）
        B：静态方法只能访问静态成员变量和静态的成员方法
            静态方法：
                成员变量：只能访问静态成员变量
                成员方法：只能访问静态成员方法
            非静态方法：
                成员变量：可以静态也可以非静态
                成员方法：可以静态也可以非静态
        简单记：静态只能访问静态。非静态能访问一切。
 */
class Teacher {
    public int num = 10;
    public static int num2 = 10;

    public void show() {
        System.out.println(num);//隐含的告诉你访问的是成员变量
        System.out.println(this.num);//明确的告诉你访问的是成员变量
        System.out.println(num2);
    }

    public static void method() {
        //System.out.println(num);
        System.out.println(num2);

        //show();
    }


}

public class Static_3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.show();
        t.method();
    }
}