/*
    练习：用while循环实现
    求1-100的和


    while(判断条件语句){
            循环体语句；
        }

        扩展格式：

        初始化语句；
        while(判断条件语句){
            循环体语句；
            控制条件语句；
        }

        通过这个格式，我们就可以看到其实和for循环是差不多的。
        for(初始化语句；判断条件语句；控制条件语句){
            循环体语句；
        }
* */
public class While_Exercise_1 {
    public static void  main(String[] args) {
        //for语句版本
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("用for版本" + sum);

        //while语句版本
        sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("用while版本" + sum);


    }
}
