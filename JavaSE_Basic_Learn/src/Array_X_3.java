/*
    定义第一个数组，定义完毕后，给数组元素赋值。赋值完毕后，再输出数组名称和元素。
    定义第二个数组，定义完毕后，给数组元素赋值。赋值完毕后，再输出数组名称和元素。
    定义第三个数组，把第一个数组的地址值赋值给它。（注意类型一致），通过第三个数组的名称去修改元素的值，最后再次输出数组名称和元素。

* */
public class Array_X_3 {
    public static void main(String[] args) {
        int[] arr_1 = new int[3];
        arr_1[0] = 10;
        arr_1[1] = 20;
        arr_1[2] = 30;

        System.out.println(arr_1);
        System.out.println(arr_1[0]);
        System.out.println(arr_1[1]);
        System.out.println(arr_1[2]);
        System.out.println("----------------------------");

        //定义第二个数组
        int[] arr_2 = new int[3];
        arr_2[0] = 22;
        arr_2[1] = 44;
        arr_2[2] = 55;

        System.out.println(arr_2);
        System.out.println(arr_2[0]);
        System.out.println(arr_2[1]);
        System.out.println(arr_2[2]);
        System.out.println("----------------------------");

        //定义第三个数组
        int[] arr_3 = arr_1;
        arr_3[0] = 100;
        arr_3[1] = 200;
        System.out.println(arr_3);
        System.out.println(arr_3[0]);
        System.out.println(arr_3[1]);
        System.out.println(arr_3[2]);
        System.out.println("----------------------------");
    }
}
