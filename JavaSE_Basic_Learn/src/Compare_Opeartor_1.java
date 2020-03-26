/*
    比较运算符：
        ==, !=, >, >=, <, <=

    特点；
        无论操作简单还是复杂，结果是boolean类型
    注意：
        ==不能写成=
* */
public class Compare_Opeartor_1 {
    public static void main(String[] args){
        int x = 3;
        int y = 4;
        int z = 3;
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println((x+y) == (x+z));

        System.out.println("------------------------------");

        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println("------------------------------");

        int a = 10;
        int b = 20;

        boolean flag = (a == b);
        //boolean flag = (a = b);   不兼容的类型，b赋值给a，表达式a = b留下的是a，把a赋值给boolean类型，不兼容

        System.out.println(flag);

        int c = (a = b);//把b赋值a，然后把a留下
    }
}
