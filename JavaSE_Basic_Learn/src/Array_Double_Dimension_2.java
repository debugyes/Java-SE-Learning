/*
    格式2：
        数据类型[][] 数组名 = new 数据类型[m][]  只有m没有n
        m:表示这个二维数组有多少个一维数组。
        列数没有给出，可以动态的给。这次是一个变化的列数。

    二维数组名配合一个索引是指一维数组名，配合两个编号是指二维数组元素。
* */
public class Array_Double_Dimension_2 {
    public static void main(String[] args) {
        //定义数组
        int[][] arr = new int[3][];

        System.out.println(arr);//[[I@1b6d3586
        System.out.println(arr[0]);//null
        System.out.println(arr[1]);//null
        System.out.println(arr[2]);//null
        //因为没有动态分配一维数组，所以二维数组中的元素值全是null

        //动态地为每一个一维数组分配空间
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        System.out.println(arr[0]);//[I@4554617c
        System.out.println(arr[1]);//[I@74a14482
        System.out.println(arr[2]);//[I@1540e19d

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        //System.out.println(arr[0][2]);ArrayIndexOutOfBoundsException

        arr[1][0] = 100;
        arr[1][2] = 200;

    }
}
