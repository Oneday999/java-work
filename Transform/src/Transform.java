
/**        
 * Title: Transform.java    
 * Description: 将十六进制数转换为十进制
 * @author 软工1503班 霍星宇       
 * @created 2017年11月20日 下午5:42:31    
 */
import java.util.Scanner;
public class Transform {

    public static void main(String[] args) {

        determine();
    }

    //判断输入的数字是否为十六进制，
    //如果是，就转换成十进制输出，否则重新输入
    public static void determine() {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("\n请输入一个十六进制数:\n");
            String str = scan.next();
            int n = Integer.parseInt(str, 16);//将十六进制数转换为十进制数
            System.out.println("十进制数:" + str + "，转换成十进制数是:" + n );
            }
                catch (Exception e) {

                e.printStackTrace();
                System.err.println(":请重新输入一个十六进制数\n");
                System.out.println();
                determine();
            } 
    }

}