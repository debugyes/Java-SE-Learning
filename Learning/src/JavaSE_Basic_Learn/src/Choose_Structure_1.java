/*
    选择结构：
        if语句
        switch语句

    if语句三种格式：
        格式1：if(比较表达式){
            语句体
        }
        执行流程：
            先计算比较表达式的值，看其返回值是true还是false。
            如果是true，就执行语句体
            如果是false，就不执行语句体




* */
import java.util.Scanner;

public class Choose_Structure_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 10) {
            System.out.println("x等于10");
        }
    }
}
