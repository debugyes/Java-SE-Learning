/*
    比较两个数据是否相等。参数类型分别为
        两个byte类型，两个short类型，两个short类型，两个long类型
    并在main方法中进行测试
* */
public class Method_Overloading_Exercise_1 {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        System.out.println("byte:" + compare(b1, b2));

        short s1 = 5;
        short s2 = 5;
        System.out.println("short:" + compare(s1, s2));

        int i = 1;
        int j = 2;
        System.out.println("int:" + compare(i, j));

        long l1 = 10L;
        long l2 = 20L;
        System.out.println("long:" + compare(l1, l2));
    }

    public static boolean compare(byte num_1, byte num_2) {
        System.out.println("byte:");
        return num_1 == num_2;
    }

    public static boolean compare(short num_1, short num_2) {
        System.out.println("short:");
        return num_1 == num_2;
    }

    public static boolean compare(int num_1, int num_2) {
        System.out.println("int:");
        return num_1 == num_2;
    }

    public static boolean compare(long num_1, long num_2) {
        System.out.println("long:");
        return num_1 == num_2;
    }
}
