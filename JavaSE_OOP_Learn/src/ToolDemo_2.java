/**
 * �������������в����Ĺ�����
 * @author megumi
 * @version 1.0
 *
 */

public class ToolDemo_2{
    //�ѹ��췽��˽�У����Ͳ����ٴ���������

    /**
     * ����˽�й���
     */
    private ToolDemo_2(){}

    /**
     * ���Ǳ�������ķ�����������ĸ�ʽ�ǣ�[Ԫ��1�� Ԫ��2�� Ԫ��3...]
     * @param arr ����Ҫ������������
     */
    public static void printArry(int[] arr){
        for(int x = 0; x < arr.length; x++){
            if(x == arr.length-1){
                System.out.println(arr[x]);
            }else{
                System.out.print(arr[x] + ",");
            }
        }
    }

    /**
     * ���������л�ȡ���ֵ�ķ���
     * @param arr ����Ҫ��ȡ���ֵ������
     * @return ���������е����ֵ
     */
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    /**
     * ���ǻ�ȡָ��Ԫ���������е�һ�γ��ֵ����������Ԫ�ز����ھͷ���-1
     * @param arr �����ҵ�����
     * @param value Ҫ���ҵ�Ԫ��
     * @return ����Ԫ���������е���������������ڣ��򷵻�-1
     */
    public static int getIndex(int[] arr, int value) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        return index;
    }
}