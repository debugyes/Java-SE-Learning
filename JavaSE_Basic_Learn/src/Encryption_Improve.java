/*
    把刚才的代码改进一下
        A:把数据改进为键盘录入
        B:把代码改进为方法实现

    知识点：
        变量
        数据类型
        运算符
        键盘录入
        语句
        方法
        数组
* */
import java.util.Scanner;
public class Encryption_Improve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();

        String result = encryptionImprove(num);
        System.out.println("加密后的结果是" + result);
    }

    /*
        需求：写一个功能，把数据number实现加密。

        两个明确：
            返回值类型：String做一个字符串的拼接
            参数列表：int num
    * */
    public static String encryptionImprove(int num) {
        int index = 0;
        int[] arr = new int[8];

        //把number中的数据想办法放到数组中
        while (num > 0) {
            arr[index] = num%10;
            num /= 10;
            index++;
        }

        //把每个数据加5，然后对10取得余数
        for (int i = 0; i < index; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }

        //把第一位和最后一位交换
        int temp = arr[index - 1];
        arr[index - 1] = arr[0];
        arr[0] = temp;

        //把数组的元素拼成一个字符串返回
        //定义一个空内容的字符串
        String string = "";

        for (int i = 0; i < index; i++) {
            string += arr[i];
        }

        return string;
    }

}
