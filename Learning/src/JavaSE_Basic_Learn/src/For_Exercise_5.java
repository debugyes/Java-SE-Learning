/*
    需求：在控制台输出所有的水仙花数
 * */
public class For_Exercise_5 {
    public static void main(String[] args) {
        int num_1, num_2, num_3;//num_1是百位，num_2是十位，num_3是个位

        for (int i = 100; i <= 999; i++) {
            num_1 = i/100;
            num_2 = (i/10)%10;
            num_3 = i%10;
            if ((num_1 * num_1 * num_1 + num_2 * num_2 * num_2 + num_3 * num_3 * num_3) == i) {
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
