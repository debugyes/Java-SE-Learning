/*
    需求：在控制台输出如下的形状
        *****
        *****
        *****
        *****

    void类型返回值的方法调用：
        单独调用:没问题
        输出调用:不可以
        赋值调用:不可以
* */
public class Method_Void_1 {
    public static void main(String[] args) {
        //for循环嵌套输出图形
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        //需求：要在控制台输出一个6行7列的星形图形
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        //如果需求继续改变，我们就应该考虑使用方法改进
        //单独调用
        graphic(3, 4);
        //输出调用
        //System.out.println(graphic(3, 4));
        //赋值调用
        //void v = graphic(3, 4);
    }

    /*
        写一个什么样子的方法呢？写一个m行n列的代码

        两个明确：
            返回值类型：这时候没有明确的返回值，不写东西也不行，所以这里是void
            参数：int line, int col;


    * */
    public static void graphic(int line, int col) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
