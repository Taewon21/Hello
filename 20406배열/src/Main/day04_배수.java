package Main;

import java.util.Scanner;

public class day04_배수 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 입력:");
			a = sc.nextInt();
			System.out.println("배수");
			b = sc.nextInt();
			switch (a % b) {
			case 0: {
				System.out.println(a + "은(는)" + b+"의배수입니다");
				break;
			}
			default:
				System.out.println(a + "은(는)" + b +" __의배수가 아닙니다");

			}
		}

	}

}
