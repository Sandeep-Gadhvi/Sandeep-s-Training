import java.util.Scanner;
public class age {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person");
		int n = sc.nextInt();
		if(n>18)
			System.out.println("The person is eligible to vote");
		else
			System.out.println("The person is not eligible to vote");
		
	}

}
