/*
    及那盘录入行数和列数，输出对应的星形
* */
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
public class Method_Void_Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int line = sc.nextInt();
        System.out.println("请输入列数");
        int col = sc.nextInt();

        graphic(line, col);
    }

    /*
        输出星形

        两个明确：
            返回值类型：void
            参数列表：int line, int col
    * */

    public static void graphic(int line, int col) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
