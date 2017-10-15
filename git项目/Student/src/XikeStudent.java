  /**
 * Title: XikeStudent.java    
 * Description: ���һ��ѧ����Student
 * @author ��1503�� ������       
 * @created 2017��10��15�� ����12:07:05    
 */

public class XikeStudent {


	public static void main(String args[]) {
		Student stu=new Student("����",17,"����");
		stu.show();
		System.out.print("-------------");
		System.out.println();
		Undergraduate under=new Undergraduate("����",18,"����","��");
		under.show();
		System.out.print("-------------");
		System.out.println();
		Graduate gra=new Graduate("������",20,"˶ʿ","�˹�����");
		gra.show();
		
	}

}
	class Student{
		String name;
		int age;
		String education;
		Student(String name,int age,String education){
			this.name=name;
			this.age=age;
			this.education=education;
		}
		public void show() {
			System.out.println("������"+name+" "+"���䣺"+age+" "+"ѧ����"+education);
		}
	}
	class Undergraduate extends Student{
		String specialty;
		Undergraduate(String name,int age,String education,String specialty){
			super(name,age,education);
			this.specialty=specialty;
		
		}
		public void show() {
			super.show();
			System.out.println("רҵ��"+specialty);
		}
	}
	class Graduate extends Student{
		String direction;
		Graduate(String name,int age,String education,String direction){
			super(name,age,education);
			this.direction=direction;
			
			
		}
		public void show() {
			super.show();
			System.out.println("�о�����"+direction);
		}
		
	}
	class TestStudent{//������
		public static void main(String args[]) {
			Student stu=new Student("����",17,"����");
			stu.show();
			System.out.print("-------------");
			System.out.println();
			Undergraduate under=new Undergraduate("����",18,"����","��");
			under.show();
			System.out.print("-------------");
			System.out.println();
			Graduate gra=new Graduate("������",20,"˶ʿ","�˹�����");
			gra.show();
			
		}
	}