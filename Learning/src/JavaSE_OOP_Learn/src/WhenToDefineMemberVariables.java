/*
2019.11.9
定义一个类，其中定义一个求两个数据和的方法。
定义一个测试类test，进行测试。

变量什么时候定义为成员变量：
    如果这个变量是用来描述这个类的信息的，那么该变量就应该定义为成员变量

    变量到底定义在那里好呢？
        变量的范围是越小越好，因为能及时的被回收。
 */
class Add {
    public int sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
}

//方式1满足了我们的要求，但是不好
//因为参与操作的数据现在是固定的。

//方式2改进
class Add2 {
    public int sum(int a, int b) {
        return a+b;
    }
}

//方式2可以满足我们的要求，但是我们学习过面向对象的思想
//但a,b可不可以定义为成员变量？
//如果可以再改进

class Add3 {
    int a;
    int b;

    public int sum() {
        return a + b;
    }
}
//这种方式虽然可以，而且好像符合了面向对象的思想
//但是不好
//因为类是一组相关的属性和行为的集合
//并且类是通过事物转换过来的
//而类中的成员变量就是事物的属性
//属性是用来描述事物的
//同理：成员变量其实是用来描述类的

public class WhenToDefineMemberVariables {
    public static void main(String[] args) {
        //方式1测试
        Add test = new Add();
        System.out.println(test.sum());

        //方式2测试
        Add2 test2 = new Add2();
        System.out.println(test2.sum(10, 20));

        //方式3测试
        Add3 test3 = new Add3();
        test3.a = 10;
        test3.b = 20;
        System.out.println(test3.sum());


    }
}