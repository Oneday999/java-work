import java.util.Scanner;

/**     
     * @discription ģ�����ж��ڴ���
     * @author ��1503�� ������          
     * @created 2017��10��14�� ����7:08:12    
     * tags     
     * see_to_target     
     */

/**        
 * Title: BankAccount.java    
 * Description: ģ�����ж��ڴ���
 * @author ��1503�� ������       
 * @created 2017��10��14�� ����7:08:12    
 */

public class BankAccount {

	/**     
	     * @discription ģ�����ж��ڴ���
	     * @author ��1503�� ������          
	     * @created 2017��10��14�� ����7:08:12     
	     * @param args     
	     */
	private String account;//�˻�
	private String username;//�û���
	private double balance;
	static double rate=0.023;
	public static void main(String args[]) {
		BankAccount saver=new BankAccount("1234567890","zhangsan",5000.0);
		saver.query();
		saver.deposit();
		saver.interest();
	  }
	BankAccount(String account,String name,double ba){
		this.account=account;
		this.username=name;
		this.balance=ba;
	}
public void newaccount(){//����
	Scanner in=new Scanner(System.in);
	System.out.println("�������û�����");
	String name=in.next();
	System.out.println("�������˺ţ�");
	String account=in.next();
	this.username=name;
	this.account=account;
	this.balance=0;	
	}
public void deposit(){//���
	Scanner in=new Scanner(System.in);
	System.out.println("���������");
	double n=in.nextDouble();
	balance=balance+n;
	System.out.println("�˻���"+balance);
	
}
public void query(){//��ѯ
	System.out.println("�˻���"+account);
	System.out.println("�û�����"+username);
	System.out.println("��"+balance);
	System.out.println("�����ʣ�"+rate);
}
public void interest(){//������Ϣ
	double yearrate=balance*rate;
	double mounthrate=yearrate/12;
	System.out.println("����Ϣ��"+yearrate);
	System.out.println("����Ϣ��"+String.format("%2.2f",mounthrate));
}
}

