/*
    �̳еĴ�������

    ���ڼ̳��з�����һ�����󣺷�����д
    ���ԣ�����Ĺ��ܾͻᱻ��������ǵ�
    ��Щʱ�����ǲ���������ȥ���ǵ�����Ĺ��ܣ�ֻ������ʹ�á�
    ���ʱ��������������Java���ṩ��һ���ؼ��֣�final

    final�����յ���˼���������������������࣬����������

 */
public class Final1 {
    public static void main(String[] args) {
        Zi2 z = new Zi2();

        z.show();

    }
}

class Fu2{
    public Fu2(){

    }

    public final void show(){
        System.out.println("���Ǿ�����Դ���κ��˶������޸�");
    }
}

class Zi2 extends Fu2{
    //Zi�е�show()�޷�����FU�е�show()
    /*
    public void show(){
        System.out.println("����һ������");
    }
     */


}



