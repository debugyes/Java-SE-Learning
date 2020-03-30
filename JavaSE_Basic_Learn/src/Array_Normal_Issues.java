/*
    数组操作的两个常见小问题：
        ArrayIndexOutOfBoundsException:数组索引越界异常
            原因：访问了而不存在的索引。
        NullPointerException:空指针异常
            原因：数组已经不再指向堆内存了，而还用引用去访问元素，所以出错。

    作用：把所有常见EXception结尾的问题总结一下。以后遇到就记录下来。
        现象，原因，解决方案。
* */
public class Array_Normal_Issues {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);

        //引用类型的常量：
        arr = null;
        System.out.println(arr[0]);

    }
}