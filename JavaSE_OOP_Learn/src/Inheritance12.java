/*
    ��ʦ��ѧ������

    ѧ����
        ��Ա����������������
        ���췽�����޲�
        ��Ա������getXxx()/setXxx()
    ��ʦ��
        ��Ա����������������
        ���췽�����޲�
        ��Ա������getXxx()/setXxx()

    ������������ĳ�Ա�������˺ܶ���ͬ�Ķ������������ǾͿ��ǳ�ȡһ�����Ե��ࣺ
    �ˣ�
        ��Ա����������������
        ���췽�����޲�
        ��Ա������getXxx()/setXxx()

    ��ʦ�̳� ��
    ѧ���̳� ��
 */
public class Inheritance12 {
    public static void main(String[] args){
        //��ʽ1
        StudentL s = new StudentL();
        s.setAge(18);
        s.setName("megumi");
        System.out.println(s.getAge() + "---" + s.getName());

        //��ʽ2
        StudentL s2 = new StudentL("megumi", 18);
        System.out.println(s2.getAge() + "---" + s2.getName());


        TeacherL t = new TeacherL("alex", 20);
        System.out.println(t.getAge() + "---" + t.getName());
        System.out.println(s2.getAge() + "---" + s2.getName());
    }
}

class PersonA{
    private String name;
    private int age;

    public PersonA(){

    }

    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class StudentL extends PersonA{
    public StudentL(){

    }
    public StudentL(String name, int age){
        super(name, age);
    }
}

class TeacherL extends PersonA{
    public TeacherL(){

    }

    public TeacherL(String name, int age){
        super(name, age);
    }
}