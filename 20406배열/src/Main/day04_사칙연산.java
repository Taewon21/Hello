package Main;

import java.util.Scanner;

public class day04_��Ģ���� {

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
			System.out.print("������");
			opp = sc.next();
			op = opp.charAt(0); // ���ڿ� opp���� 0��° ���� �ϳ��� �б�
			if (op == '+')
				System.out.println(a + opp + b + "=" + (a + b));
			else if (opp.equals("-"))
				System.out.println(a + opp + b + "=" + (a - b));
			else if (opp.equals("*"))
				System.out.println(a + opp + b + "=" + (a * b));
			else if (opp.equals("/"))
				System.out.println(a + opp + b + "=" + (a / b));
			else
				System.out.println("������ �����Դϴ�.");
			switch (op) {
			case '+':
			case '-':
			{
				System.out.println("��������");
			} break;
			case '*':
			case '/':
			{
				System.out.println("��������");
			}
				break;

			}
		}
	}
}