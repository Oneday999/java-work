  /**
 * Title: XikeStudent.java    
 * Description: 设计一个学生类Student
 * @author 软工1503班 霍星宇       
 * @created 2017年10月15日 上午12:07:05    
 */

public class XikeStudent {


	public static void main(String args[]) {
		Student stu=new Student("张三",17,"高中");
		stu.show();
		System.out.print("-------------");
		System.out.println();
		Undergraduate under=new Undergraduate("李四",18,"本科","软工");
		under.show();
		System.out.print("-------------");
		System.out.println();
		Graduate gra=new Graduate("王麻子",20,"硕士","人工智能");
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
			System.out.println("姓名："+name+" "+"年龄："+age+" "+"学历："+education);
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
			System.out.println("专业："+specialty);
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
			System.out.println("研究方向："+direction);
		}
		
	}
	class TestStudent{//测试类
		public static void main(String args[]) {
			Student stu=new Student("张三",17,"高中");
			stu.show();
			System.out.print("-------------");
			System.out.println();
			Undergraduate under=new Undergraduate("李四",18,"本科","软工");
			under.show();
			System.out.print("-------------");
			System.out.println();
			Graduate gra=new Graduate("王麻子",20,"硕士","人工智能");
			gra.show();
			
		}
	}