/*
    键盘录入两个数据，比较两个数是否相等

    分析：
        比较两个数是否相等结果是一个boolean类型
* */
import java.util.Scanner;
public class Method_Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int num_1 = sc.nextInt();

        System.out.println("请输入第二个数");
        int num_2 = sc.nextInt();

        boolean result = equal(num_1, num_2);
        System.out.println(result);
    }

    /*
        需求：比较两个数是否相等
        两个明确：
            返回值类型：boolean
            返回值类型：int num_1, int num_2;
    * */

    public static boolean equal(int num_1, int num_2) {
        //return (num_1 == num_2)?true:false;
        return num_1 == num_2;
    }
}
