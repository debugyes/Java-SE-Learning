/*
    为了让程序的数据更符合开发的数据，我们就加入了键盘录入，让程序更灵活

    如何实现键盘数据的录入：
        A:导包
            import java.util.Scanner;
            位置：在class的上面
        B:创建键盘录入对象
            格式：scanner sc = new Scanner(System.in);
        C:通过对象获取数据
            格式：int x = sc.nextInt();
* */
import java.util.Scanner;

public class Input_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请你输入一个数据：");
        int x = sc.nextInt();
        System.out.println("输入的数据为："+x);
    }
}
