/*
    �̳��й��췽���Ĺ�ϵ
        A: �����е����й��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
        B: Ϊʲô�أ�
            ��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø��������
            ���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ��
        C: ע�⣺����ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super(��)
 */

public class Inheritance6 {
    public static void main(String[] args){
        SonD s = new SonD();
        System.out.println("-------------------------------");
        SonD s2 = new SonD("megumi");
    }
}

class FatherD{
    public FatherD(){
        System.out.println("Father���޲ι��췽��");
    }

    public FatherD(String name){
        System.out.println("Father�Ĵ��ι��췽��");
    }
}

class SonD extends FatherD{
    public SonD(){
        super();
        System.out.println("Son���޲ι��췽��");
    }

    public SonD(String name){
        super();
        System.out.println("Son�Ĵ��ι��췽��");
    }
}

