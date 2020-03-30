/*
    某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
    在传递过程中需要加密，加密规则如下：
        首先将数据倒叙，然后每位数字都加上5，再用与10取余的数代替该数字，
        最后将第一位和最后一位数字交换，请任意给定一个小于8位数的整数，
        然后，把加密后的结果在控制台打印出来。

    题目要求：
        A:数据是小于8位的整数
            定义一个int类型的数据
            int number = 123456;
        B:加密规则
            a:首先将数据倒叙
                结果654321
            b:然后将每位数字都加上5，再用和除以10的余数代替该数字
                结果109876
            C:最后将第一位和最后一位数字交换
                结果609871
        C:最后将第一位和最后一位数字交换

        如果把这个数据变成数组就行，但不是直接写成数组。

        把数据转成数组：
            A:定义一个数据
                int number = 123456;
            B:定义一个数组
                int[] arr = new int[8];//不可能超过8
                在赋值的时候用一个变量记录索引的变化
                定义一个索引值int index = 0;
            C:
* */
public class Encryption {
    public static void main(String[] args) {
        int num = 123456;
        int[] arr = new int [8];

        //把数据中每一位的数据获取后存储到数组中
        //通过观察，应该是可以通过循环改进的
        int index = 0;

        while (num>0) {
            arr[index] = num%10;
            index++;
            num/=10;
        }
        for (int i = 0; i < index; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }

        int temp = arr[index-1];
        arr[index-1] = arr[0];
        arr[0] = temp;

        //输出数据
        for (int x = 0; x < index; x++) {
            System.out.print(arr[x]);
        }
        System.out.println();
    }
}
