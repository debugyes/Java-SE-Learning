/*
    需求：统计水仙花数共有多少个
    分析：
        A:首先必须知道什么是水仙花数
            所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身
        B:定义统计变量，初始化值是0
        C:三位数告诉我们了范围，用for循环就可以搞定
        D：获取每一个三位数的个，十，百的数据
        E:按照要求进行判断
        F:如果满足要求就计数
* */
public class For_Exercise_7 {
    public static void main(String[] args) {
        int count = 0;

        int num_1, num_2, num_3;
        for (int i = 100; i <= 999; i++) {
            num_1 = i/100;
            num_2 = i/10%10;
            num_3 = i%10;

            if (num_1 * num_1 * num_1 + num_2 * num_2 * num_2 + num_3 * num_3 * num_3 == i) {
                count++;
            }
        }

        System.out.println("一共有" + count + "个水仙花数");
    }

}
