/*
    思考题：看程序写结果，然后分析为什么是这个样子的并画图讲解。最后总结java中参数传递规律。
    Java中的类型传递问题：
        基本类型：形参的改变对实参没有影响
        引用类型：形参的改变直接影响实际参数
* */
public class Args_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b);//a:10,b:20
        change(a, b);
        System.out.println("a:" + a + ",b:" + b);//a:10,b:20

        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[1]);//4
    }

    public static void change(int a, int b) {//a = 10,b = 20
        System.out.println("a:" + a + ",b:" + b);//a:10,b:20
        a = b;
        b = a+b;
        System.out.println("a:" + a + ",b:" + b);//a:20,b:40
    }

    public static void change(int[] arr) {//arr = {1, 2, 3, 4, 5}
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                arr[x] *= 2;
            }
        }
        //arr = {1, 4, 3, 8, 5}
    }
}
