import java.util.Scanner;
public class excep {
	public static void main(String[]args) throws Exception {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a,b,c");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int result;
			result=(a+b)/c;
			System.out.println("Result:"+result);
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Numerator is not divisible by 0"+ae);			
		}
	}

}
