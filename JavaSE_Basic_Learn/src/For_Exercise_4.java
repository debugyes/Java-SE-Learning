/*
    需求：求5的阶乘
    什么是阶乘：
        n! = n * (n-1)!规则
        n! = n*(n-1) * (n-2) * ... *3*2*1
* */
public class For_Exercise_4 {
    public static void main(String[] args) {
        int sum = 1;
        //for (int i = 5; i > 0; i--)
        //改进后
        for (int i = 5; i > 1; i--) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
