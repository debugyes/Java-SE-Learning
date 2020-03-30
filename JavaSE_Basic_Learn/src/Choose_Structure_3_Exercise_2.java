/*
    键盘录入月份的值，输出对应的季节
    春3 4 5
    夏6 7 8
    秋9 10 11
    冬12 1 2

    分析：
        A:键盘录入月份的值，所以我们要用Scanner
        B:我们因该判断这个月份在哪个季节，而这个判断情况较多，所以用if语句格式3

    if语句的使用场景：
        A:针对表达式是一个Boolean类型的判断
        B:针对一个范围的判断
 */
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
public class Choose_Structure_3_Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("不存在这个月份");
        } else if (month <= 8 && month >= 6) {
            System.out.println("这是夏季");
        } else if (month <= 11 && month >= 9) {
            System.out.println("这是秋季");
        } else if (month <= 5 && month >= 3) {
            System.out.println("这是春季");
        } else {
            System.out.println("这是冬季");
        }

        //解法2
        System.out.println("请输入月份");
        int month_2 = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("不存在这个月");
        } else if (month_2 == 3 || month_2 == 4 || month_2 == 5) {
            System.out.println("春季");
        } else if (month_2 == 6 || month_2 == 7 || month_2 == 8) {
            System.out.println("春季");
        } else if (month_2 == 9 || month_2 == 10 || month_2 == 11) {
            System.out.println("春季");
        } else {
            System.out.println("冬季");
        }

        /*
            如果要求输入一个月份，判断是上半年还是下半年。
            这个时候，我们的判断条件链接的就是6个boolean表达式
            我们还可能有更多的连接，所以用上面第一种方法可以改进
         */

    }
}
