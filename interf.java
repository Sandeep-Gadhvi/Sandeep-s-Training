interface T1
{
	void show();
	
}

class Joke implements T1
{
	public void show() {
		System.out.println("Show method called");
	}
	
}

public class interf {
	public static void main(String[]args) {
		Joke j=new Joke();
		j.show();
				
	}

}
