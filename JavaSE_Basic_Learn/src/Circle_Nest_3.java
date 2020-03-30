/*
    需求：输出九九乘法表

    注意:
        '\x' x表示任意，这种做法叫转义字符。
        '\t' 缩进tab键
        '\r' 回车
        '\n' 换行
 */
public class Circle_Nest_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + '\t');
            }
            System.out.println();
        }
    }
}
