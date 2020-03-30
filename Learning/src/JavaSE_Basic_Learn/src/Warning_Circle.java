/*
    注意死循环：
        A:一定要注意控制条件语句控制的那个变量的问题，不要弄丢了，否则就容易死循环。
        B:两种最简单的死循环格式。
            while(true){
                ...
            }

            for(;;){

            }


* */
public class Warning_Circle {
    public static void main(String[] args) {
        /*
        int x = 0;
        while (x < 10) {
            System.out.println(x);
        }

        while (true) {
            System.out.println("hhh");
        }
        */

        for (; ; ) {
            System.out.println("hhhh");
        }
    }
}
