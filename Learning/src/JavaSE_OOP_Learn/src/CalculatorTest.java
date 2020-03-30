package JavaSE_OOP_Learn.src;/*

 */

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator casio = new Calculator();
        System.out.println("加" + casio.add(10, 20) + "减" + casio.sub(10, 20) + "乘" + casio.mul(10, 20) + "除" + casio.div(20, 10));
    }
}
