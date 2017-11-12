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
	static int []num1 = {1,1,1};  //小货车装载的电视，计算机，洗衣机数目
	static int []num2 = {6,6,6};  //大货车装载的电视，计算机，洗衣机数目
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
   	     System.out.println("小货车可装电视"+num1[0]+"台，计算机"+num1[1]+"台，洗衣机"+ num1[2]+"台。");
   	     System.out.println("小货车装载货物重量"+weightS);
   	     System.out.println("大货车可装电视"+num2[0]+"台，计算机"+num2[1]+"台，洗衣机"+ num2[2]+"台。");
   	     System.out.println("大货车装载货物重量"+weightB);
   	     System.out.println("装载货物总重量为：" + (weightS+weightB));
	}
	

	
}
