/*
    需求：求出1-10之间数据和
    由此可见我们要定义两个变量：
        一个变量用于存储第一个加数，第一个加数其实保存的是以前所有数据的和。默认初始化值应该是0.
        一个变量用于存储第二个加数，第二个加数其实就是每次的数据变化的值。
* */
public class For_Exercise_2 {
    public static void main(String[] args) {
        System.out.println(1+2+3+4+5+6+7+8+9+10);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
