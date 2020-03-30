/*
    需求：打印杨辉三角形（行数可以键盘录入）
    1
    1 1
    1 2 1
    1 3 3  1
    1 4 6  4  1
    1 5 10 10 5 1

    分析：看这种图形的规律
        A:任何一行的第一列和最后一列都是1
        B:从第三行开始，每一个数据是它上一行的前一列和上一行的本列之和。

    步骤：
        A:首先定义一个二维数组。行数如果是n，把列数也先定义为n。
            这个n的数据来自于键盘录入的数据。
        B:给这个二维数组任何一行的第一列和最后一列赋值为1
        C:按照规律A给其他元素赋值
        D:遍历这个数组
* */
import java.util.Scanner;

public class Array_Double_Dimension_Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数据：");
        int n = sc.nextInt();

        //定义二维数组
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
