/*
    键盘录入三个数据,判断三个数中的最大值
* */
import java.util.Scanner;
public class Method_Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int num_1 = sc.nextInt();

        System.out.println("请输入第二个数");
        int num_2 = sc.nextInt();

        System.out.println("请输入第三个数");
        int num_3 = sc.nextInt();

        int max = max(num_1, num_2, num_3);
        System.out.println("最大值是" + max);
    }

    /*
        需求：返回三个数中的最大值

        两个明确：
            返回值类型：int
            参数列表：int num_1, int num_2, int num_3;
    * */
    public static int max(int num_1, int num_2, int num_3) {
        return ((num_1>num_2)?((num_1>num_3)?num_1:num_3):((num_2>num_3)?num_2:num_3));
    }
}
