/*
    我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为0.01m。
    请问折叠多少次后，就可以保证厚度不低于珠穆朗玛峰的高度？

    分析：
        A:定义一个统计变量，默认值是0
        B:最高山峰是珠穆朗玛峰：8848m这是最终的厚度
            有一张足够大的纸，厚度为0.01m，这是初始厚度
        C:折叠一次厚度就是以前的两倍
        D:每次变化的厚度没有超过8848m，就折叠，统计变量++
        E:输出统计变量
* */
public class While_Exercise_4 {
    public static void main(String[] args) {
        int count = 0;
        int height = 1;
        int max_height = 884800;
        while (height < max_height) {
            count++;
            height *= 2;
            System.out.println("第" + count + "次叠了" + height);
        }
        System.out.println("要折叠" + count + "次");
    }
}
