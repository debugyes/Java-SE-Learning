/*
    Java�м̳е��ص㣺
        A:Java��ֻ֧�ֵ��̳У���֧�ֶ�̳�
            ��Щ������֧�ֶ�̳еģ���ʽ��extends ��1����2��...
        B:Java֧�ֶ��̳�

 */
public class Inheritance2 {
    public static void main(String[] args) {
        Son s = new Son();

        s.method();//ʹ�ø��׵�
        s.show();//ʹ��үү��
    }
}

class GrandFather{
    public void show() {
        System.out.println("����үү");
    }
}

class Father extends GrandFather{
    public void method() {
        System.out.println("���ǰְ�");
    }
}

class Son extends Father{

}
