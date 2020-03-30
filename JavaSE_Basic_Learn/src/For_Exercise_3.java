/*
    需求：
        求1-100之和
        求1-100之间偶数和
        求1-100之间奇数和
* */
public class For_Exercise_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            //if (i % 2 == 0) {
            sum += i;
            //}
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
