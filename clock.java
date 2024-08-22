import java.util.Scanner;
public class clock {
	public static void main(String[]args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hours,Minutes and Seconds");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		System.out.println("CLOCK");
		System.out.println("=====");
		
		for(h=h;h<24;h++) {
			for(m=m;m<60;m++) {
				for(s=s;s<60;s++) {
					//System.out.println(h+":"+m+":"+s+"\r");
					System.out.printf("%2d:%2d:%2d\r",h,m,s);
					Thread.sleep(1000);
				}s=0;
			}m=0;
		}h=0;
		System.out.print(h+":"+m+":"+s);
		
	}

}
