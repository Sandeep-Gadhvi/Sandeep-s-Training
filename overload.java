
public class overload {
		void sports(int c)
		{
			System.out.println("Cricket Players :"+c);
			
		}
		void sports(String f)
		{
			System.out.println("Football Icon:"+f);			
		}
		
		void sports(long b) {
			System.out.println("BasketBall Fans:"+b);
		}
		public static void main(String[]args) {
			overload s=new overload();
			s.sports(11);
			s.sports("Messi");
			s.sports(81000l);
					
	}

}
