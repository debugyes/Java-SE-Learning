/*
    ������2��������д���
        A:һ����ľ�̬����飬�������飬���췽����ִ������
            ��̬�����->��������->���췽��
        B:��̬�������Ǹ�����ļ��ض�����
            ��̬���������ݻ�����ִ��
        C:�����ʼ��֮ǰ�ȻḸ��ĳ�ʼ��


    1.���ظ���̬�����
    2.�����Ӿ�̬�����
    3.���ظ��������飨��������ֻ���ڹ��췽�����õ�ʱ��Ż��ڹ��췽��֮ǰִ�У�
    4.���ظ����췽��
    5.�����ӹ�������
    6.�����ӹ��췽��

    �����
    ��̬�����Fu
    ��̬�����Zi
    ��������FU
    ���췽��Fu
    ��������Zi
    ���췽��Zi

 */
public class InheritanceInterview2 {
    public static void main(String[] args){
        ZiA z = new ZiA();
    }
}

class FuA{
    static {
        System.out.println("��̬�����Fu");
    }

    {
        System.out.println("��������FU");
    }

    public FuA(){
        System.out.println("���췽��Fu");
    }
}

class ZiA extends FuA{
    static {
        System.out.println("��̬�����Zi");
    }

    {
        System.out.println("��������Zi");
    }

    public ZiA(){
        System.out.println("���췽��Zi");
    }
}
