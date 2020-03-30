/*
    Math:类包含用于执行基本数学运算的方法
    由于Math类在java.lang下，所以不要导包

    特点：没有构造方法，因为他的成员全是静态的

    掌握一个方法：
        获取随机数的方法
        public static double random();
        返回带正号的double值，该值大于等于0.0，小于1.0
 */
public class MathDemo {
    public static void main(String[] args){
        //获取一个随机数
        double d = Math.random();

        System.out.println(d);

        //需求：我要获取一个1-100间的随机数
        int num = (int)(Math.random()*100)+1;
        System.out.println(num);
    }
}
