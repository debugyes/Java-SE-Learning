/*
    ����飺��Java�У�ʹ��{}�������Ĵ��뱻��Ϊ�����
    ������λ�ú������Ĳ�ͬ�����Է�Ϊ
        �ֲ������:����������,�����޶������������ڣ������ͷţ�����ڴ�������
        ��������:�����еĳ�Աλ��,��{}�������Ĵ��룬ÿ�ε��ù��췽��ִ��ǰ��������ִ�й�������
            ���ã����԰Ѷ�����췽���еĹ�ͬ����ŵ�һ�𡣶Զ�����г�ʼ����
        ��̬�����:�����еĳ�Աλ��,��{}�������Ĵ��룬��static����.
            ���ã�һ���Ƕ�����г�ʼ����

    �����⣺
        ��̬����飬�������飬���췽����ִ��˳��
        ��̬�����->��������->���췽��

        ��̬����飺ִֻ��һ��
        ��������:ÿ�ε��ù��췽����ִ��
 */
public class CodeBlock1 {
    public static void main(String[] args) {
        {
            int x = 10;
            System.out.println(x);
        }

        {
            int y = 20;
            System.out.println(y);
        }
        System.out.println("-----------------------------");

        Code c = new Code();
        System.out.println("------------------------------");

        Code c2 = new Code();
        System.out.println("------------------------------");


    }
}

class Code{
    //��̬�����
    static {
        int a = 1000;
        System.out.println(a);
    }

    //��������
    {
        int x = 100;
        System.out.println(x);
    }

    //���췽��
    public Code(){
        System.out.println("Code");
    }
    //���췽��
    public Code(int a){
        System.out.println("Code");
    }
    //��������
    {
        int y = 100;
        System.out.println(y);
    }

    static {
        int b = 1000;
        System.out.println(b);
    }

}