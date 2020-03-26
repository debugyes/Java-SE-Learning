import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
    while循环和for循环的区别

    使用区别：如果想在循环结束后，继续使用控制条件的那个变量，用while循环，否则用for循环。不知道用for循环
             因为变量及早的从内存中消失，可以提高内存的使用效率

         还有一种条件的理解：
            如果是一个范围的，用for循环非常明确
            如果是不明确要做多少次，用while循环较为合适

* */
public class While_Exercise_3 {
    public static void main(String[] args) {
        //for循环实现
        for (int i = 0; i < 10; i++) {
            System.out.println("hhhhh");
        }
        //System.out.println(i);
        //这里不能再继续访问i变量

        int j = 0;
        while (j < 10) {
            System.out.println("hhhhh");
            j++;
        }
        //这里是可以继续访问变量j的
        System.out.println(j);
    }
}
