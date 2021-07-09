package Main;

import java.util.Scanner;

public class day04_학과코드 {

	public static void main(String[] args) {
		int[] arg = new int[5];
		/*int code;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("학과코드 입력");
			code = sc.nextInt();

			if (code == 1)
				System.out.println("설계과");
			else if (code == 2)
				System.out.println("제어과");
			else if (code == 3)
				System.out.println("시스템과");
			else if (code == 4)
				System.out.println("정보통신과");
			else
				System.out.println("다시입력하세요");}
	*/
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		int a, b ;
		a = arg[0];
		b = arg[1];
		System.out.println("문자열 " + arg[0]+ arg[1]);
		System.out.println("문자" +  (a+b));
		
		

	}

}
