import java.util.Scanner;
public class vowelcon {
	public static void main(String[]args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any letter");
		char s = sc.next().charAt(0);
		switch(s) {
		case 'a': case 'e': case 'i':case 'o':case 'u':
			
			System.out.println(+s+"is a vowel");
			break;
			
		    default:
		    	
			    System.out.println(+s+ " is a consonant");	
			
		}
	}
}

