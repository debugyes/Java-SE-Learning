/*
    数组遍历：依次输出数组中的每一个元素。

    注意：数组提供了一个属性length，用于获取数组的长度。
        格式：数组名.length
* */
public class Array_Traverse_1 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11, 22, 33, 44, 55};

        //获取每一个元素
        //如何获取呢？可以通过数组名结合索引就可以找到数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("===============================");
        //虽然这种做法可以，但是不是我们想要的
        //发现代码的重复度很高
        //输出语句，数组名都是相同的，仅仅是索引是变化的
        //我们就可以用循环搞定索引值

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        //从0开始我们是明确的，但是为什么到5呢，我们是数了一下数组的个数
        //继续看下一个数组如何遍历
        int[] arr_2 = {1, 2, 3, 4, 5, 6, 7, 8, 76, 6, 5, 235};
        //而我们在很多时候，数组的元素不能靠数
        //这个时候，数组就给我们提供了一个属性：length专门用于获取数组的长度
        //格式：数组名.length 返回数组的长度
        System.out.println(arr.length);
        System.out.println(arr_2.length);
        System.out.println("===============================");

        //改进第一个程序
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("===============================");
        //如果想要对多个数组进行遍历，每个数组的遍历我们都把代码写一遍，很麻烦
        //所以用方法改进

        /*
            遍历数组的方法

            两个明确：
                返回值类型：void
                参数列表：int[] arr
        * */

        traverse(arr);
        traverse(arr_2);
        System.out.println("===============================");


        traverse_2(arr);
        traverse_2(arr_2);
    }

    public static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //改进方法
    public static void traverse_2(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");//这是最后一个元素
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
