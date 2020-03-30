/*
    模拟单项选择题：

    分析：
        A：出一个选择题，然后供你选择。
        B：键盘录入选择的数据。
        C:根据选择来给出你选择的结论
* */
import java.util.Scanner;
public class Switch_Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //由于没有办法键盘录入得到一个A,B这样的东西，我们就用65，66这样的值替代，接着再强制转换为字符类型
        System.out.println("选择的系统");
        System.out.println("65:Linux");
        System.out.println("66:Windows");
        System.out.println("67:OSX");
        System.out.println("68:BSD");
        int choice = sc.nextInt();

        char ch = (char)choice;

        switch (choice) {
            case 'A':
                System.out.println("选择正确");
                break;
            case 'B':
                System.out.println("选择正确");
                break;
            case 'C':
                System.out.println("选择正确");
                break;
            case 'D':
                System.out.println("选择正确");
                break;
            default:
                System.out.println("选项有误");
                break;

        }
    }
}
