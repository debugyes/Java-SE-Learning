/*
    需求：我要求两个数的和

    我们的需求不断发生改变，我们就对应的提供了多个求和的方法。
    但是名字不一样。
    而我们又要求方法命名做到:见名知意
    解决方法：针对这种情况，方法的功能相同，参数列表不同的情况，为了见名知意，java允许它们起一样的名字

    这种情况叫：方法重载
    方法重载:
        在同一个类中方法名相同，参数列表不同。
        与返回值无关，只看方法和参数列表。

        参数列表不同：
            A：参数个数不同
            B：参数类型不同
* */
public class Method_Overloading_1 {
    public static void main(String[] args) {
        System.out.println(sum(20, 20));
        System.out.println(sum(10.5f, 20f));
        System.out.println(sum(20, 20, 20));
        System.out.println(sum(20, 20, 20, 20));

    }

    //需求1：求两个数的和
    public static int sum(int num_1, int num_2) {
        System.out.println("int");
        return num_1 + num_2;
    }

    //需求2：求三个数的和
    /*
    public static int sum_1(int num_1, int num_2, int num_3) {
        return num_1 + num_2 + num_3;
    }
     */
    public static int sum(int num_1, int num_2, int num_3) {
        return num_1 + num_2 + num_3;
    }

    //需求3：求四个数的和
    /*
    public static int sum_2(int num_1, int num_2, int num_3, int num_4) {
        return num_1 + num_2 + num_3 + num_4;
    }
     */
    public static int sum(int num_1, int num_2, int num_3, int num_4) {
        return num_1 + num_2 + num_3 + num_4;
    }

    public static float sum(float a, float b) {
        System.out.println("float");
        return a + b;
    }
}
