/*
    数组元素逆序（就是把元素对调）
    分析：
        A:定义一个数组，并进行静态初始化。
        B:思路：
            把0索引和arr.length-1的数据交换
            把1索引和arr.length-2的数据交换
* */
public class Array_Inverted_Sequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("before:");
        traverse(arr);
        invertSequence_2(arr);
        System.out.println("after:");
        traverse(arr);

    }

    /*
        需求：数组逆序
        两个明确：
            返回值类型：void(没有必要返回逆序后的数组，因为两个引用指向同一个数组)
            参数列表：int[]
    * */

    public static void invertSequence(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public static void invertSequence_2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            arr[end] = (arr[start] + arr[end]) - (arr[start] = arr[end]);
        }
    }

    public static void traverse(int[] arr) {
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
