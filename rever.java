import java.util.Scanner;
public class rever { 
	public static void main(String[]args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = r.nextInt();
		int rev = 0;  
		while(n!= 0)   
		{  
		int remainder = n % 10;  
		rev = rev* 10 + remainder;  
		n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev); 
	}

}
