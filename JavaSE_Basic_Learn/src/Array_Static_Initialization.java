/*
    数组的静态初始化：
        格式：数据类型[] 数组名 = new 数据类型[] {元素1， 元素2}；

        举例：
            int[] arr = new int[]{1, 2, 3}
        简化格式：
            int[] arr = {元素1, 元素2, 元素3}
        举例：
            int arr = {1, 2, 3};

    注意事项：
        不要同时动态和静态进行。
        如下格式：
            int[] arr = new int[3]{1, 2, 3};//错误
* */
public class Array_Static_Initialization {
    public static void main(String[] args) {
        int[] arr_1 = new int[]{1, 2, 3};
        int[] arr = {1, 2, 3};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
