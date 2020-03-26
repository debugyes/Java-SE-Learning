/*
    if语句格式2的练习：
        A:获取两个数据中较大的值
        B:判断一个数是基数还是偶数
* */
import java.util.Scanner;

public class Choose_Structure_2_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println("max：" + max);

        System.out.println("----------------------------------");
        //判断一个数据是基数还是偶数，并输出是基数还是偶数
        System.out.println("请输入你要判断的数据：");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是基数");
        }
    }
}
