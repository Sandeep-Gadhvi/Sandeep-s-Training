class india{
	void rule() {
		System.out.println("India has Democratic rule");
	}
	
}

class us extends india {
	void rule() {
		super.rule();
		System.out.println("US has Presidential rule");
	}
}


public class overriden {
	public static void main(String[]args) {
		us r=new us();
		r.rule();
	}
} 
