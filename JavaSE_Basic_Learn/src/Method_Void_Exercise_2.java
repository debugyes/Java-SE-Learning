/*
    键盘录入一个数据(1<=n<=9),输出对应的nn乘法表
* */
import java.util.Scanner;
public class Method_Void_Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数据(1<=n<=9)：");
        int n = sc.nextInt();
        graphic(n);
    }

    /*
        需求：输出对应的nn乘法表
        两个明确：
            返回值类型：void
            参数列表：int n
    * */
    public static void graphic(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + j * i + '\t');
            }
            System.out.println();
        }
    }
}
