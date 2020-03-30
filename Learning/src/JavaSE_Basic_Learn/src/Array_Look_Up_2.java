/*
    需求：数组元素查找（查找指定元素第一次在数组中出现的索引）

    分析：
        A：定义一个数组并静态初始化。
        B: 写一个功能实现
            遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
            如果相等，就返回当前的=索引值
* */
public class Array_Look_Up_2 {
    public static void main(String[] args) {
        int[] arr = {200, 250, 390, 22, 0};

        //需求：查找250在这个数组中第一次出现的索引
        System.out.println("第一次出现在索引" + getIndex(arr, 2500) + "的地方");
    }

    /*
        需求：查找指定数据在数组中第一次出现的索引
        两个明确：
            返回值类型：int
            参数列表：int[] arr, int val
    * */
    public static int getIndex(int[] arr, int value) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == value) {
                return x;
            }
        }
        //目前的代码有一个小问题
        //就是加入我要查找的数据在数组中不存在，那就没有对应返回。
        //所以报错

        //只要是判断，就可能是false，要细心
        //如果找不到数据，一般返回一个复数，而且是返回-1
        return -1;
    }

    public static int getIndex2(int[] arr, int value) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == value) {
                index = x;
            }
        }
        //如果index被改变了，说明找到了；如果没改变还是-1就说明没找到。
        return index;
    }
}
