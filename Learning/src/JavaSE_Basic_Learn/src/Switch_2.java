/*
    switch语句的注意事项
        A:case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的
        B:default可以省略但是不建议，因为它的作用是对不正确的情况给出提示。
            特殊情况：
                case就可以把值固定。
        C:case的break一般不省略除非有特殊要求，不省略就会引发case穿透，最后一条case或者default的break可以省略。
        D:default可以在任意位置，但建议在最后。
        E:switch语句结束的条件
            a:遇到break就结束了
            b:执行到末尾就结束了
* */
import java.util.Scanner;
public class Switch_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据（1-7）");
        int week = sc.nextInt();

        //switch判断语句
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的数据有误！");
                break;
        }
    }
}
