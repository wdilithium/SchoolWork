import java.util.Scanner;
public class Car
{
   public static void main(String[] args)
    {
       int i = 0;
	int num = 10;           //汽车总数
	Scanner input = new Scanner(System.in);
	Car[] array = new Car[num];
	
	//输入汽车信息，包括 型号 油箱 油耗。
	for (i = 0; i < num; i++)
	  {
	        array[i] = new Car();
               System.out.println("NO." + (i + 1) );
	        System.out.println("Car Mark：");
	        array[i].Mark = input.next();
	        System.out.println("Car Tank：");
	        array[i].Tank = input.nextDouble();
	        System.out.println("Car OilConsumption：");
	        array[i].OilConsumption= input.nextDouble();
	  }
	
	System.out.println("  ");
	
	//输出车辆信息
	for (i = 0; i < num; i++)
           {
	        System.out.println("NO." + (i + 1) );
	        System.out.println("Car Mark：" + array[i].Mark + "  " + 
				   "Car Tank：" + array[i].Tank + "  " + 
				   "Car OilConsumption：" + array[i].OilConsumption
				   );
		System.out.println("  ");
           }
        }
        public String Mark;//汽车型号
        public double Tank;//当前油量（L）
        public double OilConsumption;//油耗（L/100Km）
       
}
