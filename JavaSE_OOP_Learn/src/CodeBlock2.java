/*
    ���:
        author megumi
        ����main����
        Student ��̬�����
        Student ��������
        Student()
        Student ��������
        Student()
 */
public class CodeBlock2 {
    static {
        System.out.println("author megumi");
    }

    public static void main(String[] args){
        System.out.println("����main����");

        StudentH s1 = new StudentH();
        StudentH s2 = new StudentH();
    }
}

class StudentH{
    static {
        System.out.println("Student ��̬�����");
    }

    {
        System.out.println("Student ��������");
    }

    public StudentH(){
        System.out.println("Student()");
    }
}
