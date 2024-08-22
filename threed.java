
public class threed {
	public static void main(String[]args) throws Exception {
		int a[][]=new int[3][3];
		a[0][0] = 4;
		a[0][1] = 1;
		a[0][2] = 5;
		a[1][0] = 8;
		a[1][1] = 12;
		a[1][2] = 44;
		a[2][0] = 22;
		a[2][1] = 7;
		a[2][2] = 10;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
	}

}
