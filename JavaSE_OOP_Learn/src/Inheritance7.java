/*
    �������û���޲ι��췽������ô����Ĺ��췽�������ʲô�����أ���ν���أ�

    A:�ڸ����м�һ���޲ι��췽��
    B:ͨ��ʹ��super�ؼ���ȥ��ʾ�ĵ��ø���Ĵ��ι��췽��
    C:����ͨ��thisȥ���ñ�����޲ι���
        ������һ��Ҫ��һ��ȥ�����˸���Ĺ��췽�������������ݾ�û�г�ʼ����


    ע�����
        this(...)����super(...)��������ڵ�һ������λ��
        ������Ƿ��ڵ�һ������ϣ��Ϳ��ܶԸ�������ݽ��ж�γ�ʼ��
*/
public class Inheritance7 {
    public static void main(String[] args){

    }
}

class FatherE{
    /*
    public FatherE(){
        System.out.println("Father���޲ι��췽��");
    }

     */
    public FatherE(String name){
        System.out.println("Father�Ĵ��ι��췽��");
    }
}

class SonE extends FatherE{
    public SonE(){
        super("Megumi");
        System.out.println("Son���޲ι��췽��");
    }

    public SonE(String name){
        //super("Megumi");
        this();
        System.out.println("Son�Ĵ��ι��췽��");
    }
}
