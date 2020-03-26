/*
    需求：请在控制台输出数据1-10
* */
public class For_Exercise_1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        System.out.println("---------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
        //重复定义两个i不报错，因为定义的变量在所属的大括号内有效

    }
}
