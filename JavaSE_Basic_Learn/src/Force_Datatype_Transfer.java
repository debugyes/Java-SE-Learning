/*
    强制转换：
        从大的数据类型到小的数据类型

        格式：
            目标数据类型 变量 = （目标数据类型）（被转换的数据）
     注意：
        不要随意的去使用强制转换，因为它隐含了精度损失问题。
* */
public class Force_Datatype_Transfer {
    public static void main(String[] args){
        byte a = 3;
        int b = 4;

        //这个肯定没有问题
        int c = a+b;

        //byte c = a+b; Error
        //byte c = 7; OK

        //使用强制类型转换改进
        byte d = (byte)(a+b);//这行因为数据太小而没有损失精度

    }
}
