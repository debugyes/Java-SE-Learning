/*
    ������С��Ϸ��������1-100��֮��

    ������
        A:�������һ���������
        B:����¼�����ݡ�����µģ�
        C:��µĺͱ��µĽ��бȽ�
            a:����
            b:С��
            c:������
        D:�����¶�εĻ��ᣬ���оͽ�����
            while()ѭ��������break
 */
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;
        //����¼��
        Scanner sc = new Scanner(System.in);


        while (true)
        {   System.out.println("��������Ҫ�µ����ݣ���1-100��");
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("��µ�����" + guessNumber + "����");
            } else if (guessNumber < number) {
                System.out.println("��µ�����" + guessNumber + "С��");
            } else {
                System.out.println("��ϲ����������");
                break;
            }
        }

    }
}
