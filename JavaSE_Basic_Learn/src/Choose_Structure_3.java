/*
    if语句的格式3：
        if(比较表达式1){
            语句体1；
        }else if(比较表达式2){
            语句体2；
        }else{
            语句体n+1；
        }

    执行流程：
        首先计算比较表达式1，看其返回值是true还是false；
        如果是true，就执行语句体1，if语句结束。
        如果是false，接着计算比较表达式2，看其返回值是true还是false，

        如果是true，就执行语句2，if语句结束。
        如果是false，接着计算比较表达式3，看其返回值式true还是false

        如果都是false，就执行语句体n+1
* */
import java.util.Scanner;

public class Choose_Structure_3 {
    public static void main(String[] args) {
        //键盘录入一个成绩，判断并输出成绩单的等级
        /*
            90-100  优秀
            80-90   好
            70-80   良
            60-70   及格
            0-60    不及格
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入宁的成绩：");
        int score = sc.nextInt();
        if (score <= 100 && score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 60 && score >= 70) {
            System.out.println("良");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("宁输入的成绩有误！");

        }

        //这样写已经满足了基本需求，但是可能别人在使用的时候，不会按照你要求的数据给出了。
        //在做一个程序的基本测试时候，一定要考虑这样的及格问题：
        //正确数据，错误数据，边界数据。
        //刚才写的程序并没有处理错误数据，所以不是很好
    }
}
