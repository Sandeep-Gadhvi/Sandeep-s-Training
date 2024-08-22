 abstract class vision{
	 abstract void see();
	 void hear() {		 
		 System.out.println("The person is not deaf");		 
	 }
 }
class listen extends vision{
	void see() {
		System.out.println("The person can now see clearly");		
	}
}


public class abclass {
	public static void main(String[]args) {
		listen l=new listen();
		l.see();
		l.hear();		
		
	}

}
