//键盘录入两个值，求其中的最大值
import java.util.Scanner;
public class Input_Exercise_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数据");
        int y = sc.nextInt();

        System.out.println("最大的值是："+((x>y)?x:y));

    }
}
