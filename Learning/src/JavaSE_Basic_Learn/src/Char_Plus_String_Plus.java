/*
    看程序写结果

    通过字符和一个整数相加，我们给出一张表：ASCII表
    记住字符0：48
        字符a：97
        字符A: 65
* */
public class Char_Plus_String_Plus {
    public static void main(String[] args){
        //直接输出一个字符
        System.out.println('a');//a
        //输出一个字符和一个整数做加法
        System.out.println('a'+1);//98

        System.out.println("hello"+'a'+1);//字符串数据和其他数据做加法，结果是字符串类型，这里的+不是加法运算，二十字符串连接符
        System.out.println('a'+1+"hello");

        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");

        byte b1 = (byte) 128;
        System.out.println(b1);

    }
}
