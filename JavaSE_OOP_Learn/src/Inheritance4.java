/*
    ������
        ��Ա����
        ���췽��
        ��Ա����

    �����������ֽ����˼̳У����ԣ����Ǿ�Ӧ��������һ�£������ɲ��ֵĸ��Թ�ϵ��

    �̳��г�Ա�����Ĺ�ϵ��
        A:�����еĳ�Ա�����͸����еĳ�Ա�������Ʋ�һ�������̫��
        B:�����еĳ�Ա�����͸����еĳ�Ա�������Ƶ�һ��
            �����෽���з���һ�������Ĳ���˳��
                a:�����෽���ľֲ���Χ�ң��о�ʹ��
                b:������ĳ�Ա��Χ�ң��о�����
                c:�ڸ���ĳ�Ա��Χ��
                d:������Ҳ����ͱ���
 */
public class Inheritance4 {
    public static void main(String[] args) {
        SonB s = new SonB();

        s.show();
    }
}

class FatherB{
    public int num = 10;
}

class SonB extends FatherB{
    public int num2 = 20;
    public int num = 30;
    public void show(){
        int num = 40;
        System.out.println(num);
        System.out.println(num2);
    }
}
