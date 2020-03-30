/*
    统计水仙花数有多少个
* */

public class While_Exercise_2 {
    public static void main(String[] args) {
        int count = 0;
        int num_1, num_2, num_3;//num_1代表百位，num_2代表十位， num_1代表个位
        for (int i = 100; i <= 999; i++) {
            num_1 = i / 100;
            num_2 = i / 10 % 10;
            num_3 = i % 10;

            if (num_1 * num_1 * num_1 + num_2 * num_2 * num_2 + num_3 * num_3 * num_3 == i) {
                count++;
            }
        }

        System.out.println("for实现水仙花数" + count);

        count = 0;
        int i = 100;
        while (i <= 999) {
            num_1 = i / 100;
            num_2 = i / 10 % 10;
            num_3 = i % 10;
            if (num_1 * num_1 * num_1 + num_2 * num_2 * num_2 + num_3 * num_3 * num_3 == i) {
                count++;
            }
            i++;
        }
        System.out.println("while实现水仙花数" + count);
    }
}
