/*
    ������1��������д���
    A:��Ա�������ͽ�ԭ��
    B:this��super������
        this���ʱ���ĳ�Ա
        super���ʸ���ĳ�Ա
    C:���๹�췽��ִ��ǰĬ����ִ�и�����޲ι��췽��
    D:һ����ĳ�ʼ������
        ��Ա�����ĳ�ʼ��
            Ĭ�ϳ�ʼ��
            ��ʾ��ʼ��
            ���췽����ʼ��
 */
public class InheritanceInterview1 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu{
    public int num = 10;
    public Fu(){
        System.out.println("fu");
    }
}

class Zi extends Fu{
    public int num = 20;
    public Zi(){
        System.out.println("zi");
    }

    public void show(){
        int num = 30;
        System.out.println(num);//30
        System.out.println(this.num);//20��
        System.out.println(super.num);//30
    }
}
