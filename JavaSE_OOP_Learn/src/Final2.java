/*
    final���������࣬����������

    �ص㣺
        final�����࣬���಻�ܱ��̳�
        final���η������÷������ܱ���д
        final���α������ñ������ܱ���д��ֵ����Ϊ���������ʵ���ǳ���

    ������
        A:����ֵ����
            "hello" 10 true
        B:�Զ��峣��
            final int x = 10
 */
public class Final2 {

}

class Fu3{
    public int num = 10;
    public final int num2 = 20;
    /*
    public final void show(){

    }
     */

}

class Zi3 extends Fu3{
    public void show(){
        System.out.println(num);
        num = 20;
        System.out.println(num2);
        //num2 = 10;
    }
}