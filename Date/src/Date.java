
 /** 
      * Title: Date.java    
      * Description: ����
      * @author ��1503�� ������       
      * @created 2017��11��20�� ����6:00:31
  */
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class Date {

    public static void main(String[] args) {

        date();
    }

    //�ж�����������ַ����Ƿ����yyyy/mm/dd�ĸ�ʽ
    public static void date() {

        try {

            System.out.println("������ "+"yyyy/mm/dd"+" ��ʽ�����ڣ�");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            java.util. Date d = new SimpleDateFormat("yyyy/mm/dd").parse(str);//�������ַ���ת��Ϊ���ڶ���
            System.out.println(d);
            }
               catch (Exception e) {

               e.printStackTrace();
               System.out.println("����ĸ�ʽ�������������룺");
               date();
            }
            }
}