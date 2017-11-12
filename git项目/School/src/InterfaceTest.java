   
	 /**     
     * @discription 在此输入一句话描述此文件的作用
     * @author 软工1503班 霍星宇          
     * @created 2017年11月12日 下午7:22:31    
     * tags     
     * see_to_target     
     */

/**        
 * Title: InterfaceTest.java    
 * Description: 描述
 * @author 软工1503班 霍星宇       
 * @created 2017年11月12日 下午7:22:31    
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
		Graduate g=new Graduate("zhangsan","男",20);
		System.out.println("name:"+g.n+"  sex:"+g.s+"  age:"+g.a);
		if(g.pay-g.fee<=2000)
		System.out.println("provide a loan!");
		else 
		System.out.println("need not a loan!");
		
	}
}
