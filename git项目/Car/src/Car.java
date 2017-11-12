class Television implements ComputeWeight{
	public int computeWeight() {
		return 3;
	}
}
class Computer implements ComputeWeight{
	public int computeWeight() {
		return 2;
	}
}
class WashMachine implements ComputeWeight{
	public int computeWeight() {
		return 6;
	
}
}
public class Car {
	static int []num1 = {1,1,1};  //С����װ�صĵ��ӣ��������ϴ�»���Ŀ
	static int []num2 = {6,6,6};  //�����װ�صĵ��ӣ��������ϴ�»���Ŀ
	public static void main(String[]args) {
		ComputeWeight[]weight = new ComputeWeight[3];
   	     weight[0] = new Television();
   	     weight[1] = new Computer();
   	     weight[2] = new WashMachine();
   	     double weightS = 0 ,weightB = 0;
   	     for(int i= 0 ;i < 3;i++)
   	     {
   	    	 weightS += num1[i] * weight[i].computeWeight();
   	    	 weightB += num2[i] * weight[i].computeWeight();
   	     }
   	     System.out.println("С������װ����"+num1[0]+"̨�������"+num1[1]+"̨��ϴ�»�"+ num1[2]+"̨��");
   	     System.out.println("С����װ�ػ�������"+weightS);
   	     System.out.println("�������װ����"+num2[0]+"̨�������"+num2[1]+"̨��ϴ�»�"+ num2[2]+"̨��");
   	     System.out.println("�����װ�ػ�������"+weightB);
   	     System.out.println("װ�ػ���������Ϊ��" + (weightS+weightB));
	}
	

	
}
