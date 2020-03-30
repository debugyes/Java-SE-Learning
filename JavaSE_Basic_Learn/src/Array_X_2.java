/*
    定义两个数组，分别输出两个数组各自的数组名及元素值
    然后每个数组的元素重新赋值，再次分别输出两个数组各自的数组名及元素值
* */
public class Array_X_2 {
    public static void main(String[] args) {
        //定义第一个数组
        int[] arr_1 = new int[2];
        //定义第二个数组
        int[] arr_2 = new int[3];
        //输出数组名和元素值
        System.out.println(arr_1);
        System.out.println(arr_1[0]);
        System.out.println(arr_1[1]);
        System.out.println("------------------------------");

        System.out.println(arr_2);
        System.out.println(arr_2[0]);
        System.out.println(arr_2[1]);
        System.out.println(arr_2[2]);
        System.out.println("------------------------赋值后");


        //进行赋值
        arr_1[1] = 20;

        arr_2[1] = 30;
        arr_2[0] = 40;
        //输出数组名和元素值
        System.out.println(arr_1);
        System.out.println(arr_1[0]);
        System.out.println(arr_1[1]);
        System.out.println("------------------------------");

        System.out.println(arr_2);
        System.out.println(arr_2[0]);
        System.out.println(arr_2[1]);
        System.out.println(arr_2[2]);
    }
}
