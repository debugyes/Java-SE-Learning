/*
    手机类的使用
* */
class Phone {
    String brand;
    int price;
    String color;

    public void call(String name) {
        System.out.println("call " + name);
    }

    public void sendMessage() {
        System.out.println("Send messages");
    }

    public void palyGames() {
        System.out.println("Play games");
    }
}
public class Use_Phone_Class {
    public static void main(String[] args) {
        Phone iPhone = new Phone();

        iPhone.brand = "apple";
        iPhone.color = "blue";
        iPhone.price = 10000;

        iPhone.call("alex iota");
        iPhone.palyGames();
        iPhone.sendMessage();
    }
}
