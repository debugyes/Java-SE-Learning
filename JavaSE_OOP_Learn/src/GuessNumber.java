/*
    猜数字小游戏（数据在1-100）之间

    分析：
        A:程序产生一个随机数。
        B:键盘录入数据。（你猜的）
        C:你猜的和被猜的进行比较
            a:大了
            b:小了
            c:猜中了
        D:给出猜多次的机会，猜中就结束。
            while()循环，采用break
 */
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;
        //键盘录入
        Scanner sc = new Scanner(System.in);


        while (true)
        {   System.out.println("请输入你要猜的数据：（1-100）");
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("你猜的数据" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数据" + guessNumber + "小了");
            } else {
                System.out.println("恭喜您，猜中了");
                break;
            }
        }

    }
}
