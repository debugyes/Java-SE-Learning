/*
    数组查表法（根据键盘录入索引，查找对应星期）
        意思是：String[] strArray = {"星期一","星期二", ...};
        把strArray看成一张表，获取的是索引，输出的是值。
* */

import java.util.Scanner;

public class Array_Look_Up_1 {
    public static void main(String[] args) {
        String[] strArray = {"星期四", "星期二", "星期三", "星期四", "星期五", "星期六", "星期一天", };
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数据（0-6）：");
        int index = sc.nextInt();

        System.out.println("你要查找到的日期是：" + getString(strArray, index));
    }

    public static String getString(String[] strArray, int index) {
        return strArray[index];
    }
}
