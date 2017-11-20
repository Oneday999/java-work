
 /** 
      * Title: Date.java    
      * Description: 描述
      * @author 软工1503班 霍星宇       
      * @created 2017年11月20日 下午6:00:31
  */
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class Date {

    public static void main(String[] args) {

        date();
    }

    //判断输入的日期字符串是否符合yyyy/mm/dd的格式
    public static void date() {

        try {

            System.out.println("请输入 "+"yyyy/mm/dd"+" 格式的日期：");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            java.util. Date d = new SimpleDateFormat("yyyy/mm/dd").parse(str);//将日期字符串转换为日期对象
            System.out.println(d);
            }
               catch (Exception e) {

               e.printStackTrace();
               System.out.println("输入的格式有误，请重新输入：");
               date();
            }
            }
}