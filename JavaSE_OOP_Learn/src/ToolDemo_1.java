/*
    在同一个文件夹下，类定义在两个文件中和定义在一个文件中其实一样

 */
class ToolDemo_1 {
    public static void main(String[] args){
        //定义数组
        int[] arr = {28, 55, 37, 46, 19};
        
        //需求：遍历数组
        /*
        for(int x = 0; x < arr.length; x++){
            if(x == arr.length-1){
                System.out.println(arr[x]);
            }else{
                System.out.print(arr[x]);
            }
        }
        */
        //如果我有多个数组都要进行遍历，那么，代码的重复度就很高
        //如何改进呢？用方法改进
        //静态方法调用
        //printArry(arr);
        //非静态方法调用
        ToolDemo_1 ad = new ToolDemo_1();
        //ad.printArry(arr);

        //测试类的作用：创建其他类的对象，调用其他类的功能
        //而我们现在的操作是跟数组相关的，所以，你应该把这些操作定义到数组类中
        //定义一个数组的操作类
        //Array_Tool at = new Array_Tool();
        //at.printArry(arr);

        //方法改进为静态后，就可以直接通过类名调用
        ToolDemo_2.printArry(arr);

        //获取最值
        System.out.println(ToolDemo_2.getMax(arr));

        //获取55的索引
        System.out.println(ToolDemo_2.getIndex(arr, 55));
    }
    /*
    public void printArry(int[] arr){
        for(int x = 0; x < arr.length; x++){
            if(x == arr.length-1){
                System.out.println(arr[x]);
            }else{
                System.out.print(arr[x] + ",");
            }
        }
    }
    */
}