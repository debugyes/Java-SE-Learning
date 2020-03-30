/*
    需求：小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第五天或者5的倍数的话，她都会花去6元钱。
          请问，经过多少天，小芳才可以存到100元钱。

    分析：
        A:小芳的妈妈每天给她2.5元钱
            double dayMoney = 2.5;
        B:她都会存起来
            double daySum = 0;
        C:从第一天开始存储
            int dayCount = 1;
        D:经过多少天，小芳才可以存到100元
            double result = 100;
        E:每当这一天是存钱的第五天或者5的倍数的话，她都会花去6元钱
            要判断dayCount的值，如果对5整除就减去6元钱。
                daySum -=6;
            隐含的一个问题，如果不是5的倍数天的话，钱要累加
                daySum += dayMoney;
        F:因为不知道是多少天，所以用死循环，一旦超过100元就退出循环
* */
public class While_Exercise_5 {
    public static void main(String[] args) {
        /*double  dayMoney = 2.5;
        double  Sum = 0;
        int dayCount = 1;
        int  result = 100;

        while (true) {
            //累加钱
            Sum += 2.5;
            //一旦超过100就退出循环
            if (Sum >= result) {
                System.out.println("共花了" + dayCount + "天存储了100元");
                break;
            }
            if (dayCount % 5 == 0) {
                Sum -= 6;
                System.out.println("第" + dayCount + "天花了6元钱");
            }

            dayCount++;

         */

        int day = 0;
        double  money = 0;
        int target = 100;

        while (money < target) {
            day++;
            money += 2.5;
            if (day % 5 == 0) {
                money-=6;
                System.out.println("第" + day + "天花了6元");
            }
        }
        System.out.println("共花了" + day + "天存储了100元");

        }
}

