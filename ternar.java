import java.util.Scanner;
public class ternar {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first and second numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int max;
		System.out.println("First number:"+n1);
		System.out.println("Second numnber:"+n2);
		max = (n1>n2)? n1:n2;
		System.out.println("Greatest number is:"+max);
		
	}

}
