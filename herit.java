class student
{
	void learn() {
		System.out.println("The student is copying");	
	}
}

class teacher extends student
{
	void teach() {
		System.out.println("The Teacher is Scolding");
	}
}

public class herit {
	public static void main(String[]args) {
		teacher t = new teacher();
		t.learn();
		t.teach();
	}
}
