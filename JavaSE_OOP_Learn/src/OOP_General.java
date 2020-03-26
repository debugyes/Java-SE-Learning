/*
    1.面向对象思想：
        面向对象是基于面向过程的编程思想。

        面向过程：强调的是每一个功能的步骤
        面向对象：强调的是对象，然后由对象去调用功能

    2.面向对象的思想特点
        A:是一种更符合我们思想习惯的思想
        B:可以将复杂的事情简单化
        C:将我们从执行者变成了指挥者

        举例：
            买电脑：
                面向过程：了解电脑->了解需求->找对应的参数信息->购买
                面向对象：要买电脑->对象帮忙买->买回来了

            洗衣服：
                面向过程：收集衣服->找一个盆->放洗衣服->加水->把衣服泡水->洗->晾干
                面向对象：收集衣服->打开洗衣机->放进去->一键即可->晾干

            吃饭：
                面向过程：去超市买菜->摘菜->洗菜->切菜->盛起来->吃
                面向对象：去饭店吃饭->叫服务员点菜->厨师做菜->服务员端菜->吃

   3.把大象装进冰箱
        面向过程：
         动作有那些呢？
          A:打开冰箱门
          B:装进大象
          C:关闭冰箱门


       public static void main(String[] args) {
        //大象装进冰箱代码体现
        //面向过程
        System.out.println("大开冰箱门");
        System.out.println("装进大象");
        System.out.println("关闭冰箱门");

        打开冰箱门的操作，现在仅仅是为了演示，就写了一个输出语句
        其实，它还可能需要做很多操作
        这个时候代码就比较多一些了
        假设我要多次打开冰箱门
        就应用方法改进

        }

        public static void openGate() {
        System.out.println("打开冰箱门");
        }

        public static void fitIn(){
            System.out.println("装进大象");
        }

        public static void closeGate() {
            System.out.println("关闭冰箱门");
        }

         面向对象：
         A:有哪些类
         B:每个类有哪些东西
         C:类于类之间的关系

         把大象装进冰箱的分析：
            A:有哪些类：大象，冰箱，OOP_General
                如何分析有哪些类：UML，名词提取法
            B:每个类有哪些东西：
                 大象：进去
                 冰箱：开门
                       关门
                 OOP_General: main方法
            C:类于类之间的关系
                 OOP_General中使用大象和冰箱类的功能。

         public class elephant{
            public static void fitIn(){
                System.out.println("装进大象");
            }
         }

        public class fridge {
           public static void openGate() {
                System.out.println("打开冰箱门");
           }

           public static void closeGate() {
               System.out.println("关闭冰箱门");
           }
        }

        public class OOP_General{
            public static void main(String args[]){
                冰箱调用开门
                大象调用进去
                冰箱调用开门
            }
        }

     4. 面向对象开发、设计、特征
            开发：就使不断的创建对象，使用对象，指挥对象做事情
            设计：其实就使在管理和维护对象间的关系
            特征：封装（encapsulation）
                  继承(inheritance)
                  多态(polymorphism)

 */

public class OOP_General {

}