/*
    ������д��ע������
        A:�����е�˽�з������ܱ���д
            ��Ϊ����˽�з�������������޷��̳�
        B:������д���෽��ʱ������Ȩ�޲��ܸ���
            ��þ�һ��
        C:�����о�̬����������Ҳ����ͨ����̬����������д

    ������д���෽����ʱ���������һģһ����
 */

public class Inheritance10 {
    public static void main(String[] args){
        SonG s = new SonG();

        s.show();
    }
}

class FatherG{
    //private void show(){}

    /*
    public void show(){
        System.out.println("show Father");
    }

     */
    void show(){
        System.out.println("show Father");
    }

    public static void method(){

    }
}

class SonG extends FatherG{
    /*
    public void show(){
        System.out.println("show Son");
    }

    void show(){

    }*/
    public static void method(){

    }
}

