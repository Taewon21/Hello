package Main;

public class day03_2차원배열 {

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 10;
		a[1][1] = 20;
		a[1][2] = 30;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < 3; j++)
				System.out.print(a[i][j] + "\t");
			
	}

}
