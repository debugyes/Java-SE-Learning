/*
    需求：二维数组遍历

    外循环控制的是二维数组的长度，其实就是一维数组的个数。
    内循环控制的是一维数组的长度。

    二维数组的长度就是一维数组的个数
    二维数组名加一个索引就是一维数组，再.length就是一维数组的长度
* */
public class Array_Double_Dimension_Traverse {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //请问谁代表{1，2，3}
        //arr[0]就是第一个数组
        //arr[0] = {1,2,3};
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i]);
        }

        for (int j = 0; j < arr[1].length; j++) {
            System.out.println(arr[1][j]);
        }

        for (int k = 0; k < arr[2].length; k++) {
            System.out.println(arr[2][k]);
        }
        System.out.println("-----------------------------");
        //用循环改进
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.println(arr[i][j] + "]");
                } else {
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
        System.out.println("-----------------------------");
        //这个时候注意了，3是我们根据上面的代码得出来的
        //但是，它不能针对任何的数组都可以这样
        //所以，我们应该想办法改进
        //其实，外面的这个循环的长度就是二维数组的长度
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.println(arr[i][j] + "]");
                } else {
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
        System.out.println("-----------------------------");
        //用方法改进
        outPut(arr);
        System.out.println("-----------------------------");

        //再来一个列数是变化的
        int[][] arr_2 = {{1, 2, 3}, {4, 5}, {7}};
        outPut(arr_2);
    }


    /*
        需求：遍历二维数组
        两个明确：
            返回值类型：void
            参数列表：int[][] arr
    * */

    public static void outPut(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.println(arr[i][j] + "]");
                } else {
                    System.out.print(arr[i][j] + ",");
                }
            }
        }
    }
}
