
/**        
 * Title: Transform.java    
 * Description: ��ʮ��������ת��Ϊʮ����
 * @author ��1503�� ������       
 * @created 2017��11��20�� ����5:42:31    
 */
import java.util.Scanner;
public class Transform {

    public static void main(String[] args) {

        determine();
    }

    //�ж�����������Ƿ�Ϊʮ�����ƣ�
    //����ǣ���ת����ʮ���������������������
    public static void determine() {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("\n������һ��ʮ��������:\n");
            String str = scan.next();
            int n = Integer.parseInt(str, 16);//��ʮ��������ת��Ϊʮ������
            System.out.println("ʮ������:" + str + "��ת����ʮ��������:" + n );
            }
                catch (Exception e) {

                e.printStackTrace();
                System.err.println(":����������һ��ʮ��������\n");
                System.out.println();
                determine();
            } 
    }

}