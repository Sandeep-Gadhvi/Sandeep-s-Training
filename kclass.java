import java.util.Scanner;

public class kclass {
	public static void main(String[]args) throws Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter hours,minutes and seconds");
	int h=sc.nextInt();
	int m=sc.nextInt();
	int s=sc.nextInt();
	System.out.println("CLOCK");
	System.out.println("hh:mm:ss");
	for(h=h;h<24;h++)
	{
		for(m=m;m<60;m++)
		{
			for(s=s;s<60;s++)
			{
				System.out.printf("%2d:%2d:%2d\r",h,m,s);
				Thread.sleep(1000);
				
			}
		}
		
		
			
	}
	

}
}
