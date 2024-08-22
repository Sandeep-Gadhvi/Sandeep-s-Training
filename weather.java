import java.util.Scanner;
public class weather {
	public static void main(String[]args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		switch(n) {
		case 6:case 7:case 8:case 9:
			System.out.println("It is Rainy Season");
		break;
		case 10:case 11:case 12:case 1:
			System.out.println("It is Winter Season");
		break;
		case 2:case 3:case 4:case 5:
			System.out.println("it is Summer Season");
		break;
		
		default :
			System.out.println("It does not depict any season");
			
			
		}
		}
				
			

}
