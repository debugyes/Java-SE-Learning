/*
    �̳��г�Ա�����Ĺ�ϵ��
        A:�����еķ����͸����еķ���������һ��
        B:�����еķ����͸����еķ�������һ��
            ͨ��������÷�����
                a:���������У�����û���������
                b:�ٿ�������û�У����û�оͱ���
 */

public class Inheritance8 {
    public static void main(String[] args){
        SonF s = new SonF();

        s.method();
        s.show();
    }
}

class FatherF{
    public void show(){
        System.out.println("show Father");
    }
}

class SonF extends FatherF{
    public void show(){
        System.out.println("show Son");
    }

    public void method(){
        System.out.println("method Son");
    }
}