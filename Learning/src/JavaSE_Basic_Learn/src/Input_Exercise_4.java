//录入两个数据，比较这两个数据是否相等

import java.util.Scanner;
public class Input_Exercise_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean flag = (x == y);
        System.out.println(flag);
    }
}
