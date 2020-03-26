/*
    根据键盘录入的字符串，判断是否满足要求的，如果有就输出。
    否则，提示有误。

    String s = sc.nextLine();
* */
import java.util.Scanner;
public class Switch_Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入要判断的字符串");
        String s = sc.nextLine();

        switch (s) {
            case "hello":
                System.out.println("输入的是：hello");
                break;
            case "world":
                System.out.println("输入的是：world");
                break;
            case "Java":
                System.out.println("输入的是：Java");
                break;
            default:
                System.out.println("没有对应数据");
                break;
        }
    }
}
