/*
    需求：请输出一个4行5列的星星（*）图案
    结果：
        *****
        *****
        *****
        *****

    输出语句的另一种格式：System.out.print();
    循环嵌套：就是循环语句的循环体本身就是一个循环语句。
    通过结果得出结论：外循环控制行数，内循环控制列数。
* */
public class Circle_Nest_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            //可以通过空的输出语句实现换行
            System.out.println();
        }
    }
}
