/*
    do...while循环的基本格式：
        do{
            循环体语句；
        }while(判断条件语句)；


        拓展格式：
        初始化语句;
        do{
            循环体语句；
            控制条件语句；
        }while(判断条件语句);

        while后面有一个分号
* */
public class Do_While_1 {
    public static void main(String[] args) {
        //输出10次Hello World
        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        } while (i < 10);

        System.out.println("-----------------------------");
        //求和1-100
        int sum = 0;
        int j = 0;
        do {
            sum += j;
            j++;
        } while (j <= 100);
        System.out.println(sum);
    }
}
