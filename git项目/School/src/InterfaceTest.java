   
	 /**     
     * @discription �ڴ�����һ�仰�������ļ�������
     * @author ��1503�� ������          
     * @created 2017��11��12�� ����7:22:31    
     * tags     
     * see_to_target     
     */

/**        
 * Title: InterfaceTest.java    
 * Description: ����
 * @author ��1503�� ������       
 * @created 2017��11��12�� ����7:22:31    
 */
class Graduate implements StudentManageInterface,TeacherManageInterface{
	private String name;
	private String sex;
	private int age;
	 double fee;
	 double pay;
	 String n;
	 String s;
	 int a;
	Graduate(String n,String s,int a){
		this.name=n;
		this.sex=s;
		this.age=a;
		setFee(4500);
		setPay(10000);
		pay=12*getPay();
		fee=2*getFee();
		getName();
		getSex();
		getAge();
	}
		 public void setFee(double f){
				fee = f;
			 }
			 public double getFee() {
				 return fee;
			 }
			 public void setPay(double p) {
				 pay = p;
			 }
			public double getPay() {
				return pay;
		
		
}
			public void getName() {
				 n=name;
			}
			public void getSex() {
				 s=sex;
			}
			public void getAge() {
				 a=age;
			}
}
public class InterfaceTest {
	public static void main(String args[]) {
		Graduate g=new Graduate("zhangsan","��",20);
		System.out.println("name:"+g.n+"  sex:"+g.s+"  age:"+g.a);
		if(g.pay-g.fee<=2000)
		System.out.println("provide a loan!");
		else 
		System.out.println("need not a loan!");
		
	}
}
