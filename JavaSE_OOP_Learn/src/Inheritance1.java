/*
    �̳и�����
        �Ѷ��������ͬ�Ĳ��ָ���ȡ�������嵽һ�����С�

    ���ʵ�ּ̳��أ�
        java�ṩ�˹ؼ��֣�extends

    ��ʽ��
        class ������ extends ����{}

    �ô���
        A������˴���ĸ�����
        B: ����˴����ά����
        C: ������������Ĺ�ϵ���Ƕ�̬��ǰ��

    ����������˹�ϵ����ʵҲ�Ǽ̳е�һ���׶�
        ����������ǿ�ˡ�

    ������ԭ�򣺵���ϣ����ھ�
    ��ϣ�������Ĺ�ϵ
    �ھۣ������Լ����ĳ���µ�����
 */
public class Inheritance1 {
    public static void main(String[] args) {
        StudentI s = new StudentI();
        s.eat();
        s.sleep();

        TeacherI t = new TeacherI();
        t.eat();
        t.sleep();
    }
}

//ʹ�ü̳�ǰ
/*
class StudentI{
    public void eat(){
        System.out.println("�Է�");
    }

    public void sleep() {
        System.out.println("˯��");
    }
}

class TeacherI{
    public void eat(){
        System.out.println("�Է�");
    }

    public void sleep() {
        System.out.println("˯��");
    }
}
 */

//ʹ�ü̳к�
class PersonI{
    public void eat(){
        System.out.println("�Է�");
    }

    public void sleep() {
        System.out.println("˯��");
    }
}

class StudentI extends PersonI{

}

class TeacherI extends PersonI{

}