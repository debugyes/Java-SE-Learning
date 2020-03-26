/*
    练习：
        请在控制台输出满足如下条件的五位数
        个位等于万位
        十位等于千位
        个位+十位+千位+万位=百位
    分析：
        A:五位数就告诉了我们范围
        B:分解每个数的各位
        C:按要求进行判断

* */
public class For_Exercise_6 {
    public static void main(String[] args) {
        int num_1, num_2, num_3, num_4, num_5;
        for (int i = 10000; i <= 99999; i++) {
            num_1 = i / 10000;//万位
            num_2 = i / 1000 % 10;//千位
            num_3 = i / 100 % 10;//百位
            num_4 = i / 10 % 10;//十位
            num_5 = i % 10;//个位
            if ((num_1 == num_5) && (num_2 == num_4) && (num_5 + num_4 + num_2 + num_1 == num_3)) {
                System.out.println(i + "符合条件");
            }
        }
    }
}