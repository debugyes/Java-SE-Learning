/*
    �����⣺final���ξֲ�����������
    �������ͣ��������͵�ֵ���ܸı�
    �������ͣ��������͵ĵ�ֵַ���ܷ����ı䣬���ǣ��ö���Ķ��ڴ��ֵ�ǿ��Ըı��
 */
public class final3 {
    public static void main(String[] args){
        //�ֲ������ǻ�����������
        int x = 10;
        x = 100;
        System.out.println(x);
        final int y = 10;
        //y = 100;
        System.out.println(y);

        System.out.println("------------------");

        //�ֲ������ǻ�����������
        StudentM s = new StudentM();
        System.out.println(s.age);
        s.age = 100;
        System.out.println(s.age);

        final StudentM s2 = new StudentM();
        System.out.println(s2.age);
        s2.age = 100;
        System.out.println(s2.age);
        //���·����ڴ�ռ䣬����
        //s2 = new StudentM();
    }
}

class StudentM{
    int age = 10;

}
