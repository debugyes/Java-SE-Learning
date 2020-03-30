/*
    数组获取最值（获取数组中的最大值最小值）

    分析：
        A:定义一个数组，并对数组的元素进行静态初始化。
        B:从数组中任意的找一个参照物（一般取第一个）
        C:然后遍历其他的元素，依次获取，和参照物比较，如果大就留下，如果小，就离开。
        D:最后参照物里面保存的就是最大值。
* */
public class Array_Max_1 {
    public static void main(String[] args) {
        int[] arr = {34, 98, 10, 25, 67};

        //请获取数组中的最大值
        /*
        int max = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("max:" + max);
        */
        System.out.println("max:" + max(arr));

        //请获取数组中的最小值
        System.out.println("mini:" + mini(arr));

    }

    /*
        需求：获取数组中的最大值
        两个明确：
            返回值类型：int（数组类型和返回值类型相同）
            参数列表：int[] arr
     */
    //使用方法改进
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int mini(int[] arr) {
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }
}
