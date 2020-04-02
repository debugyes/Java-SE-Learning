/*
    <<:左移 左边最高位丢弃，右边补齐0
    >>:右移：最高位是0，左边补齐0，最高位是1，左边补齐1
    >>>:无符号右移：无论高位是0还是1，左边补齐0
 */
public class Place_Operator_4 {
    public static void  main(String[] args){
        //<<把左边的数据*2的移动次幂
        System.out.println(3<<2);//3*2^2 = 12
        //>>把>>左边的数据除以2的移动次幂
        System.out.println(24>>2);//24/2^2 = 6
        System.out.println(24>>>2);//24/2^2 = 6正数有符号无符号数都一样

        System.out.println(-24>>2);
        System.out.println(-24>>>2);
    }

}
/*
    System.out.println(3<<2);
    计算出3的二进制11：
        00000000    00000000    00000000    00000011
    (00)000000    00000000    00000000    0000001100

    System.out.println(-24>>2);
    计算出24的二进制：11000
        原码：10000000    00000000    00000000    00011000
        反码：11111111    11111111    11111111    11100111
        补码：11111111    11111111    11111111    11101000
    进行右移：
        11111111    11111111    11111111    11101000
        1111111111    11111111    11111111    111010（00）补码
    由补码转换回原码：
        补码：111111111    11111111    11111111    111010
        反码：111111111    11111111    11111111    111001
        原码：100000000    00000000    00000000    000110  -6

    System.out.println(-24>>>2);
    计算出24的二进制：11000
        原码：10000000    00000000    00000000    00011000
        反码：11111111    11111111    11111111    11100111
        补码：11111111    11111111    11111111    11101000

    进行无符号右移：
        11111111    11111111    11111111    11101000
        0011111111    11111111    11111111    111010（00）变成正数，原反补都相同
    结果：1073741818

 */