/*
    定义一个长方形的类，求周长和面积的的方法
    然后定义一个测试类test，进行测试

    长方形的类：
        成员变量：
        成员方法：
            求周长：（长+宽）*2
            求面积：长*宽
 */

import java.util.Scanner;//import必须在所有class上方
class graphic {
    private double length;
    private double width;

    public graphic() {

    }

    //仅仅提供set方法
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //求周长
    public double getPerimeter() {
        return (length+width)*2;
    }

    //求面积
    public double getArea() {
        return length*width;
    }
}
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入长方形的长：");
        double length = sc.nextDouble();
        System.out.println("请输入长方形的宽：");
        double width = sc.nextDouble();

        graphic rectangle  = new graphic();
        rectangle.setLength(length);
        rectangle.setWidth(width);

        System.out.println("周长为：" + rectangle.getPerimeter());
        System.out.println("面积为：" + rectangle.getArea());
    }
}
