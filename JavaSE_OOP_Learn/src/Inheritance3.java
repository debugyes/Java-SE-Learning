/*
    �̳е�ע�����
        A:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
        B:��ʵ��Ҳ�����˼̳е���һ���׶ˣ������˷�װ��
        C:���಻�ܼ̳и���Ĺ��췽����������ͨ��super�ؼ���ȥ���ʸ��๹�췽����
        D:��ҪΪ�˲��ֹ��ܶ�ȥ�̳�

    ʲôʱ����ü̳�
        �̳���ʵ���ֵ���һ�ֹ�ϵ��is a��
        ���ü��跨

 */
public class Inheritance3 {
    public static void main(String[] args){
        SonA s = new SonA();
        //s.method();
        s.show();
        s.function();
    }
}

class FatherA{
    private int num = 10;
    public int num2 = 100;

    private void method() {
        System.out.println(num);
        System.out.println(num2);
    }

    public void show(){
        System.out.println(num);
        System.out.println(num2);
    }
}

class SonA extends FatherA{
    public void function(){
        //System.out.println(num);
        System.out.println(num2);
    }
}
