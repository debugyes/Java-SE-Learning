/**
 * 这是针对数组进行操作的工具类
 * @author megumi
 * @version 1.0
 *
 */

public class ToolDemo_2{
    //把构造方法私有，外界就不能再创建对象了

    /**
     * 这是私有构造
     */
    private ToolDemo_2(){}

    /**
     * 这是遍历数组的方法，遍历后的格式是：[元素1， 元素2， 元素3...]
     * @param arr 这是要被遍历的数组
     */
    public static void printArry(int[] arr){
        for(int x = 0; x < arr.length; x++){
            if(x == arr.length-1){
                System.out.println(arr[x]);
            }else{
                System.out.print(arr[x] + ",");
            }
        }
    }

    /**
     * 这是数组中获取最大值的方法
     * @param arr 这是要获取最大值的数组
     * @return 返回数组中的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * 这是获取指定元素在数组中第一次出现的索引，如果元素不存在就返回-1
     * @param arr 被查找的数组
     * @param value 要查找的元素
     * @return 返回元素在数组中的索引，如果不存在，则返回-1
     */
    public static int getIndex(int[] arr, int value) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        return index;
    }
}