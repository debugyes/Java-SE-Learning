import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
    ������д�����
        A:��Ա����������
            int x = 10;//��Ա�����ǻ�������
            Student s =new Student();//��Ա�����Ǹ���������

        B:һ����ĳ�ʼ������
            ��Ա�����ĳ�ʼ��
                Ĭ�ϳ�ʼ��
                ��ʾ��ʼ��
                ���췽����ʼ��
        C:�Ӹ���ĳ�ʼ�����ֲ��ʼ����
            �Ƚ��и����ʼ����Ȼ����������ʼ����

    ִ��˳��
    1.ִ��Z();,����Z�̳�x����ʵ����Ϊ���췽����һ��Ĭ����super()��
    2.�ȳ�ʼ��x��
        ��ʼ��Y b = new Y()��
        ȥ����Y�Ĺ��췽��
        ���Y
    3.����X()���췽�������X
    4.X��ʼ���������ص�Z��
    5.ִ��Y y = new Y(); ��ȥ����Y�������췽�������Y
    6.����Z()���췽�������Z

    ��ִ�й��췽���г�super()����ĵ�һ�����֮ǰ��Ҫ���г�Ա�����ĳ�ʼ��������г�Ա�����Ļ���

    �����YXYZ

    ���⣺
        �����й��췽��Ĭ����һ��super()
        ���ǰ��շֲ��ʼ�����е�
        ����ʾҪ�ȳ�ʼ���������ݣ��ٳ�ʼ����������

 */

class X{
    Y b = new Y();

    X(){
        System.out.println("X");
    }
}

class Y{
    Y(){
        System.out.println("Y");
    }
}

public class Z extends X{
    Y y = new Y();
    Z(){
        super();
        System.out.println("Z");
    }

    public static void main(String[] args){
        new Z();
    }
}

