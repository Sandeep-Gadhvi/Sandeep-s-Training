import java.util.Scanner;
public class multi {
	public static void main(String[]args)
	{
		Scanner sm = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sm.nextInt();
		for(int i=1;i<=10;++i) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
		}
			
	}

}
