  /*
    main方法的格式讲解：
        public static void main(String[] args)

        public:公共的，访问权限是最大的，由于main方法就是被jvm调用，所以全县要够大
        static:静态的，不需要创建对象，通过类名就可以调用，方便jvm的调用
        void:方法的返回值是返回给调用者，而main方法是被jvm调用，你返回内容给jvm没意义
        main:是一个常见的方法入口
        String[] args:是一个字符串数组
            早期用来接受键盘录入的数据。
            格式是：
                java 类名 字符串值
 */
public class Static_4 {
    public static void main(String[] args) {
        System.out.println(args);//[Ljava.lang.String;@74a14482
        System.out.println(args.length);//0
        //越界，因为args里没东西
        //System.out.println(args[0]);

        //接受数据后
        System.out.println(args);//[Ljava.lang.String;@74a14482
        System.out.println(args.length);//0
        //System.out.println(args[0]);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
