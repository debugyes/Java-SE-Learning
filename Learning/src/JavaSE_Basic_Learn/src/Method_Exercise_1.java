/*
    键盘录入两个数据，返回两个数中的最大值
* */
import java.util.Scanner;
public class Method_Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int num_1 = sc.nextInt();

        System.out.println("请输入第二个数");
        int num_2 = sc.nextInt();

        int result = max(num_1, num_2);
        System.out.println("最大值为" + result);
    }

    /*
        需求：两个数中的较大值
        两个明确：
            返回值类型：int
            参数列表：int a, int b
    * */
    public static int max(int num_1, int num_2) {
        //if语句实现
        /*
        if (num_1 > num_2) {
            return num_1;
        } else {
            return num_2;
        }
        */

        //用三元改进
        return ((num_1 > num_2) ? num_1 : num_2);

    }
}
