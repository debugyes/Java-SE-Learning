/*
 * 标识符：就是给类，接口，方法，变量等起名字
 *
 * 组成规则：
 *      A：英文字母大小写
 *      B：数字字符
 *      C: $和_
 *
 *  注意事项：
 *      A:不能以数字开头
 *      B:不能是java中的关键字
 *      C:java语言严格区分大小写
 *
 *  注意事项：见名知意
 */

public class Identifier {
    public static void main(String[] args){
        //正确做法
        int x = 100;

        //不能以数字开头
        //int ly = 100;
        int y1 = 100;

        //不能是java中的关键字
        //int public = 100;
        int Public = 100;//Public的p大写就可以，说明java严格区分大小写

    }
}
