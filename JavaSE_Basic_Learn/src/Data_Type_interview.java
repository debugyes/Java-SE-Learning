/*
面试题：
  1.byte b1 = 3, b2 = 4, b;
    b = b1 + b2;
    b = 3+4;
    Which one is failing to compile? and why?
    ANSWER:there is something wrong with the sentence b = b1 + b2; ,
    because, when two variables add up, the system will first focus on the data type, also when it's given out the value
    but, when two statics add up, the system will first do the plus operation, and then focus on whether the value is in the scope or not,
    if not, it will show errors.

  2.Is there any wrong with the sentence: byte b = 130?
    if it's wrong, what should I do to solve the problem?
*/
public class Data_Type_interview {
    public static void main(String[] args){
        byte b1 = 3, b2 = 4, b;
        //b = b1 + b2;
        // when data type "byte" take part in the procession, it will automatically switch to "int" type
        //so, it will lose accuracy when the value(after procession) was given to the ‘b1’

        b = 3+4;
        /*
        When static values take part in the operations,
        the system will first work out the value,
        and then see if is's value is in the scope of "btye"(or something else data types)，
        if it's in the scope, that will be fine, no errors or warning,
        but, if the value is out of the scope, the IDE will show an error(maybe more than one, LOL~)
        */

        //byte b = 130;
        //error, because the scope of byte is from -128 to 127, the value 130 is out of the scope
        //you have to use the force data type transfer solving this problem
        byte c = (byte)130;
        System.out.println(c);//the outcome is -126
        /*
        But, why the outcome is -126?
        Analysis process:
        If we want to know the result, we have to know how does the computer calculate it
        we know that the operation of data in the computer is through the complement,
        if we have to get the complement, we have to calculate the binary of the value

        A: Get the binary of 130
           00000000 00000000 00000000 10000010
           这就是130的原码，反码，补码（因为这是个正数）
        B: 截取操作， 截成byte
           10000010
           这个结果是补码
        C: 已知补码求原码
                  符号位   数值位
           补码       1       0000010
           反码       1       0000001
           原码       1       1111110

        * */
    }

}
