/*
    �����ǣ��Ҳ�����Ҫ����ֲ���Χ��num����Ҫ�����Ա��Χ��num����ô����
    �һ���Ҫ��������Ա��Χ��num����ô���أ�
        �����һ��������this���ƣ����ǿ��Է��ʸ�������ݾͺ��ˡ�
        ����ؼ��־���super��

    this��super������
        �ֱ���ʲô��
            this�������Ӧ�����á�
            super������洢�ռ�ı�ʶ���������Ϊ�������ã����Բ�������ĳ�Ա��

        ��ô�����أ�
            A:���ó�Ա����
                this.��Ա����   ���ñ���ĳ�Ա����
                super.��Ա����  ���ø���ĳ�Ա����
            B:���ù��췽��
                this(...)   ���ñ���Ĺ��췽��
                super(...)  ���ø���Ĺ��췽��
            C:���ó�Ա����
                this.��Ա����   ���ñ���ĳ�Ա����
                super.��Ա����  ���ø���ĳ�Ա����
 */
public class Inheritance5 {
    public static void main(String[] args) {
        SonC s = new SonC();

        s.show();
    }
}

class FatherC{
    public int num = 10;
}

class SonC extends FatherC{
    public int num = 20;

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
