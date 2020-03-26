/*
    结果:
        author megumi
        我是main方法
        Student 静态代码块
        Student 构造代码块
        Student()
        Student 构造代码块
        Student()
 */
public class CodeBlock2 {
    static {
        System.out.println("author megumi");
    }

    public static void main(String[] args){
        System.out.println("我是main方法");

        StudentH s1 = new StudentH();
        StudentH s2 = new StudentH();
    }
}

class StudentH{
    static {
        System.out.println("Student 静态代码块");
    }

    {
        System.out.println("Student 构造代码块");
    }

    public StudentH(){
        System.out.println("Student()");
    }
}
