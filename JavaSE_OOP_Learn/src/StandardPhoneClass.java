/*
    标准的手机类练习

    手机类：
        成员变量：brand,price,color
        构造方法：无参构造
        成员方法：getXxx()/setXxx()
* */
//定义手机类
class StandardPhone {
    private String brand;
    private int price;
    private String color;

    //无参构造方法
    public StandardPhone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

public class StandardPhoneClass {
    public static void main(String[] args) {
        //创建对象
        StandardPhone phone = new StandardPhone();

        phone.setBrand("apple");
        phone.setPrice(19999);
        phone.setColor("golden");

        //获取值
        System.out.println(phone.getBrand() + "---" + phone.getColor() + "---" + phone.getPrice());

    }
}
