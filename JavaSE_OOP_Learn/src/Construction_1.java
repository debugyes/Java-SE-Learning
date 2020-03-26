/*
    构造方法：
        给对象的数据进行初始化

    格式：
        A：方法名与类名相同
        B：没有返回值类型，连void都没有
        C：没有具体的返回值

 * */
class StudentD {
    private String name;//NULL
    private int age;//0
    public StudentD() {
        System.out.println("这是构造方法");
    }
}

public class Construction_1 {
    public static void main(String[] args) {
        StudentD s = new StudentD();
        System.out.println(s); //StudentD@74a14482
    }
}
