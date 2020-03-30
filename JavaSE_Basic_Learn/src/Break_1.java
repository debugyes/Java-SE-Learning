/*
    控制跳转语句：
        break:中断
        continue:继续
        return:返回

    break:中断的意思
    使用场景：
        A:switch
        B:循环语句中（循环语句中加入了if判断的场景）
        注意：离开上面的两个场景，无意义。

    如何使用呢？
        A:跳出单层循环
        B:跳出多层循环
            要想实现这个效果，就必须知道一个东西。带标签的语句。
            格式：
                标签名：语句
* */
public class Break_1 {
    public static void main(String[] args) {
        //在switch或者loop外部中断
        //break；

        //跳出单层循环
        for (int x = 0; x < 10; x++) {
            if (x == 3) {
                break;
            }
            System.out.println("hello world");
        }

        System.out.println("--------------------------------");
        //跳出多层循环
        outlayer:for (int i = 0; i < 3; i++) {
            inlayer:for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    //只能有一个break
                    //break inlayer;
                    break outlayer;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
