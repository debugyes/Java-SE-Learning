/*
    把手机类写成一个标准类，然后创建对象测试功能
    手机类：
        成员变量：
            价格：String brand;
            价格：int price;
            颜色：String color;
        成员方法：
            针对每一个成员变量给出对应的getXxx()/setXxx()方法。
        最后定义测试：
            创建一个对象，先通过getXxx()方法输出成员变量的值。这一次的结果是null---0---null
            然后通过setXxx()方法给成员变量赋值，再次输出结果。这一次的结果是：三星---2999---金
 */
class Phone_Samsung {
    private String brand;
    private int price;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}

public class Private_Phone_Class {
    public static void main(String[] args) {
        Phone_Samsung S10 = new Phone_Samsung();

        System.out.println(S10.getBrand() + "---" + S10.getPrice() + "---" + S10.getColor());
        S10.setBrand("Samsung");
        S10.setColor("Gold");
        S10.setPrice(2999);
        System.out.println(S10.getBrand() + "---" + S10.getPrice() + "---" + S10.getColor());

    }
}