package Main;

import java.util.Scanner;

public class day04_사칙연산 {

	public static void main(String[] args) {
		int a, b;
		char op = '*';
		String opp;
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("A :");
			a = sc.nextInt();

			System.out.print("B :");
			b = sc.nextInt();
			System.out.print("연산자");
			opp = sc.next();
			op = opp.charAt(0); // 문자열 opp에서 0번째 문자 하나만 읽기
			if (op == '+')
				System.out.println(a + opp + b + "=" + (a + b));
			else if (opp.equals("-"))
				System.out.println(a + opp + b + "=" + (a - b));
			else if (opp.equals("*"))
				System.out.println(a + opp + b + "=" + (a * b));
			else if (opp.equals("/"))
				System.out.println(a + opp + b + "=" + (a / b));
			else
				System.out.println("연산자 오류입니다.");
			switch (op) {
			case '+':
			case '-':
			{
				System.out.println("가감연산");
			} break;
			case '*':
			case '/':
			{
				System.out.println("승제연산");
			}
				break;

			}
		}
	}
}