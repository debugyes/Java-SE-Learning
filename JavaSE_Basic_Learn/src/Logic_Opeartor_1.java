/*
    逻辑运算符：
        &,|,^, !
        &&, ||
    特点：
        逻辑运算符一般用于连接boolean类型的表达式或值

        表达式：就是用运算符把常量或变量连接起来的符合java语法的式子
            算数表达式：a+b
            比较表达式：a==b
    结论：
        逻辑与：&   有0出0，全1出1
        逻辑或：|   有1出1，全0出0
        逻辑异或：^  相异为1
        逻辑非！：非false则true，非true则false
            特点：偶数个！不改变本身
* */
public class Logic_Opeartor_1 {
    public static void  main(String[] args){
        int a = 3;
        int b = 4;
        int c = 5;

        //&
        System.out.println((a>b) & (a>c));//false & false   false
        System.out.println((a>b) & (a<c));//false & true    false
        System.out.println((a<b) & (a>c));//true & false    false
        System.out.println((a<b) & (a<c));//true & true     true
        System.out.println("-----------------------------------");
        //|
        System.out.println((a>b) | (a>c));//false & false   false
        System.out.println((a>b) | (a<c));//false & true    true
        System.out.println((a<b) | (a>c));//true & false    ture
        System.out.println((a<b) | (a<c));//true & true     true
        System.out.println("-----------------------------------");
        //^
        System.out.println((a>b) ^ (a>c));//false & false   false
        System.out.println((a>b) ^ (a<c));//false & true    true
        System.out.println((a<b) ^ (a>c));//true & false    true
        System.out.println((a<b) ^ (a<c));//true & true     false
        System.out.println("-----------------------------------");
        //!
        System.out.println(!(a>b));//true
        System.out.println(!(a<b));//false
        System.out.println(!!(a>b));//false
        System.out.println(!!!(a>b));//true
    }
}
