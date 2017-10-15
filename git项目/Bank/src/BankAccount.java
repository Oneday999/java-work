import java.util.Scanner;

/**     
     * @discription 模拟银行定期存款功能
     * @author 软工1503班 霍星宇          
     * @created 2017年10月14日 下午7:08:12    
     * tags     
     * see_to_target     
     */

/**        
 * Title: BankAccount.java    
 * Description: 模拟银行定期存款功能
 * @author 软工1503班 霍星宇       
 * @created 2017年10月14日 下午7:08:12    
 */

public class BankAccount {

	/**     
	     * @discription 模拟银行定期存款功能
	     * @author 软工1503班 霍星宇          
	     * @created 2017年10月14日 下午7:08:12     
	     * @param args     
	     */
	private String account;//账户
	private String username;//用户名
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
public void newaccount(){//开户
	Scanner in=new Scanner(System.in);
	System.out.println("请输入用户名：");
	String name=in.next();
	System.out.println("请输入账号：");
	String account=in.next();
	this.username=name;
	this.account=account;
	this.balance=0;	
	}
public void deposit(){//存款
	Scanner in=new Scanner(System.in);
	System.out.println("请输入存款金额：");
	double n=in.nextDouble();
	balance=balance+n;
	System.out.println("账户余额："+balance);
	
}
public void query(){//查询
	System.out.println("账户："+account);
	System.out.println("用户名："+username);
	System.out.println("余额："+balance);
	System.out.println("年利率："+rate);
}
public void interest(){//计算利息
	double yearrate=balance*rate;
	double mounthrate=yearrate/12;
	System.out.println("年利息："+yearrate);
	System.out.println("月利息："+String.format("%2.2f",mounthrate));
}
}

