//录入三个数据，求三个数据中的最大值
    import java.util.Scanner;
public class Input_Exercise_3 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int y = sc.nextInt();
        System.out.println("请输入第三个数据：");
        int z = sc.nextInt();

        System.out.println("三个数据中最大值为："+((x>y)?((x>z)?x:z):(y>z)?y:z));

    }
}
