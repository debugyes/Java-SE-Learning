import java.util.Scanner;

public class Input_Exercise_1 {
    public static void main(String[] args){
        //键盘录入两个数据，并对这两个数据求和，输出其结果
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        int x = sc.nextInt();

        System.out.println("请输入第二个数据：");
        int y = sc.nextInt();

        int sum = (x+y);
        System.out.println("sum:"+sum);
    }
}
